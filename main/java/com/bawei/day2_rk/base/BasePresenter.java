package com.bawei.day2_rk.base;

import com.bawei.day2_rk.contract.IContract;

import java.lang.ref.WeakReference;

/**
 * @author 李博伦
 * @createTime 2019/12/30 8:47
 * @description BaseP层的基类
 */
public abstract class BasePresenter<V extends IContract.View> implements IContract.Presenter {

    private WeakReference<V> weakReference;

    public BasePresenter() {

    }

    protected void onAttch(V v) {
        weakReference = new WeakReference<>(v);
    }

    protected void onError() {
        if (weakReference != null) {
            weakReference.clear();
            weakReference = null;
        }
    }

    protected V getview() {
        return weakReference.get();
    }
}
