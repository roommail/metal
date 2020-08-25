package md58dc54c8273fe8bff46bc5ffd17fc871d;


public class PageRenderingException
	extends java.lang.Exception
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PdfViewer.Exceptions.PageRenderingException, Xamarin.Android.PdfViewer", PageRenderingException.class, __md_methods);
	}


	public PageRenderingException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == PageRenderingException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.PageRenderingException, Xamarin.Android.PdfViewer", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public PageRenderingException (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == PageRenderingException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.PageRenderingException, Xamarin.Android.PdfViewer", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
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
