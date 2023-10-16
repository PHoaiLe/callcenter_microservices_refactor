package com.callcenter.Repositoris;

import com.callcenter.Entities.CustomerScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerScoreRepository extends JpaRepository<CustomerScore, String>
{

}
