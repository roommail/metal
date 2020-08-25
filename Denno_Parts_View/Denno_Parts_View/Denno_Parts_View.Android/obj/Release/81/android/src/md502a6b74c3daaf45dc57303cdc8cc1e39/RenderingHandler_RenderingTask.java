package md502a6b74c3daaf45dc57303cdc8cc1e39;


public class RenderingHandler_RenderingTask
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("PdfViewer.RenderingHandler+RenderingTask, Xamarin.Android.PdfViewer", RenderingHandler_RenderingTask.class, __md_methods);
	}


	public RenderingHandler_RenderingTask ()
	{
		super ();
		if (getClass () == RenderingHandler_RenderingTask.class)
			mono.android.TypeManager.Activate ("PdfViewer.RenderingHandler+RenderingTask, Xamarin.Android.PdfViewer", "", this, new java.lang.Object[] {  });
	}

	public RenderingHandler_RenderingTask (float p0, float p1, android.graphics.RectF p2, int p3, boolean p4, int p5, boolean p6, boolean p7)
	{
		super ();
		if (getClass () == RenderingHandler_RenderingTask.class)
			mono.android.TypeManager.Activate ("PdfViewer.RenderingHandler+RenderingTask, Xamarin.Android.PdfViewer", "System.Single, mscorlib:System.Single, mscorlib:Android.Graphics.RectF, Mono.Android:System.Int32, mscorlib:System.Boolean, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3, p4, p5, p6, p7 });
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
