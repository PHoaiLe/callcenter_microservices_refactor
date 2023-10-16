package com.callcenter.Entities;

import com.callcenter.Entities.Constant.InitializedValueConventions;
import com.callcenter.Entities.Constant.TableNames;
import jakarta.persistence.*;

@Entity
@Table(name = TableNames.CUSTOMER_STATUS)
public class CustomerStatus
{
    @Id
    @SequenceGenerator(name = "customer_status_id_generator"
    , sequenceName = "customer_status_id_generator")
    @GeneratedValue(generator = "customer_status_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "statusId")
    private Integer statusId;

    private String statusDescription;

    public CustomerStatus()
    {
        statusId = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
        statusDescription = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Override
    public String toString() {
        return "CustomerStatus{" +
                "statusId=" + statusId +
                ", statusDescription='" + statusDescription + '\'' +
                '}';
    }
}
