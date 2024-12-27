package org.example.creational.singleton;

import java.util.function.Supplier;

public class MySingleton_LazyHolder {


    private static class LazyHolder{
        static final MySingleton_LazyHolder instance = new MySingleton_LazyHolder();
    }
    private MySingleton_LazyHolder(){}

    public static Supplier<MySingleton_LazyHolder> getInstance = ()-> LazyHolder.instance;
}
