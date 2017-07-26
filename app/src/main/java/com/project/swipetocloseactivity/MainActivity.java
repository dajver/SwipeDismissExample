package com.project.swipetocloseactivity;

import android.content.Intent;
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
        startActivity(new Intent(this, SecondActivity.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_right);
    }
}
