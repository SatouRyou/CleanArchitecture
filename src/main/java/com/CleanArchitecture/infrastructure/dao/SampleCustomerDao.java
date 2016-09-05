package com.CleanArchitecture.infrastructure.dao;

import com.CleanArchitecture.domain.dto.CustomerDto;
import com.CleanArchitecture.domain.store.CustomerStore;
import com.CleanArchitecture.infrastructure.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by teradashoutarou on 2016/09/05.
 */
@Component
public class SampleCustomerDao implements CustomerStore {

    public CustomerDto getCustomerDto(int id )  {
        CustomerDto customerDto = new CustomerDto();
        return  customerDto;
    }
}
