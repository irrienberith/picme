package com.irrienberith.picme.ui.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

/**
 * Created by irrienberith on 14-11-19, ÉÏÎç11:43.
 * All rights reserved.
 */
public class KResourceUtils {
    public static int getLayoutId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "layout",
                paramContext.getPackageName());
    }

    public static Drawable getDrawableById(Context paramContext, String paramString) {
        return paramContext.getResources().getDrawable(getDrawableId(paramContext, paramString));
    }
    public static Drawable getDrawableByColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getDrawable(getColorId(paramContext, paramString));
    }

    public static int getStringId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString, "string",
                paramContext.getPackageName());
    }

    public static int getDrawableId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "drawable", paramContext.getPackageName());
    }

    public static int getStyleId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "style", paramContext.getPackageName());
    }

    public static int getId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "id", paramContext.getPackageName());
    }

    public static int getColorId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "color", paramContext.getPackageName());
    }

    public static int getAnimId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "anim", paramContext.getPackageName());
    }

    public static int getRowId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "row", paramContext.getPackageName());
    }

    public static int getValuesId(Context paramContext, String paramString) {
        return paramContext.getResources().getIdentifier(paramString,
                "values", paramContext.getPackageName());
    }
}
