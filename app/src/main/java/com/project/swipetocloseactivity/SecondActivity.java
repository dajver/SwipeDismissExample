package com.project.swipetocloseactivity;

import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class SecondActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setDragEdge(SwipeBackLayout.DragEdge.LEFT);
    }
}
