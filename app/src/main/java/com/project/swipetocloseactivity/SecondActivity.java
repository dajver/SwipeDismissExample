package com.project.swipetocloseactivity;

public class SecondActivity extends BaseSwipeToDismissActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_second;
    }

    @Override
    public boolean isActivityDraggable() {
        return true;
    }
}
