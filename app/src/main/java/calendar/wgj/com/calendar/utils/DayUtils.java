package calendar.wgj.com.calendar.utils;

import java.util.Calendar;

/**
 * Created by wgj on 18-4-13.
 */

public class DayUtils {

    public static int getMothDayCount(int month, int year){
        switch (month){
            case Calendar.JANUARY:
            case Calendar.MARCH:
            case Calendar.MAY:
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.OCTOBER:
            case Calendar.DECEMBER:
                return 31;
            case Calendar.APRIL:
            case Calendar.JUNE:
            case Calendar.SEPTEMBER:
            case Calendar.NOVEMBER:
                return 30;
            case Calendar.FEBRUARY:
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? 29: 28;
                default:
                    throw new IllegalArgumentException("Didn't find this month");
        }
    }

    public static int getDayForWeek(Calendar calendar){
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        if(date < 1 || date > 31){
            return 1;
        }
        return calendar.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public static int getWeekForMonth(Calendar calendar){
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        if(date < 1 || date > 31){
            return 1;
        }
        return  calendar.get(Calendar.WEEK_OF_MONTH);
    }
}
