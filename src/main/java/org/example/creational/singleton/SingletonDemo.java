package org.example.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SingletonDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /* Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime);
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime1);*/
        List<MySingleton_LazyHolder> tasks = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i=0 ;i<10;i++) {
            Future<MySingleton_LazyHolder> submit = executorService.submit(()-> MySingleton_LazyHolder.getInstance.get());
            tasks.add(submit.get());
        }
        tasks.forEach(System.out::println);
        executorService.shutdown();
    }
}
