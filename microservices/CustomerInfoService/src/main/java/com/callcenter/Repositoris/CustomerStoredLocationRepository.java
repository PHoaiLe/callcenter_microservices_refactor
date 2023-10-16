package com.callcenter.Repositoris;

import com.callcenter.Entities.CustomerStoredLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerStoredLocationRepository extends JpaRepository<CustomerStoredLocation, String>
{
    
}
