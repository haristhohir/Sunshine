package com.example.android.sunshine.app;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by harry on 07/03/15.
 */
public class MyView extends View{

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int wMeasureSpec, int hMeasureSpec){

    }

    @Override
    protected void onDraw(Canvas canvas){
//        if(AccessibilityManager.getInstance()){
//
//        }
    }

//    @Override
    public boolean dispatchPopulateAccessabilityEvent(AccessibilityEvent ev){
//        ev.getText(windSpeedDir);
        return true;
    }
}
