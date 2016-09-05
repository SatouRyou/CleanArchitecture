package com.CleanArchitecture.infrastructure.repository;

import com.CleanArchitecture.infrastructure.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by teradashoutarou on 2016/09/05.
 */
@Repository
@Component
public interface CustomerRepository extends JpaRepository<CustomerEntity, String> {

    public List<CustomerEntity> findById(String id);
}
