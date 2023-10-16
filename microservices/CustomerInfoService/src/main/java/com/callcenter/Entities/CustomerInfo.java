package com.callcenter.Entities;

import com.callcenter.Entities.Constant.InitializedValueConventions;
import com.callcenter.Entities.Constant.TableNames;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = TableNames.CUSTOMER_INFO)
public class CustomerInfo
{
    @Id
    @SequenceGenerator(name = "customer_info_id_generator"
    , sequenceName = "customer_info_id_generator")
    @GeneratedValue(generator = "customer_info_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "customerId")
    private Long customer_id;

    private String customer_name;
    private LocalDate customer_dob;
    private String customer_email;
    private String customer_phone;
    private String customer_avatar;
    private Boolean customer_gender;
    private LocalDateTime created_datetime;
    private Integer customer_type;
    private Integer customer_status;

    public CustomerInfo()
    {
        customer_name = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        customer_dob = LocalDate.now();
        customer_phone = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        customer_avatar = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
        customer_gender = InitializedValueConventions.NON_VALUE_INITIALIZED_BOOLEAN;
        created_datetime = LocalDateTime.now();
        customer_type = 1;
        customer_status = 1;
    }

    public CustomerInfo(Long customerId, String customerName, LocalDate customerDob,
                        String customerEmail, String customerPhone, String customerAvatar,
                        Boolean customerGender, LocalDateTime createdDateTime, Integer customerType, Integer customerStatus) {
        this.customer_id = customerId;
        this.customer_name = customerName;
        this.customer_dob = customerDob;
        this.customer_email = customerEmail;
        this.customer_phone = customerPhone;
        this.customer_avatar = customerAvatar;
        this.customer_gender = customerGender;
        this.created_datetime = createdDateTime;
        this.customer_type = customerType;
        this.customer_status = customerStatus;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public LocalDate getCustomer_dob() {
        return customer_dob;
    }

    public void setCustomer_dob(LocalDate customer_dob) {
        this.customer_dob = customer_dob;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_avatar() {
        return customer_avatar;
    }

    public void setCustomer_avatar(String customer_avatar) {
        this.customer_avatar = customer_avatar;
    }

    public Boolean getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public LocalDateTime getCreated_datetime() {
        return created_datetime;
    }

    public void setCreated_datetime(LocalDateTime created_datetime) {
        this.created_datetime = created_datetime;
    }

    public Integer getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(Integer customer_type) {
        this.customer_type = customer_type;
    }

    public Integer getCustomer_status() {
        return customer_status;
    }

    public void setCustomer_status(Integer customer_status) {
        this.customer_status = customer_status;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_dob=" + customer_dob +
                ", customer_email='" + customer_email + '\'' +
                ", customer_phone='" + customer_phone + '\'' +
                ", customer_avatar='" + customer_avatar + '\'' +
                ", customer_gender=" + customer_gender +
                ", created_datetime=" + created_datetime +
                ", customer_type=" + customer_type +
                ", customer_status=" + customer_status +
                '}';
    }
}
