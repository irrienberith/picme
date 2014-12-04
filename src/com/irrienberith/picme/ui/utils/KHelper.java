package com.irrienberith.picme.ui.utils;

import android.content.Context;

/**
 * Created by irrienberith on 14-11-19, 上午11:38.
 * All rights reserved.
 */
public class KHelper {

    private static final float HALF = (float)0.5;


    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     * @param context
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + HALF);
    }
}
