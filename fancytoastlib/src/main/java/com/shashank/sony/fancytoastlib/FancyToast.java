package com.shashank.sony.fancytoastlib;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FancyToast extends Toast {
    /**
     * Construct an empty Toast object.  You must call {@link #setView} before you
     * can call {@link #show}.
     *
     * @param context The context to use.  Usually your {@link Application}
     *                or {@link Activity} object.
     */
    public static int SUCCESS=1;
    public static int WARNING=2;
    public static int ERROR=3;
    public static int INFO=4;
    public static int DEFAULT=5;
    public static int CONFUSING=6;
    public FancyToast(Context context) {
        super(context);
    }
    public static Toast makeText(Context context,String message,int duration,int type,boolean androidicon){
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(R.layout.fancytoast_layout, null, false);
        TextView l1 = (TextView) layout.findViewById(R.id.toast_text);
        LinearLayout linearLayout=(LinearLayout) layout.findViewById(R.id.toast_type);
        ImageView img=(ImageView) layout.findViewById(R.id.toast_icon);
        ImageView img1=(ImageView) layout.findViewById(R.id.imageView4);
        l1.setText(message);
        if(androidicon==true)
        img1.setVisibility(View.VISIBLE);
        else if(androidicon==false)
        img1.setVisibility(View.GONE);
        if(type==1)
        { linearLayout.setBackgroundResource(R.drawable.success_shape);
          img.setImageResource(R.drawable.ic_check_black_24dp);
        }
        else if (type==2)
        { linearLayout.setBackgroundResource(R.drawable.warning_shape);
          img.setImageResource(R.drawable.ic_pan_tool_black_24dp);
        }
        else if (type==3)
        { linearLayout.setBackgroundResource(R.drawable.error_shape);
          img.setImageResource(R.drawable.ic_clear_black_24dp);
        }
        else if (type==4)
        { linearLayout.setBackgroundResource(R.drawable.info_shape);
          img.setImageResource(R.drawable.ic_info_outline_black_24dp);
        }
        else if (type==5)
        { linearLayout.setBackgroundResource(R.drawable.default_shape);
          img.setVisibility(View.GONE);
        }
        else if (type==6)
        { linearLayout.setBackgroundResource(R.drawable.confusing_shape);
          img.setImageResource(R.drawable.ic_refresh_black_24dp);
        }
        toast.setView(layout);
        return toast;
    }
    public static Toast makeText(Context context, String message, int duration, int type, boolean androidicon, int ImageResource) {
        Toast toast = new Toast(context);
        toast.setDuration(duration);
        View layout = LayoutInflater.from(context).inflate(layout.fancytoast_layout, (ViewGroup)null, false);
        TextView l1 = (TextView)layout.findViewById(id.toast_text);
        LinearLayout linearLayout = (LinearLayout)layout.findViewById(id.toast_type);
        ImageView img = (ImageView)layout.findViewById(id.toast_icon);
        ImageView img1 = (ImageView)layout.findViewById(id.imageView4);
        l1.setText(message);
        if(androidicon) {
            img1.setVisibility(0);
        } else if(!androidicon) {
            img1.setVisibility(8);
        }

        if(type == 1) {
            linearLayout.setBackgroundResource(drawable.success_shape);
        } else if(type == 2) {
            linearLayout.setBackgroundResource(drawable.warning_shape);
        } else if(type == 3) {
            linearLayout.setBackgroundResource(drawable.error_shape);
        } else if(type == 4) {
            linearLayout.setBackgroundResource(drawable.info_shape);
        } else if(type == 5) {
            linearLayout.setBackgroundResource(drawable.default_shape);
        } else if(type == 6) {
            linearLayout.setBackgroundResource(drawable.confusing_shape);
        }

        if(type >= 1 && type <= 6) img.setImageResource(ImageResource);

        toast.setView(layout);
        return toast;
    }

}
