using Twilio.Video.Tracks;
using TwilioVideoRoom.ViewModels;
using Xamarin.Forms;

namespace TwilioVideoRoom
{
    public partial class MainPage : ContentPage
    {
        public MainPage()
        {
            InitializeComponent();
            BindingContext = new VideoChatViewModel(VideoViewWrapper);
        }

        public void ConfigureView()
        {
            var track = LocalVideoTrack.Create(true, true, "Camera");
            track.AddRenderer(VideoViewWrapper.View);
        }
    }
}
