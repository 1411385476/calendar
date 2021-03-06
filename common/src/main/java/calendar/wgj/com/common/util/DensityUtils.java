package calendar.wgj.com.common.util;

import android.content.Context;

/**
 * Created by wgj on 18-4-16.
 */

public class DensityUtils {

    public static int dipToSp(Context context, float f){
        return (int)((context.getResources().getDisplayMetrics().density * f) + 0.5f);
    }

    public static int spToDip(Context context, float f){
        return (int)(context.getResources().getDisplayMetrics().scaledDensity * f + 0.5f);
    }
}
