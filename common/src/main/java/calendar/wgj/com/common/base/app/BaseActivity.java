package calendar.wgj.com.common.base.app;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by wgj on 18-4-17.
 */

public abstract class BaseActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        bindView();
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        bindData();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


    protected abstract void bindView();

    /**
     * 请求动态数据
     */
    protected  void initData(){}

    /**
     * 绑定动态数据
     */
    protected void bindData(){

    }

    protected <VT extends View> VT searchViewById(int id){
        VT view = (VT)findViewById(id);
        if(view == null){
            throw new NullPointerException("this resource id is invalid.");
        }
        return view;
    }

}
