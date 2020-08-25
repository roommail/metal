package md502a6b74c3daaf45dc57303cdc8cc1e39;


public class PdfView
	extends android.widget.RelativeLayout
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"n_canScrollHorizontally:(I)Z:GetCanScrollHorizontally_IHandler\n" +
			"n_canScrollVertically:(I)Z:GetCanScrollVertically_IHandler\n" +
			"n_onDraw:(Landroid/graphics/Canvas;)V:GetOnDraw_Landroid_graphics_Canvas_Handler\n" +
			"";
		mono.android.Runtime.register ("PdfViewer.PdfView, Xamarin.Android.PdfViewer", PdfView.class, __md_methods);
	}


	public PdfView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == PdfView.class)
			mono.android.TypeManager.Activate ("PdfViewer.PdfView, Xamarin.Android.PdfViewer", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public PdfView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == PdfView.class)
			mono.android.TypeManager.Activate ("PdfViewer.PdfView, Xamarin.Android.PdfViewer", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public PdfView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == PdfView.class)
			mono.android.TypeManager.Activate ("PdfViewer.PdfView, Xamarin.Android.PdfViewer", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public PdfView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == PdfView.class)
			mono.android.TypeManager.Activate ("PdfViewer.PdfView, Xamarin.Android.PdfViewer", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void computeScroll ()
	{
		n_computeScroll ();
	}

	private native void n_computeScroll ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);


	public boolean canScrollHorizontally (int p0)
	{
		return n_canScrollHorizontally (p0);
	}

	private native boolean n_canScrollHorizontally (int p0);


	public boolean canScrollVertically (int p0)
	{
		return n_canScrollVertically (p0);
	}

	private native boolean n_canScrollVertically (int p0);


	public void onDraw (android.graphics.Canvas p0)
	{
		n_onDraw (p0);
	}

	private native void n_onDraw (android.graphics.Canvas p0);

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
