package mono.com.twilio.video;


public class StatsListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.video.StatsListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onStats:(Ljava/util/List;)V:GetOnStats_Ljava_util_List_Handler:TwilioVideo.IStatsListenerInvoker, Twilio.Video.Android\n" +
			"";
		mono.android.Runtime.register ("TwilioVideo.IStatsListenerImplementor, Twilio.Video.Android", StatsListenerImplementor.class, __md_methods);
	}


	public StatsListenerImplementor ()
	{
		super ();
		if (getClass () == StatsListenerImplementor.class)
			mono.android.TypeManager.Activate ("TwilioVideo.IStatsListenerImplementor, Twilio.Video.Android", "", this, new java.lang.Object[] {  });
	}


	public void onStats (java.util.List p0)
	{
		n_onStats (p0);
	}

	private native void n_onStats (java.util.List p0);

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
