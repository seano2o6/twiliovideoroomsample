package crc643522f9a93dc6afb5;


public class VideoView
	extends com.twilio.video.VideoView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Twilio.Video.VideoView.VideoView, Twilio.Video", VideoView.class, __md_methods);
	}


	public VideoView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == VideoView.class)
			mono.android.TypeManager.Activate ("Twilio.Video.VideoView.VideoView, Twilio.Video", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public VideoView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == VideoView.class)
			mono.android.TypeManager.Activate ("Twilio.Video.VideoView.VideoView, Twilio.Video", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}

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
