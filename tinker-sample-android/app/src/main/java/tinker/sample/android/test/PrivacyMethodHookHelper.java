package tinker.sample.android.test;

import android.os.Build;

/**
 * @author hengyangji
 *         on 2022/9/12
 */
public class PrivacyMethodHookHelper {

    public static String getBuildManufacture() {
        return Build.MANUFACTURER;
    }
}
