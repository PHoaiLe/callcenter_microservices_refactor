package com.callcenter.Controllers.version1;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerInfoControllerDeleteMethodsV1
{
    @DeleteMapping(path = "/stored_location/{customerId}")
    public boolean deleteStoredLocation(@PathVariable Long customerId, @RequestBody Integer locationId)
    {
        return true;
    }


}
