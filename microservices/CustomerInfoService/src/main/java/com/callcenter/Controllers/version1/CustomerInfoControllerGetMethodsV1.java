package com.callcenter.Controllers.version1;

import com.callcenter.Entities.CustomerInfo;
import com.callcenter.Repositoris.CustomerInfoRepository;
import com.callcenter.Services.version1.CustomerInfoServiceV1;
import jakarta.servlet.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerInfoControllerGetMethodsV1
{
    CustomerInfoServiceV1 service;

    @Autowired
    public CustomerInfoControllerGetMethodsV1(CustomerInfoServiceV1 service)
    {
        this.service = service;
    }

    @GetMapping(path = "/info/{id}")
    public CompletableFuture<ResponseEntity<CustomerInfo>> getCustomerInfo(@PathVariable Long id) throws InterruptedException {
        String start = id.toString() + ": " + LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
        System.out.println(Thread.currentThread().getName() + ": request at " + start);
        CompletableFuture<ResponseEntity<CustomerInfo>> asyncResult = CompletableFuture.supplyAsync(new Supplier<ResponseEntity<CustomerInfo>>() {
            @Override
            public ResponseEntity<CustomerInfo> get() {
                CustomerInfo data = service.getCustomerInfoById(id);
                ResponseEntity<CustomerInfo> response = new ResponseEntity<>(data, HttpStatus.OK);
                return response;
            }
        }, service.getAsyncExecutor());
        String end = id.toString() + ": " + LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
        System.out.println(Thread.currentThread().getName() + ": response at " + end);
        return asyncResult;
    }

    @GetMapping(path = "/score/{id}")
    public ResponseEntity<CustomerInfo> getCustomerScore(@PathVariable Long id) throws InterruptedException {
        String start = id.toString() + ": " + LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
        System.out.println(Thread.currentThread().getName() + ": request at " + start);
        CustomerInfo data = service.getCustomerInfoById(id);
        String end = id.toString() + ": " + LocalTime.now().getHour()+":"+LocalTime.now().getMinute()+":"+LocalTime.now().getSecond();
        System.out.println(Thread.currentThread().getName() + ": response at " + end);
        ResponseEntity<CustomerInfo> responseValue = new ResponseEntity<>(data ,HttpStatus.OK);
        return responseValue;
    }

    @GetMapping(path = "/stored_location/{id}")
    public boolean getCustomerStoredLocations(@PathVariable Long id)
    {
        System.out.println("id:" + id);
        return true;
    }
    
    @GetMapping(path = "/status")
    public boolean getAvailableStatus()
    {
        return true;
    }
}
