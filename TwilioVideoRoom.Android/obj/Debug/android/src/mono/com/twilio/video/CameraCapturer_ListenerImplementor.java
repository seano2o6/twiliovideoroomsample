package mono.com.twilio.video;


public class CameraCapturer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.CameraCapturer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCameraSwitched:()V:GetOnCameraSwitchedHandler:TwilioVideo.CameraCapturer/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onError:(I)V:GetOnError_IHandler:TwilioVideo.CameraCapturer/IListenerInvoker, Twilio.Video.Android\n" +
			"n_onFirstFrameAvailable:()V:GetOnFirstFrameAvailableHandler:TwilioVideo.CameraCapturer/IListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.CameraCapturer+IListenerImplementor, Twilio.Video.Android", CameraCapturer_ListenerImplementor.class, __md_methods);
	}


	public CameraCapturer_ListenerImplementor ()
	{
		super ();
		if (getClass () == CameraCapturer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.CameraCapturer+IListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCameraSwitched ()
	{
		n_onCameraSwitched ();
	}

	private native void n_onCameraSwitched ();


	public void onError (int p0)
	{
		n_onError (p0);
	}

	private native void n_onError (int p0);


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
