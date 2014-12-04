package com.irrienberith.picme.widget;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by irrienberith on 14-11-19, обнГ5:00.
 * All rights reserved.
 */
public class ResizeBlock extends FrameLayout {
    private LinearLayout root;

    public ResizeBlock(Context context) {
        super(context);
    }




    private void initLayout(Context context){

        root = new LinearLayout(context);


    }



}
