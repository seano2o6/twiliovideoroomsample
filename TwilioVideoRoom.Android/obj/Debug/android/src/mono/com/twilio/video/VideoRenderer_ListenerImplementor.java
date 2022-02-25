package mono.com.twilio.video;


public class VideoRenderer_ListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.VideoRenderer.Listener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFirstFrame:()V:GetOnFirstFrameHandler:TwilioVideo.IVideoRendererListenerInvoker, Twilio.Video.Android\n" +
			"n_onFrameDimensionsChanged:(III)V:GetOnFrameDimensionsChanged_IIIHandler:TwilioVideo.IVideoRendererListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.IVideoRendererListenerImplementor, Twilio.Video.Android", VideoRenderer_ListenerImplementor.class, __md_methods);
	}


	public VideoRenderer_ListenerImplementor ()
	{
		super ();
		if (getClass () == VideoRenderer_ListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.IVideoRendererListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFirstFrame ()
	{
		n_onFirstFrame ();
	}

	private native void n_onFirstFrame ();


	public void onFrameDimensionsChanged (int p0, int p1, int p2)
	{
		n_onFrameDimensionsChanged (p0, p1, p2);
	}

	private native void n_onFrameDimensionsChanged (int p0, int p1, int p2);

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
