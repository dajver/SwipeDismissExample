package com.project.swipetocloseactivity;

import android.view.View;

public class MainActivity extends BaseSwipeToDismissActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public boolean isActivityDraggable() {
        return false;
    }

    public void onClick(View view) {
        startActivity(this, SecondActivity.class);
    }
}
