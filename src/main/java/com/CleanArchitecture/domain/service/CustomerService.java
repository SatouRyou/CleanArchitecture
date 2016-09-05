package com.CleanArchitecture.domain.service;

import com.CleanArchitecture.domain.dto.CustomerDto;
import com.CleanArchitecture.domain.store.CustomerStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by teradashoutarou on 2016/09/03.
 */
// DIされる側に設定するアノテーション
@Component
public class CustomerService {

    @Autowired
    private CustomerStore customerStore;

    public CustomerDto getCustomerDto( int customerNo ) {

        return  this.customerStore.getCustomerDto( customerNo );
    }
}
