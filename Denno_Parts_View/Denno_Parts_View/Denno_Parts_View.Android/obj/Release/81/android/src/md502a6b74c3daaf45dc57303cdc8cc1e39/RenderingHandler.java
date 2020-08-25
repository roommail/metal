package md502a6b74c3daaf45dc57303cdc8cc1e39;


public class RenderingHandler
	extends android.os.Handler
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_handleMessage:(Landroid/os/Message;)V:GetHandleMessage_Landroid_os_Message_Handler\n" +
			"";
		mono.android.Runtime.register ("PdfViewer.RenderingHandler, Xamarin.Android.PdfViewer", RenderingHandler.class, __md_methods);
	}


	public RenderingHandler ()
	{
		super ();
		if (getClass () == RenderingHandler.class)
			mono.android.TypeManager.Activate ("PdfViewer.RenderingHandler, Xamarin.Android.PdfViewer", "", this, new java.lang.Object[] {  });
	}


	public RenderingHandler (android.os.Looper p0)
	{
		super (p0);
		if (getClass () == RenderingHandler.class)
			mono.android.TypeManager.Activate ("PdfViewer.RenderingHandler, Xamarin.Android.PdfViewer", "Android.OS.Looper, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	public RenderingHandler (android.os.Looper p0, md502a6b74c3daaf45dc57303cdc8cc1e39.PdfView p1)
	{
		super ();
		if (getClass () == RenderingHandler.class)
			mono.android.TypeManager.Activate ("PdfViewer.RenderingHandler, Xamarin.Android.PdfViewer", "Android.OS.Looper, Mono.Android:PdfViewer.PdfView, Xamarin.Android.PdfViewer", this, new java.lang.Object[] { p0, p1 });
	}


	public void handleMessage (android.os.Message p0)
	{
		n_handleMessage (p0);
	}

	private native void n_handleMessage (android.os.Message p0);

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
