package com.dubbo.provider.com.dubbo.provider.impl;

import com.dubbo.provider.Service;

public class HelloWorldProvider implements Service {
    /**
     * @param param
     * @return
     */
    @Override
    public String doService(String param) {

        return "hello, " + param;
    }

    /**
     * @param param
     * @return
     */
    @Override
    public String callService(String param) {
    	tips();
        return param;
    }
    
    /**
     * 
     */
    private void tips() {
    	System.out.println("在eclipse中从gitbub导入idea上传的module后，无.classpath  .project等配置");
    	System.out.println("需要在项目Properties中选择对应的Project Facts(注意选择版本)转换为eclipse项目。");
    }
    
}
