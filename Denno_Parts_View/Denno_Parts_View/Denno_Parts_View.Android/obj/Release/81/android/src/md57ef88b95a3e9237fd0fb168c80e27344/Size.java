package md57ef88b95a3e9237fd0fb168c80e27344;


public class Size
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_toString:()Ljava/lang/String;:GetToStringHandler\n" +
			"n_hashCode:()I:GetGetHashCodeHandler\n" +
			"";
		mono.android.Runtime.register ("PdfViewer.PDFium.Utils.Size, Xamarin.Android.PdfViewer", Size.class, __md_methods);
	}


	public Size ()
	{
		super ();
		if (getClass () == Size.class)
			mono.android.TypeManager.Activate ("PdfViewer.PDFium.Utils.Size, Xamarin.Android.PdfViewer", "", this, new java.lang.Object[] {  });
	}


	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();


	public int hashCode ()
	{
		return n_hashCode ();
	}

	private native int n_hashCode ();

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
