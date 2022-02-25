using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using Twilio;
using Twilio.Jwt.AccessToken;
using Twilio.Rest.Video.V1;
using Twilio.Video.Participant;
using Twilio.Video.Room;
using Twilio.Video.Tracks;
using System.Linq;
using Twilio.Video.VideoView;
using Twilio.Video.Participant.Delegates;
using Twilio.Video.Participant.abstractions;
using Xamarin.Essentials;

namespace TwilioVideoRoom.ViewModels
{
    public class VideoChatViewModel 
    {
        private VideoViewWrapper VideoView;
        public VideoChatViewModel(VideoViewWrapper videoView)
        {
            VideoView = videoView;

            CreateVideoRoom();
        }

        public IRoom VideoRoom { get; set; }

        public async Task CreateVideoRoom()
        {
            string accountSid = "X";
            string twilioAuthToken = "X";
            string twilioApiName = "X";
            string twilioSecret = "X";

            TwilioClient.Init(accountSid, twilioAuthToken);

            var room = await RoomResource.CreateAsync(new CreateRoomOptions { RecordParticipantsOnConnect = false, UnusedRoomTimeout = 5 });


            var accessToken = GetToken(room.Sid, accountSid, twilioApiName, twilioSecret);

            await ConnectToRoom(room.Sid, accessToken);
        }

        public async Task OnDisappearing()
        {
            
            VideoRoom.Disconnect();
            await Task.CompletedTask;
        }

        private async Task ConnectToRoom(string roomSid, string accessToken)
        {
            try
            {
                var test = await GrantMicrophonePermission();
                if (await GrantCameraPermission())
                {
                    var localAudioTrack = LocalAudioTrack.Create(true, "Microphone");
                    var localVideoTrack = LocalVideoTrack.Create(true, true, "Camera");
                    var roomDelegate = new RoomDelegate();
                    roomDelegate.RoomParticipantDidConnectEvent += RoomParticipantDidConnectEvent_handler;
                    roomDelegate.DidConnectToRoomEvent += DidConnectToRoomEvent_handler;
                    roomDelegate.RoomParticipantDidDisconnectEvent += RoomDelegate_RoomParticipantDidDisconnectEvent;

                    VideoRoom = RoomBuilder.BuildRoom(
                        accessToken, roomSid, new ILocalAudioTrack[1] { localAudioTrack },
                        new ILocalVideoTrack[1] { localVideoTrack },
                        roomDelegate);
                }

            }
            catch (Exception ex)
            {
                bool test = true;
            }
        }

        private void RoomDelegate_RoomParticipantDidDisconnectEvent(object sender, (IRoom room, RemoteParticipant participant) e)
        {
            bool test = true;

        }

        private string GetToken(string roomSid, string twilioSid, string twilioKey, string twilioSecret)
        {
            // These are specific to Video
            const string identity = "user";

            // Create a Video grant for this token
            var grant = new VideoGrant { Room = roomSid };

            var grants = new HashSet<IGrant> { grant };

            // Create an Access Token generator
            var token = new Token(
                twilioSid,
                twilioKey,
                twilioSecret,
                identity: identity,
                grants: grants);

            return token.ToJwt();
        }

        private void RoomParticipantDidConnectEvent_handler(object sender, (IRoom room, RemoteParticipant participant) e)
        {
            var remoteDeligate = new RemoteParticipantDelegate();
            SubscribeToEvents(remoteDeligate);
            ((IRemoteParticipant)e.participant).Delegate = remoteDeligate;
        }

        private void SubscribeToEvents(RemoteParticipantDelegate remoteParticipantDelegate)
        {
            remoteParticipantDelegate.SubscribedToVideoTrackEvent += RemoteParticipantDelegate_SubscribedToVideoTrackEvent;
        }

        private void RemoteParticipantDelegate_SubscribedToVideoTrackEvent(object sender, (IVideoTrack videoTrack, IRemoteParticipant participant) e)
        {
            var videoTrack = e.videoTrack;
            videoTrack.AddRenderer(VideoView.View);
        }

        private void DidConnectToRoomEvent_handler(object sender, IRoom e)
        {
            var test = e.LocalParticipant.GetVideoTracks();
            var testig = test.FirstOrDefault();
            testig.AddRenderer(VideoView.View);
        }

        private async Task<bool> GrantCameraPermission()
        {
            var currentStatus = await Permissions.CheckStatusAsync<Permissions.Camera>();

            if (currentStatus != PermissionStatus.Granted)
            {
                await Permissions.RequestAsync<Permissions.Camera>();
            }

            var newStatus = await Permissions.CheckStatusAsync<Permissions.Camera>();
            return newStatus == PermissionStatus.Granted;
        }

        private async Task<bool> GrantMicrophonePermission()
        {
            var currentStatus = await Permissions.CheckStatusAsync<Permissions.Microphone>();

            if (currentStatus != PermissionStatus.Granted)
            {
                await Permissions.RequestAsync<Permissions.Microphone>();
            }

            var newStatus = await Permissions.CheckStatusAsync<Permissions.Microphone>();
            return newStatus == PermissionStatus.Granted;
        }
    }
}
