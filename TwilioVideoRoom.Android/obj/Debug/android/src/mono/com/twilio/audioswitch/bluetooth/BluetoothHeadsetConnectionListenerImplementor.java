package mono.com.twilio.audioswitch.bluetooth;


public class BluetoothHeadsetConnectionListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.twilio.audioswitch.bluetooth.BluetoothHeadsetConnectionListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onBluetoothHeadsetActivationError:()V:GetOnBluetoothHeadsetActivationErrorHandler:Com.Twilio.Audioswitch.Bluetooth.IBluetoothHeadsetConnectionListenerInvoker, AudioSwitch\n" +
			"n_onBluetoothHeadsetStateChanged:(Ljava/lang/String;)V:GetOnBluetoothHeadsetStateChanged_Ljava_lang_String_Handler:Com.Twilio.Audioswitch.Bluetooth.IBluetoothHeadsetConnectionListenerInvoker, AudioSwitch\n" +
			"";
		mono.android.Runtime.register ("Com.Twilio.Audioswitch.Bluetooth.IBluetoothHeadsetConnectionListenerImplementor, AudioSwitch", BluetoothHeadsetConnectionListenerImplementor.class, __md_methods);
	}


	public BluetoothHeadsetConnectionListenerImplementor ()
	{
		super ();
		if (getClass () == BluetoothHeadsetConnectionListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Twilio.Audioswitch.Bluetooth.IBluetoothHeadsetConnectionListenerImplementor, AudioSwitch", "", this, new java.lang.Object[] {  });
	}


	public void onBluetoothHeadsetActivationError ()
	{
		n_onBluetoothHeadsetActivationError ();
	}

	private native void n_onBluetoothHeadsetActivationError ();


	public void onBluetoothHeadsetStateChanged (java.lang.String p0)
	{
		n_onBluetoothHeadsetStateChanged (p0);
	}

	private native void n_onBluetoothHeadsetStateChanged (java.lang.String p0);

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
