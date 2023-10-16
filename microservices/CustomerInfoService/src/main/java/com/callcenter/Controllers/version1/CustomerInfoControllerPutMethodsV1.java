package com.callcenter.Controllers.version1;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "/api/v1/customer")
public class CustomerInfoControllerPutMethodsV1
{

    @PutMapping(path = "/stored_location/{customerId}")
    public boolean updateStoredLocation(@PathVariable Long customerId, @RequestBody Object locationInfo)
    {
        return true;
    }
}
