package com.org.hw.impl;

import com.org.hw.HelloWorldService;

public class DefaultHelloWorldService implements HelloWorldService {

    public String echo(String param) {
        return param;
    }

}
