package mono.com.twilio.video;


public class Camera2Capturer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.Camera2Capturer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraSwitched:(Ljava/lang/String;)V:GetOnCameraSwitched_Ljava_lang_String_Handler:TwilioVideo.Camera2Capturer/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onError:(Lcom/twilio/video/Camera2Capturer$Exception;)V:GetOnError_Lcom_twilio_video_Camera2Capturer_Exception_Handler:TwilioVideo.Camera2Capturer/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onFirstFrameAvailable:()V:GetOnFirstFrameAvailableHandler:TwilioVideo.Camera2Capturer/IListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.Camera2Capturer+IListenerImplementor, Twilio.Video.Android", Camera2Capturer_ListenerImplementor.class, __md_methods);
	}


	public Camera2Capturer_ListenerImplementor ()
	{
		super ();
		if (getClass () == Camera2Capturer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.Camera2Capturer+IListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCameraSwitched (java.lang.String p0)
	{
		n_onCameraSwitched (p0);
	}

	private native void n_onCameraSwitched (java.lang.String p0);


	public void onError (com.twilio.video.Camera2Capturer.Exception p0)
	{
		n_onError (p0);
	}

	private native void n_onError (com.twilio.video.Camera2Capturer.Exception p0);


	public void onFirstFrameAvailable ()
	{
		n_onFirstFrameAvailable ();
	}

	private native void n_onFirstFrameAvailable ();

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
