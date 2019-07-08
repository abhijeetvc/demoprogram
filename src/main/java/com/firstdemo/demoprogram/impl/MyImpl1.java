package com.firstdemo.demoprogram.impl;

import com.firstdemo.demoprogram.myinterface.DemoInnterface1;
import org.springframework.stereotype.Service;


@Service
public class MyImpl1 implements DemoInnterface1 {
    @Override
    public String check1() {
        return "Hiiiiiiiiiiiii";
    }
}
