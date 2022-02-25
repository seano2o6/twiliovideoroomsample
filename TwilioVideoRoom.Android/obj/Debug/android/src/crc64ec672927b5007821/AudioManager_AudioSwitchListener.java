package crc64ec672927b5007821;


public class AudioManager_AudioSwitchListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		kotlin.jvm.functions.Function2,
		kotlin.Function
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_invoke:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;:GetInvoke_Ljava_lang_Object_Ljava_lang_Object_Handler:Kotlin.Jvm.Functions.IFunction2Invoker, Xamarin.Kotlin.StdLib\n" +
			"";
		mono.android.Runtime.register ("Twilio.Video.AudioManager+AudioSwitchListener, Twilio.Video", AudioManager_AudioSwitchListener.class, __md_methods);
	}


	public AudioManager_AudioSwitchListener ()
	{
		super ();
		if (getClass () == AudioManager_AudioSwitchListener.class)
			mono.android.TypeManager.Activate ("Twilio.Video.AudioManager+AudioSwitchListener, Twilio.Video", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Object invoke (java.lang.Object p0, java.lang.Object p1)
	{
		return n_invoke (p0, p1);
	}

	private native java.lang.Object n_invoke (java.lang.Object p0, java.lang.Object p1);

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
