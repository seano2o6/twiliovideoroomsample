package mono.com.twilio.video;


public class VideoCapturer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.VideoCapturer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCapturerStarted:(Z)V:GetOnCapturerStarted_ZHandler:TwilioVideo.IVideoCapturerListenerInvoker, Twilio.Video.Android\n" +
			"n_onFrameCaptured:(Lcom/twilio/video/VideoFrame;)V:GetOnFrameCaptured_Lcom_twilio_video_VideoFrame_Handler:TwilioVideo.IVideoCapturerListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.IVideoCapturerListenerImplementor, Twilio.Video.Android", VideoCapturer_ListenerImplementor.class, __md_methods);
	}


	public VideoCapturer_ListenerImplementor ()
	{
		super ();
		if (getClass () == VideoCapturer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.IVideoCapturerListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCapturerStarted (boolean p0)
	{
		n_onCapturerStarted (p0);
	}

	private native void n_onCapturerStarted (boolean p0);


	public void onFrameCaptured (com.twilio.video.VideoFrame p0)
	{
		n_onFrameCaptured (p0);
	}

	private native void n_onFrameCaptured (com.twilio.video.VideoFrame p0);

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
