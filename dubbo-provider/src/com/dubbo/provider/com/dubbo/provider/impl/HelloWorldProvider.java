package com.dubbo.provider.com.dubbo.provider.impl;

import com.dubbo.provider.Service;

public class HelloWorldProvider implements Service {
    @Override
    public String doService(String param) {
        return "hello, " + param;
    }
}
