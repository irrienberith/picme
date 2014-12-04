package com.irrienberith.picme.ui.utils;

import android.content.Context;

/**
 * Created by irrienberith on 14-11-19, ����11:38.
 * All rights reserved.
 */
public class KHelper {

    private static final float HALF = (float)0.5;


    /**
     * �����ֻ��ķֱ��ʴ� dp �ĵ�λ ת��Ϊ px(����)
     * @param context
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + HALF);
    }
}
