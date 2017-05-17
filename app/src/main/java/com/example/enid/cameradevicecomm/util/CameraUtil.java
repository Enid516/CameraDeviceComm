package com.example.enid.cameradevicecomm.util;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by Enid on 2017/4/18.
 */

/**
 *  Check if this device has a camera
 */
public class CameraUtil {
    public static boolean checkGameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
            //this device has a camera
            return true;
        } else {
            //no camera on this device
            return false;
        }
    }
}
