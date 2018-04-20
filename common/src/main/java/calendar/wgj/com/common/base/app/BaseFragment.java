package calendar.wgj.com.common.base.app;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import calendar.wgj.com.common.R;

/**
 * A simple {@link Fragment} subclass.
 */
public abstract class BaseFragment extends Fragment {

    protected Activity mActivity;
    protected  View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mActivity = getActivity();
        mView = initContentView(inflater, container);
        if(mView == null){
            throw  new NullPointerException("fragment content view is null");
        }
        bindView();
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    @Override
    public void onResume() {
        super.onResume();
        bindData();
    }

    protected abstract View initContentView(LayoutInflater inflater, ViewGroup container);

    protected abstract void bindView();

    protected void initData(){}

    protected  void bindData(){}

    protected <VT extends View> VT searchViewById(int id){
        if(mView == null){
            throw new NullPointerException("Fragment content view is null");
        }
        VT view = mView.findViewById(id);
        if(view == null){
            throw new NullPointerException("this resource id is invalid");
        }
        return view;
    }

}
