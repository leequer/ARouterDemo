package com.wxmylife.morgan.base.moduleinterface.provider;

/**
 * Created by wxmylife on 2017/4/21.
 */

public interface IModule1Provider  extends IFragmentProvider {
    //服务
    String MODULE1_MAIN_SERVICE = "/modulelib1/main/service";
    //作为Fragment被添加时候的key
    String MODULE1_KEY_FRAGMENT = "module1_key_fragment";
}
