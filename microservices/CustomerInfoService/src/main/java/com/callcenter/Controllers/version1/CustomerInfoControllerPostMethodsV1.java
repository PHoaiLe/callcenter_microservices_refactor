package com.callcenter.Controllers.version1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerInfoControllerPostMethodsV1
{

    @PostMapping(path = "/new_info")
    public @ResponseBody boolean postCustomerInfo()
    {
        return true;
    }

    @PostMapping(path = "/new_stored_location/{customerId}")
    public boolean postNewStoredLocation(@PathVariable Long customerId, @RequestBody Object locationInfo)
    {
        return true;
    }

    @PostMapping(path = "/info/avatar/{id}")
    public boolean postCustomerAvatar(@PathVariable Long id)
    {
        return true;
    }
}
