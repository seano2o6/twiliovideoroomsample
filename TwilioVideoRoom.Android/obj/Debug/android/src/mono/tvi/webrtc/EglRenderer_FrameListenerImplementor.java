package mono.tvi.webrtc;


public class EglRenderer_FrameListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		tvi.webrtc.EglRenderer.FrameListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFrame:(Landroid/graphics/Bitmap;)V:GetOnFrame_Landroid_graphics_Bitmap_Handler:Tvi.Webrtc.EglRenderer/IFrameListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("Tvi.Webrtc.EglRenderer+IFrameListenerImplementor, Twilio.Video.Android", EglRenderer_FrameListenerImplementor.class, __md_methods);
	}


	public EglRenderer_FrameListenerImplementor ()
	{
		super ();
		if (getClass () == EglRenderer_FrameListenerImplementor.class)
			mono.android.TypeManager.Activate ("Tvi.Webrtc.EglRenderer+IFrameListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onFrame (android.graphics.Bitmap p0)
	{
		n_onFrame (p0);
	}

	private native void n_onFrame (android.graphics.Bitmap p0);

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
