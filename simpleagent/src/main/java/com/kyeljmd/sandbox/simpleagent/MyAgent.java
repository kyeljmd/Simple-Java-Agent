package com.kyeljmd.sandbox.simpleagent;

import java.lang.instrument.Instrumentation;

public class MyAgent {
    public static void premain(String args, Instrumentation inst) {
        System.out.println("MyAgent start");
    }
}