package mono.com.twilio.audioswitch.wired;


public class WiredDeviceConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.audioswitch.wired.WiredDeviceConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDeviceConnected:()V:GetOnDeviceConnectedHandler:Com.Twilio.Audioswitch.Wired.IWiredDeviceConnectionListenerInvoker, AudioSwitch\n" +
			"n_onDeviceDisconnected:()V:GetOnDeviceDisconnectedHandler:Com.Twilio.Audioswitch.Wired.IWiredDeviceConnectionListenerInvoker, AudioSwitch\n" +
			"";
		mono.android.Runtime.register ("Com.Twilio.Audioswitch.Wired.IWiredDeviceConnectionListenerImplementor, AudioSwitch", WiredDeviceConnectionListenerImplementor.class, __md_methods);
	}


	public WiredDeviceConnectionListenerImplementor ()
	{
		super ();
		if (getClass () == WiredDeviceConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Twilio.Audioswitch.Wired.IWiredDeviceConnectionListenerImplementor, AudioSwitch", "", this, new java.lang.Object[] {  });
	}


	public void onDeviceConnected ()
	{
		n_onDeviceConnected ();
	}

	private native void n_onDeviceConnected ();


	public void onDeviceDisconnected ()
	{
		n_onDeviceDisconnected ();
	}

	private native void n_onDeviceDisconnected ();

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
