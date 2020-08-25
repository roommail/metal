package md58dc54c8273fe8bff46bc5ffd17fc871d;


public class FileNotFoundException
	extends java.lang.RuntimeException
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PdfViewer.Exceptions.FileNotFoundException, Xamarin.Android.PdfViewer", FileNotFoundException.class, __md_methods);
	}


	public FileNotFoundException ()
	{
		super ();
		if (getClass () == FileNotFoundException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.FileNotFoundException, Xamarin.Android.PdfViewer", "", this, new java.lang.Object[] {  });
	}


	public FileNotFoundException (java.lang.String p0)
	{
		super (p0);
		if (getClass () == FileNotFoundException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.FileNotFoundException, Xamarin.Android.PdfViewer", "System.String, mscorlib", this, new java.lang.Object[] { p0 });
	}


	public FileNotFoundException (java.lang.String p0, java.lang.Throwable p1)
	{
		super (p0, p1);
		if (getClass () == FileNotFoundException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.FileNotFoundException, Xamarin.Android.PdfViewer", "System.String, mscorlib:Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public FileNotFoundException (java.lang.Throwable p0)
	{
		super (p0);
		if (getClass () == FileNotFoundException.class)
			mono.android.TypeManager.Activate ("PdfViewer.Exceptions.FileNotFoundException, Xamarin.Android.PdfViewer", "Java.Lang.Throwable, Mono.Android", this, new java.lang.Object[] { p0 });
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
