package com.callcenter.Configuration;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class AsyncConfiguration implements AsyncConfigurer
{
    @Value("${spring.properties.system-core-pool-size}")
    private String system_core_pool_size;
    @Value("${spring.properties.system-max-pool-size}")
    private String system_max_pool_size;
    @Value("${spring.properties.system-thread-name-prefix}")
    private String system_thread_name_prefix;
    @Value("${spring.properties.system-queue-capacity}")
    private String system_queue_capacity;


    @Override
    @Bean
    public Executor getAsyncExecutor() {
        //ExecutorService executorService;
        TaskExecutorBuilder executorBuilder = new TaskExecutorBuilder();
//        return executorBuilder
//                .maxPoolSize(Integer.valueOf(system_max_pool_size).intValue())
//                .threadNamePrefix(system_thread_name_prefix)
//                .corePoolSize(Integer.valueOf(system_core_pool_size).intValue())
//                .queueCapacity(Integer.valueOf(system_queue_capacity).intValue())
//                .allowCoreThreadTimeOut(true)
//                .build();
        ThreadPoolExecutor taskExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return AsyncConfigurer.super.getAsyncUncaughtExceptionHandler();
    }
}
