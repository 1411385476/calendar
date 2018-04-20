package calendar.wgj.com.common.util;

import android.content.Context;
import android.inputmethodservice.InputMethodService;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by wgj on 18-4-16.
 */

public class DeviceUtils {

    public static void closeSoftInput(Context context, EditText editText){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
    public static void openSoftInput(Context context, EditText editText){
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(editText, InputMethodManager.SHOW_FORCED);
    }
}

