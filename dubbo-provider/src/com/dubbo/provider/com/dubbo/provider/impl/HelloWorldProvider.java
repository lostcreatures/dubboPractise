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
    	System.out.println("��eclipse�д�gitbub����idea�ϴ���module����.classpath  .project������");
    	System.out.println("��Ҫ����ĿProperties��ѡ���Ӧ��Project Facts(ע��ѡ��汾)ת��Ϊeclipse��Ŀ��");
    }
    
}
