package com.blueberry.media.utils;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/**
 * Created by muyonggang on 2023/1/1
 *
 * @author muyonggang@bytedance.com
 */
public class ToastUtil {

    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    public static void toast(String msg) {
        uiHandler.post(new Runnable() {
            @Override
            public void run() {
                Toast toast = new Toast(ApplicationHolder.getInstance().getApp());
                toast.setText(msg);
                toast.show();
            }
        });
    }
}

