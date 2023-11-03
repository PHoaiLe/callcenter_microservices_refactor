package com.callcenter.Controllers.version1;


import com.callcenter.ExternalRequests.RegisterRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("api/v1/auth")
public class PostMethodControllerV1
{
    @PostMapping(path = "/register"
    , consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public boolean registerAccount(RegisterRequest request)
    {
        System.out.println(request);

        return true;
    }
}
