package com.project.swipetocloseactivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.r0adkll.slidr.Slidr;

/**
 * Created by gleb on 7/27/17.
 */

public abstract class BaseSwipeToDismissActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        if(isActivityDraggable())
            Slidr.attach(this);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(isActivityDraggable())
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public void startActivity(Context context, Class<?> className) {
        startActivity(new Intent(context, className));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }

    public abstract int getLayoutId();
    public abstract boolean isActivityDraggable();
}
