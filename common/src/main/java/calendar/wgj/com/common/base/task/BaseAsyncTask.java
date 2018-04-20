package calendar.wgj.com.common.base.task;

import android.content.Context;
import android.os.AsyncTask;

import calendar.wgj.com.common.listener.OnTaskFinshedListener;

/**
 * Created by wgj on 18-4-16.
 */

public class BaseAsyncTask<T> extends AsyncTask<Void, Void, T> {

    protected Context mContext;
    protected OnTaskFinshedListener<T> mOnTaskFinshedListener;

    public BaseAsyncTask(Context context, OnTaskFinshedListener<T> onTaskFinshedListener){
        mContext = context;
        mOnTaskFinshedListener = onTaskFinshedListener;
    }

    @Override
    protected T doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onPostExecute(T t) {
        super.onPostExecute(t);
        if(mOnTaskFinshedListener != null){
            mOnTaskFinshedListener.onTaskFinshed(t);
        }
    }
}
