package com.bawei.day2_rk.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.day2_rk.contract.IContract;

/**
 * @author 李博伦
 * @createTime 2019/12/30 8:46
 * @description BaseActivity的基类
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IContract.View {

    public P p;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Layout() != 0) {
            setContentView(Layout());
            initView();
            p = initPresenter();
            startCoding();
        }
    }

    protected abstract void startCoding();

    protected abstract P initPresenter();

    protected abstract void initView();

    protected abstract int Layout();

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
