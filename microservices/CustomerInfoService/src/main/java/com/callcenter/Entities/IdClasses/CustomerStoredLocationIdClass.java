package com.callcenter.Entities.IdClasses;

import com.callcenter.Entities.Constant.InitializedValueConventions;

import java.io.Serializable;

public class CustomerStoredLocationIdClass implements Serializable
{
    private Integer locationId;
    private Long customerId;

    public CustomerStoredLocationIdClass()
    {
        locationId = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
        customerId = InitializedValueConventions.NON_VALUE_INITIALIZED_LONG;
    }

    //equal() and hashCode()
}
