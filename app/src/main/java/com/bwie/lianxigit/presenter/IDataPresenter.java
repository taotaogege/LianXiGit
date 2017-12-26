package com.bwie.lianxigit.presenter;

/**
 * Created by lenovo on 2017/12/25.
 */

public interface IDataPresenter<T> {
    void attach(T view);
    void detach();
}
