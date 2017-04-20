package com.wxmylife.morgan.base.moduleinterface.router;

/**
 * Created by wxmylife on 2017/4/20.
 */

public class ModuleManager {

    private ModuleManager(){}

    private static class ModuleManagerHolder{
        private static final ModuleManager instance=new ModuleManager();
    }

    public static ModuleManager getInstance(){
        return ModuleManagerHolder.instance;
    }


}
