package com.irrienberith.picme.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.irrienberith.picme.ui.utils.KHelper;
import com.irrienberith.picme.ui.utils.KResourceUtils;
import com.irrienberith.picme.ui.utils.KUIConstants;

/**
 * Created by irrienberith on 14-11-19, 下午12:45.
 * All rights reserved.
 */
public class StartActivity extends Activity {

    private LinearLayout container;
    private FrameLayout root;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initUI();
        initPage();
    }

    private void initUI() {
        container = new LinearLayout(this);
        container.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        root = new FrameLayout(this);
        root.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        image = new ImageView(this);
        image.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        image.setImageResource(KResourceUtils.getDrawableId(this, "sea"));
        Animation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_PARENT, 0.5f);
        scaleAnimation.setDuration(3800);
        image.startAnimation(scaleAnimation);
        root.addView(image);

        TextView text = new TextView(this);
        text.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                KHelper.dip2px(this, KUIConstants.MESSAGE_HEIGHT)));
        text.setTextColor(KUIConstants.TEXT_COLOR_LIGHT);
        text.setTextSize(KUIConstants.TEXT_SIZE);
        text.setGravity(Gravity.CENTER);
        text.setText("Picture Magic~");
        text.setClickable(false);
        root.addView(text);

        container.addView(root);
        setContentView(container);
    }


    /**
     * 准备载入主界面
     */
    private void initPage() {

        /**
         * 欢迎界面停留3500毫秒后进入主界面
         */
        final StartPageTimer pageTimer = new StartPageTimer(3500, 1000);
        pageTimer.start();


        /**
         * 点击欢迎界面立即进入主界面
         */
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pageTimer.cancel();
                loadPage();
            }
        });

    }

    private void loadPage() {


        //container.removeAllViews();
    }


    public class StartPageTimer extends CountDownTimer {
        public StartPageTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {
            loadPage();
        }
    }


}
