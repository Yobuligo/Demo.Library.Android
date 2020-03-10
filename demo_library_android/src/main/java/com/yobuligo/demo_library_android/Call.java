package com.yobuligo.demo_library_android;

import android.util.Log;

public class Call implements ICall {
    @Override
    public void call() {
        Log.d("Call", "call: was called");
    }
}
