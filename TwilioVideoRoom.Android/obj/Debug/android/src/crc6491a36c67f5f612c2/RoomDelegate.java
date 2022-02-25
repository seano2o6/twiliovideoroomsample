package crc6491a36c67f5f612c2;


public class RoomDelegate
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.Room.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onConnectFailure:(Lcom/twilio/video/Room;Lcom/twilio/video/TwilioException;)V:GetOnConnectFailure_Lcom_twilio_video_Room_Lcom_twilio_video_TwilioException_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onConnected:(Lcom/twilio/video/Room;)V:GetOnConnected_Lcom_twilio_video_Room_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onDisconnected:(Lcom/twilio/video/Room;Lcom/twilio/video/TwilioException;)V:GetOnDisconnected_Lcom_twilio_video_Room_Lcom_twilio_video_TwilioException_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onDominantSpeakerChanged:(Lcom/twilio/video/Room;Lcom/twilio/video/RemoteParticipant;)V:GetOnDominantSpeakerChanged_Lcom_twilio_video_Room_Lcom_twilio_video_RemoteParticipant_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onParticipantConnected:(Lcom/twilio/video/Room;Lcom/twilio/video/RemoteParticipant;)V:GetOnParticipantConnected_Lcom_twilio_video_Room_Lcom_twilio_video_RemoteParticipant_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onParticipantDisconnected:(Lcom/twilio/video/Room;Lcom/twilio/video/RemoteParticipant;)V:GetOnParticipantDisconnected_Lcom_twilio_video_Room_Lcom_twilio_video_RemoteParticipant_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onReconnected:(Lcom/twilio/video/Room;)V:GetOnReconnected_Lcom_twilio_video_Room_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onReconnecting:(Lcom/twilio/video/Room;Lcom/twilio/video/TwilioException;)V:GetOnReconnecting_Lcom_twilio_video_Room_Lcom_twilio_video_TwilioException_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onRecordingStarted:(Lcom/twilio/video/Room;)V:GetOnRecordingStarted_Lcom_twilio_video_Room_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onRecordingStopped:(Lcom/twilio/video/Room;)V:GetOnRecordingStopped_Lcom_twilio_video_Room_Handler:TwilioVideo.Room/IListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("Twilio.Video.Room.RoomDelegate, Twilio.Video", RoomDelegate.class, __md_methods);
	}


	public RoomDelegate ()
	{
		super ();
		if (getClass () == RoomDelegate.class)
			mono.android.TypeManager.Activate ("Twilio.Video.Room.RoomDelegate, Twilio.Video", "", this, new java.lang.Object[] {  });
	}


	public void onConnectFailure (com.twilio.video.Room p0, com.twilio.video.TwilioException p1)
	{
		n_onConnectFailure (p0, p1);
	}

	private native void n_onConnectFailure (com.twilio.video.Room p0, com.twilio.video.TwilioException p1);


	public void onConnected (com.twilio.video.Room p0)
	{
		n_onConnected (p0);
	}

	private native void n_onConnected (com.twilio.video.Room p0);


	public void onDisconnected (com.twilio.video.Room p0, com.twilio.video.TwilioException p1)
	{
		n_onDisconnected (p0, p1);
	}

	private native void n_onDisconnected (com.twilio.video.Room p0, com.twilio.video.TwilioException p1);


	public void onDominantSpeakerChanged (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1)
	{
		n_onDominantSpeakerChanged (p0, p1);
	}

	private native void n_onDominantSpeakerChanged (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1);


	public void onParticipantConnected (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1)
	{
		n_onParticipantConnected (p0, p1);
	}

	private native void n_onParticipantConnected (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1);


	public void onParticipantDisconnected (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1)
	{
		n_onParticipantDisconnected (p0, p1);
	}

	private native void n_onParticipantDisconnected (com.twilio.video.Room p0, com.twilio.video.RemoteParticipant p1);


	public void onReconnected (com.twilio.video.Room p0)
	{
		n_onReconnected (p0);
	}

	private native void n_onReconnected (com.twilio.video.Room p0);


	public void onReconnecting (com.twilio.video.Room p0, com.twilio.video.TwilioException p1)
	{
		n_onReconnecting (p0, p1);
	}

	private native void n_onReconnecting (com.twilio.video.Room p0, com.twilio.video.TwilioException p1);


	public void onRecordingStarted (com.twilio.video.Room p0)
	{
		n_onRecordingStarted (p0);
	}

	private native void n_onRecordingStarted (com.twilio.video.Room p0);


	public void onRecordingStopped (com.twilio.video.Room p0)
	{
		n_onRecordingStopped (p0);
	}

	private native void n_onRecordingStopped (com.twilio.video.Room p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
