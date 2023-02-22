package net.quantum6.usbcamera.application;

import android.app.Application;

import net.quantum6.usbcamera.UVCCameraHelper;
import net.quantum6.usbcamera.utils.CrashHandler;

/**application class
 *
 * Created by jianddongguo on 2017/7/20.
 */

public class MyApplication extends Application {
    private CrashHandler mCrashHandler;
    // File Directory in sd card
    public static final String DIRECTORY_NAME = "USBCamera";

    @Override
    public void onCreate() {
        super.onCreate();
        mCrashHandler = CrashHandler.getInstance();
        mCrashHandler.init(getApplicationContext(), getClass());
    }
}
