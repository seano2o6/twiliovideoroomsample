package mono.com.twilio.video;


public class CameraCapturer_PictureListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.CameraCapturer.PictureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onPictureTaken:([B)V:GetOnPictureTaken_arrayBHandler:TwilioVideo.CameraCapturer/IPictureListenerInvoker, Twilio.Video.Android\n" +
			"n_onShutter:()V:GetOnShutterHandler:TwilioVideo.CameraCapturer/IPictureListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.CameraCapturer+IPictureListenerImplementor, Twilio.Video.Android", CameraCapturer_PictureListenerImplementor.class, __md_methods);
	}


	public CameraCapturer_PictureListenerImplementor ()
	{
		super ();
		if (getClass () == CameraCapturer_PictureListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.CameraCapturer+IPictureListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onPictureTaken (byte[] p0)
	{
		n_onPictureTaken (p0);
	}

	private native void n_onPictureTaken (byte[] p0);


	public void onShutter ()
	{
		n_onShutter ();
	}

	private native void n_onShutter ();

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
