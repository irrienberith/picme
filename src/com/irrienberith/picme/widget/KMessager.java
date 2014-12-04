package com.irrienberith.picme.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.view.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irrienberith.picme.ui.utils.KHelper;
import com.irrienberith.picme.ui.utils.KResourceUtils;
import com.irrienberith.picme.ui.utils.KUIConstants;


/**
 * Created by irrienberith on 14-11-19, ÉÏÎç11:31.
 * All rights reserved.
 */
public class KMessager {

    private static int bg;
    private static AlertDialog dialog;
    private static TextView message;
    private static ImageView line;
    private static TextView button;
    private static LinearLayout sub;
    private static LinearLayout root;
    
    private static void uniInit(Context context, String msg){
        root = new LinearLayout(context);
        root.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        root.setGravity(Gravity.CENTER);

        sub = new LinearLayout(context);
        sub.setLayoutParams(new LinearLayout.LayoutParams(KHelper.dip2px(context, KUIConstants.MESSAGE_WIDTH),
                KHelper.dip2px(context, KUIConstants.MESSAGE_HEIGHT)));
        sub.setBackgroundColor(Color.WHITE);
        sub.setOrientation(LinearLayout.VERTICAL);
        sub.setPadding(KHelper.dip2px(context, KUIConstants.MESSAGE_TEXT_PADDING), 0,
                KHelper.dip2px(context, KUIConstants.MESSAGE_TEXT_PADDING), 0);
        sub.setGravity(Gravity.CENTER_HORIZONTAL);
        bg = KResourceUtils.getDrawableId(context, "dialog");
        sub.setBackgroundResource(bg);

        message = new TextView(context);
        message.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                KHelper.dip2px(context, 64)));
        message.setTextColor(KUIConstants.TEXT_COLOR_DARK);
        message.setText(msg);
        message.setTextSize(KUIConstants.TEXT_SIZE);
        message.setPadding(KHelper.dip2px(context, KUIConstants.PADDING_HORIZONTAL * 2), 0,
                KHelper.dip2px(context, KUIConstants.PADDING_HORIZONTAL * 2), 0);
        message.setGravity(Gravity.CENTER);
        sub.addView(message);

        line = new ImageView(context);
        line.setLayoutParams(new LinearLayout.LayoutParams(KHelper.dip2px(context, 280), 1));
        line.setBackgroundColor(KUIConstants.BACKGROUND_COLOR_LTGREY);
        sub.addView(line);

        button = new TextView(context);
        button.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                KHelper.dip2px(context, 37)));
        button.setTextColor(KUIConstants.TEXT_COLOR_BLUE);
        button.setText("È·¶¨");
        button.setGravity(Gravity.CENTER);
        button.setTextSize(KUIConstants.TEXT_SIZE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        setButtonBackGround(button);

        sub.addView(button);
        root.addView(sub);

        WindowManager.LayoutParams params = dialog.getWindow().getAttributes();
        params.height = ViewGroup.LayoutParams.MATCH_PARENT;
        params.width  = ViewGroup.LayoutParams.MATCH_PARENT;
        dialog.getWindow().setAttributes((WindowManager.LayoutParams) params);

    }


    private static void setButtonBackGround(final TextView textButton) {
        textButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        textButton.setBackgroundColor(KUIConstants.TEXT_COLOR_BLUE);
                        textButton.setTextColor(Color.WHITE);
                        break;
                    case MotionEvent.ACTION_UP:
                        textButton.setTextColor(KUIConstants.TEXT_COLOR_BLUE);
                        textButton.setBackgroundColor(Color.WHITE);

                }
                return false;
            }
        });

    }
}
