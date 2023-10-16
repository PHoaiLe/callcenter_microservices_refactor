package com.callcenter.Entities;

import com.callcenter.CustomerInfoService;
import com.callcenter.Entities.Constant.InitializedValueConventions;
import com.callcenter.Entities.Constant.TableNames;
import com.callcenter.Entities.IdClasses.CustomerStoredLocationIdClass;
import jakarta.persistence.*;
import lombok.Value;

@Entity
@Table(name = TableNames.CUSTOMER_STORED_LOCATION)
@IdClass(value = CustomerStoredLocationIdClass.class)
public class CustomerStoredLocation
{
    @Id
    @SequenceGenerator(name = "customer_stored_location_id_generator"
    , sequenceName = "customer_stored_location_id_generator")
    @GeneratedValue(generator = "customer_stored_location_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "locationId")
    private Integer locationId;

    @SequenceGenerator(name = "customer_stored_location_customer_id_generator"
    , sequenceName = "customer_stored_location_customer_id_generator")
    @GeneratedValue(generator = "customer_stored_location_customer_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "customerId")
    private Long customerId;

    private String locationName;
    private Double locationLongitude;
    private Double locationLatitude;
    //accumulated selected score
    private Integer locationScore;

    public CustomerStoredLocation()
    {
        locationId = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
        customerId = InitializedValueConventions.NON_VALUE_INITIALIZED_LONG;
        locationName = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        locationLongitude = InitializedValueConventions.NON_VALUE_INITIALIZED_DOUBLE;
        locationLatitude = InitializedValueConventions.NON_VALUE_INITIALIZED_DOUBLE;
        locationScore = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Double getLocationLongitude() {
        return locationLongitude;
    }

    public void setLocationLongitude(Double locationLongitude) {
        this.locationLongitude = locationLongitude;
    }

    public Double getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(Double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public Integer getLocationScore() {
        return locationScore;
    }

    public void setLocationScore(Integer locationScore) {
        this.locationScore = locationScore;
    }

    @Override
    public String toString() {
        return "CustomerStoredLocation{" +
                "locationId=" + locationId +
                ", customerId=" + customerId +
                ", locationName='" + locationName + '\'' +
                ", locationLongitude=" + locationLongitude +
                ", locationLatitude=" + locationLatitude +
                ", locationScore=" + locationScore +
                '}';
    }
}
