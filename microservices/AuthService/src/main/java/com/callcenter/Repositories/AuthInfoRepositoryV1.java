package com.callcenter.Repositories;

import com.callcenter.Entities.AuthInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthInfoRepositoryV1 extends JpaRepository<AuthInfo, Long>
{
    Optional<AuthInfo> findByPhone(String userPhone);
}
