package com.callcenter.Services.version1;

import com.callcenter.Entities.CustomerInfo;
import com.callcenter.Repositoris.CustomerInfoRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

@Service
public class CustomerInfoServiceV1
{
    private CustomerInfoRepository repository;
    @Autowired
    private Executor asyncExecutor;

    @Autowired
    public CustomerInfoServiceV1(CustomerInfoRepository repository)
    {
        this.repository = repository;
    }

    public CustomerInfo getCustomerInfoById(Long customerId)
    {
//        return CompletableFuture.supplyAsync(new Supplier<CustomerInfo>() {
//            @Override
//            public CustomerInfo get() {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println(Thread.currentThread().getName() + ": inside Supplier");
//                return repository.findById(customerId).get();
//            }
//        }, asyncExecutor);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            return null;
        }
        System.out.println(Thread.currentThread().getName() + ": inside Supplier");
        try
        {
            return repository.findById(customerId).get();
        }
        catch (Exception ex)
        {
            return null;
        }
    }

    public Executor getAsyncExecutor()
    {
        return asyncExecutor;
    }
}
