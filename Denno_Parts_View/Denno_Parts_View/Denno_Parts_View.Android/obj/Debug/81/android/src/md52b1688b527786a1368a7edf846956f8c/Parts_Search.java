package md52b1688b527786a1368a7edf846956f8c;


public class Parts_Search
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("Denno_Parts_View.Droid.Parts_Search, Denno_Parts_View.Android", Parts_Search.class, __md_methods);
	}


	public Parts_Search ()
	{
		super ();
		if (getClass () == Parts_Search.class)
			mono.android.TypeManager.Activate ("Denno_Parts_View.Droid.Parts_Search, Denno_Parts_View.Android", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

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
