package com.firstdemo.demoprogram.impl;

import com.firstdemo.demoprogram.myinterface.DemoInterface;
import org.springframework.stereotype.Service;


@Service
public class MyImpl implements DemoInterface {

    @Override
    public String checkDiandIoc() {
        return "Hello Spring";
    }
}
