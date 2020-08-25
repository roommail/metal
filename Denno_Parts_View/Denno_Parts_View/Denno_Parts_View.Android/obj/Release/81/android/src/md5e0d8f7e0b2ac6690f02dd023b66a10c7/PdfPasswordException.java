package md5e0d8f7e0b2ac6690f02dd023b66a10c7;


public class PdfPasswordException
	extends java.io.IOException
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PdfViewer.PDFium.PdfPasswordException, Xamarin.Android.PdfViewer", PdfPasswordException.class, __md_methods);
	}


	public PdfPasswordException ()
	{
		super ();
		if (getClass () == PdfPasswordException.class)
			mono.android.TypeManager.Activate ("PdfViewer.PDFium.PdfPasswordException, Xamarin.Android.PdfViewer", "", this, new java.lang.Object[] {  });
	}


	public PdfPasswordException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == PdfPasswordException.class)
			mono.android.TypeManager.Activate ("PdfViewer.PDFium.PdfPasswordException, Xamarin.Android.PdfViewer", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
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
