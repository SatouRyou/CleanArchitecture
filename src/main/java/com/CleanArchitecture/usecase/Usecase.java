package com.CleanArchitecture.usecase;

import com.CleanArchitecture.domain.dto.CustomerDto;
import com.CleanArchitecture.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 単一の処理を行うdomain層を呼ぶためのクラス
 * 登録と、取得を
 * Created by teradashoutarou on 2016/09/03.
 */
public class Usecase {

    @Autowired
    private CustomerService customerService;

    public CustomerDto getCustomerDto( int id ) {
        return this.customerService.getCustomerDto( id );
    }

}
