package com.callcenter.Services;

import com.callcenter.Configuration.AsyncConfiguration;
import com.callcenter.ExternalRequests.RegisterRequest;
import com.callcenter.Repositories.AuthInfoRepositoryV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;

@Service
public class AuthInfoServiceV1
{
    @Autowired
    private AuthInfoRepositoryV1 repository;
    @Autowired
    private Executor executor;

    public Executor getExecutor()
    {
        return this.executor;
    }

    public void registerAccount(RegisterRequest request)
    {

    }
}
