package com.callcenter.Controllers.version1;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/v1/customer")
public class CustomerInfoControllerPatchMethodsV1
{
    @PatchMapping(path = "/info/name/{id}")
    public boolean updateCustomerName(@PathVariable Long id, @RequestBody String newName)
    {
        return true;
    }

    @PatchMapping(path = "/info/dob/{id}")
    public boolean updateCustomerDob(@PathVariable Long id, @RequestBody Date newDob)
    {
        return true;
    }

    @PatchMapping(path = "/info/email/{id}")
    public boolean updateCustomerEmail(@PathVariable Long id, @RequestBody String newEmail)
    {
        return true;
    }

    @PatchMapping(path = "/info/phone/{id}")
    public boolean updateCustomerPhone(@PathVariable Long id, @RequestBody String newPhoneNumber)
    {
        return true;
    }

    @PatchMapping(path = "/info/avatar/{id}")
    public boolean updateCustomerAvatar(@PathVariable Long id)
    {
        return true;
    }

    @PatchMapping(path = "/info/gender/{id}")
    public boolean updateCustomerGender(@PathVariable Long id, @RequestBody Boolean gender)
    {
        return true;
    }

    @PatchMapping(path = "/info/cus_type/{id}")
    public boolean updateCustomerType(@PathVariable Long id, @RequestBody Integer type)
    {
        return true;
    }

    @PatchMapping(path = "/info/cus_status/{id}")
    public boolean updateCustomerStatus(@PathVariable Long id, @RequestBody Integer status)
    {
        return true;
    }

    @PatchMapping(path = "/score/{id}")
    public boolean updateCustomerAccumulatedScore(@PathVariable Long id, @RequestBody Integer newScore)
    {
        return true;
    }

    @PatchMapping(path = "/stored_location/{customerId}")
    public boolean updateStoredLocationSelectedScore(@PathVariable Long customerId, @RequestBody Integer locationSelectedScore)
    {
        return true;
    }
}
