package calendar.wgj.com.calendar;

/**
 * Created by wgj on 18-4-17.
 */

public interface OnCalendarClickListener {
    void onClickDate(int year, int month, int day);
    void onPageChange(int year, int month, int day);
}
