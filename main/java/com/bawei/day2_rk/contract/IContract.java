package com.bawei.day2_rk.contract;

/**
 * @author 李博伦
 * @createTime 2019/12/30 8:43
 * @description 契约类
 */
public interface IContract {

    interface Model {
        void doget(String url, ModelCallback callback);
    }

    interface Presenter {
        void getonstart(String url);
    }

    interface View {
        void onsuccess(String json);

        void onerror(String error);
    }

    interface ModelCallback {
        void onsuccess(String json);

        void onerror(String error);
    }
}
