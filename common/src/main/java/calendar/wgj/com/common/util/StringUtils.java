package calendar.wgj.com.common.util;

import java.util.Random;

/**
 * Created by wgj on 18-4-16.
 */

public class StringUtils {

    public static String getRandomString(int length){
        String base = "abcdefghijkmnopqrstuvwxyz0123456789ABCDEFGHJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++){
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return  sb.toString();
    }
}
