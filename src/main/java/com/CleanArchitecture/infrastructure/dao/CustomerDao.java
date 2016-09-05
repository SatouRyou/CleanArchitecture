package com.CleanArchitecture.infrastructure.dao;

import com.CleanArchitecture.domain.dto.CustomerDto;
import com.CleanArchitecture.domain.store.CustomerStore;
import com.CleanArchitecture.infrastructure.entity.CustomerEntity;
import com.CleanArchitecture.infrastructure.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by teradashoutarou on 2016/09/05.
 */
public class CustomerDao implements CustomerStore {

    @Autowired
    private CustomerRepository customerRepository;

    public CustomerDto getCustomerDto( int id ) {
        List<CustomerEntity> customerEntityList = this.customerRepository.findById( String.valueOf( id ) );
        if ( customerEntityList == null ) {
            return new CustomerDto();
        }
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customerDto, customerEntityList.get(0));
        return  customerDto;
    }
}
