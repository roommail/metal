using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.Graphics;
using Android.OS;
using Android.Runtime;
using Android.Support.V4.App;
using Android.Support.V4.Content;
using Android.Views;
using Android.Widget;
using ZXing.Mobile;

namespace Denno_Parts_View.Droid
{
    [Activity(Label = "Denno_Parts_View", Icon = "@drawable/Denno_Parts", Theme = "@style/MainTheme", MainLauncher = true, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation)]
    class Parts_Search : Activity
    {
        SqlConnectionStringBuilder dbConString;

        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

            SetContentView(Resource.Layout.Parts_Search);

            //カメラの許可確認
            if (ContextCompat.CheckSelfPermission(this, Android.Manifest.Permission.Camera) == Permission.Granted)
            {
                // 許可されている時の処理
            }
            else
            {
                // 拒否されている時の処理
                ActivityCompat.RequestPermissions(this, new String[] { Android.Manifest.Permission.Camera }, 0);
            }


            dbConString = new SqlConnectionStringBuilder();
            dbConString.UserID = "SS_ODBC";
            dbConString.Password = "ss";
            dbConString.DataSource = "192.168.1.9,1433";
            dbConString.InitialCatalog = "SS_METAL";

            var lnl01 = FindViewById<LinearLayout>(Resource.Id.linearLayout1);
            lnl01.SetBackgroundColor(Color.Argb(255, 31, 73, 125));

            ImageButton btn_qr = FindViewById<ImageButton>(Resource.Id.btn_QR);
            var bmp = BitmapFactory.DecodeResource(Resources, Resource.Drawable.QR);
            btn_qr.SetImageBitmap(bmp);

            ImageView img_ss = FindViewById<ImageView>(Resource.Id.img_SS);
            bmp = BitmapFactory.DecodeResource(Resources, Resource.Drawable.SSLogo);
            img_ss.SetImageBitmap(bmp);

            var txt_hc = FindViewById<TextView>(Resource.Id.txt_HC);

            var btn_view = FindViewById<Button>(Resource.Id.btn_View);

            btn_qr.Click += async (sender, e) =>
            {
                try
                {
                    MobileBarcodeScanner.Initialize(Application);
                    var scanner = new MobileBarcodeScanner();
                    var result = await scanner.Scan();
                    if (result != null)
                    {
                        txt_hc.Text = result.ToString();
                        //部品情報ダイアログ
                        txt_hc.Text = Fun_HC_Data_Dlg(txt_hc.Text);
                    }
                }
                catch
                {
                    Toast.MakeText(this, "Reader起動に失敗。", ToastLength.Long).Show();
                }
            };

            btn_view.Click += delegate
            {
                if (txt_hc.Text.Replace(" ","").Length > 0)
                {
                    //部品情報ダイアログ
                    txt_hc.Text = Fun_HC_Data_Dlg(txt_hc.Text);

                };
            };

        }

        public string Fun_HC_Data_Dlg(string HC)
        {
            //ダイアログ表示
            var layout = LayoutInflater.Inflate(Resource.Layout.Parts_Data_Dlg, null);
            var dlg = new AlertDialog.Builder(this);

            dlg.SetView(layout);

            var txt_dhc = layout.FindViewById<TextView>(Resource.Id.txt_DHC);
            var txt_zcnt = layout.FindViewById<TextView>(Resource.Id.txt_ZCnt);
            var txt_lastd = layout.FindViewById<TextView>(Resource.Id.txt_LastD);
            var txt_lastsuu = layout.FindViewById<TextView>(Resource.Id.txt_LastSuu);
            var txt_nextd = layout.FindViewById<TextView>(Resource.Id.txt_NextD);
            var txt_nextsuu = layout.FindViewById<TextView>(Resource.Id.txt_NextSuu);

            var btn_dlg_close = layout.FindViewById<Button>(Resource.Id.btn_dlg_Close);
            var btn_image_show = layout.FindViewById<Button>(Resource.Id.btn_image_show);



            try
            {
                //SQL呼出し
                string sql = "SELECT * FROM MV60_ViewDate WHERE 品目C = '" + HC + "'";

                SqlConnection con = new SqlConnection(dbConString.ConnectionString);
                con.Open();
                SqlCommand command = new SqlCommand(sql, con);

                var ad = new SqlDataAdapter();
                var dt = new DataTable();
                ad.SelectCommand = command;
                ad.Fill(dt);

                var zcnt = dt.Rows[0]["現在庫"].ToString().Length == 0 ? "0" : dt.Rows[0]["現在庫"].ToString();
                var nextsuu = dt.Rows[0]["次回指示数"].ToString().Length == 0 ? "0" : dt.Rows[0]["次回指示数"].ToString();

                txt_dhc.Text = dt.Rows[0]["品目C"].ToString().Replace(" ", "");

                //if (txt_zcnt.Text < '0')
                //{
                //    txt_zcnt.SetBackgroundColor(Color.Argb(30, 204, 0, 0));
                //}

                txt_zcnt.Text = zcnt + "個";
                

                if (dt.Rows[0]["最終実績日"].ToString().Length> 0)
                {
                    txt_lastd.Text = dt.Rows[0]["最終実績日"].ToString().Substring(0, 10);
                    txt_lastsuu.Text = dt.Rows[0]["最終実績数"].ToString() + ".00個";
                }
                if (dt.Rows[0]["次回指示日"].ToString().Length > 0)
                {
                    txt_nextd.Text = dt.Rows[0]["次回指示日"].ToString().Substring(0, 10);
                    txt_nextsuu.Text = nextsuu + "個";
                }

                dt.Dispose();
                ad.Dispose();
                con.Close();

                var dialog = dlg.Create();
                dialog.Show();

                btn_image_show.Click += delegate
                {
                    
                    
                };

                btn_dlg_close.Click += delegate
                {
                    HC = null;
                    dialog.Dismiss();
                };
            }
            catch
            {
                Toast.MakeText(this, "接続タイムアウト：時間をおいてからお試し下さい。", ToastLength.Long).Show();
            }

            return HC;
        }

    }
}