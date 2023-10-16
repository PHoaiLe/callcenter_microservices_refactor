package com.callcenter.Entities;

import com.callcenter.Entities.Constant.InitializedValueConventions;
import com.callcenter.Entities.Constant.TableNames;
import jakarta.persistence.*;

import java.io.InterruptedIOException;

@Entity
@Table(name = TableNames.CUSTOMER_TYPE)
public class CustomerType
{
    @Id
    @SequenceGenerator(name = "customer_type_id_generator"
    , sequenceName = "customer_type_id_generator")
    @GeneratedValue(generator = "customer_type_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "typeId")
    private Integer typeId;

    private String typeDescription;

    public CustomerType()
    {
        typeId = InitializedValueConventions.NON_VALUE_INITIALIZED_INTEGER;
        typeDescription = InitializedValueConventions.NON_VALUE_INITIALIZED_STRING;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeDescription() {
        return typeDescription;
    }

    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

    @Override
    public String toString() {
        return "CustomerType{" +
                "typeId=" + typeId +
                ", typeDescription='" + typeDescription + '\'' +
                '}';
    }
}
