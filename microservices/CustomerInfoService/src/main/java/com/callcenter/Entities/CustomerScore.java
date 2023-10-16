package com.callcenter.Entities;

import com.callcenter.Entities.Constant.TableNames;
import jakarta.persistence.*;

@Entity
@Table(name = TableNames.CUSTOMER_SCORE)
public class CustomerScore
{
    @Id
    @SequenceGenerator(name = "customer_score_id_generator"
    , sequenceName = "customer_score_id_generator")
    @GeneratedValue(generator = "customer_score_id_generator"
    , strategy = GenerationType.SEQUENCE)
    @Column(name = "customerId")
    private Long customerId;

    private Integer customerAccumulatedScore;
}
