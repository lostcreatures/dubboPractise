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
        return param;
    }
}
