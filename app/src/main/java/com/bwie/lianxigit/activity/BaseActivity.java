package com.bwie.lianxigit.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.bwie.lianxigit.presenter.IDataPresenter;

/**
 * Created by lenovo on 2017/12/25.
 */

public abstract class BaseActivity<T extends IDataPresenter> extends AppCompatActivity {
    public T presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        9999999999999
        createPresenter();
    }

    public abstract void createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter!=null){
            presenter.detach();
        }
    }
}
