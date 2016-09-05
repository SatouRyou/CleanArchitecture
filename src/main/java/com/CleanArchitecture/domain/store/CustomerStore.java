package com.CleanArchitecture.domain.store;

import com.CleanArchitecture.domain.dto.CustomerDto;

/**
 * Created by teradashoutarou on 2016/09/05.
 */
public interface CustomerStore {

    public CustomerDto getCustomerDto( int id );
}
