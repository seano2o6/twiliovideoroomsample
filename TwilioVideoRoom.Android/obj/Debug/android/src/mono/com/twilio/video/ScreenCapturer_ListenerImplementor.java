package mono.com.twilio.video;


public class ScreenCapturer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.ScreenCapturer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFirstFrameAvailable:()V:GetOnFirstFrameAvailableHandler:TwilioVideo.ScreenCapturer/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onScreenCaptureError:(Ljava/lang/String;)V:GetOnScreenCaptureError_Ljava_lang_String_Handler:TwilioVideo.ScreenCapturer/IListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.ScreenCapturer+IListenerImplementor, Twilio.Video.Android", ScreenCapturer_ListenerImplementor.class, __md_methods);
	}


	public ScreenCapturer_ListenerImplementor ()
	{
		super ();
		if (getClass () == ScreenCapturer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.ScreenCapturer+IListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFirstFrameAvailable ()
	{
		n_onFirstFrameAvailable ();
	}

	private native void n_onFirstFrameAvailable ();


	public void onScreenCaptureError (java.lang.String p0)
	{
		n_onScreenCaptureError (p0);
	}

	private native void n_onScreenCaptureError (java.lang.String p0);

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
