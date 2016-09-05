package com.CleanArchitecture.controller;

import com.CleanArchitecture.domain.dto.CustomerDto;
import com.CleanArchitecture.usecase.Usecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * restControllerクラス
 * rest通信で送られてきた情報を取得する
 * Created by teradashoutarou on 2016/09/02.
 */
// このアノテーションをつけるとrest通信を受信するクラスになる
@RestController
// このアノテーションで、このクラスにアクセスするためのアドレスを指定している
@RequestMapping("/restController")
public class controller {

    // このアノテーションでDIを行う
    @Autowired
    private Usecase usecase;

    // このアノテーションで、このメソッドにアクセスするための追加アドレスと通信方式を指定している
    // この場合　localhost:8080/restController/helloWorld のget通信でアクセス可能
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String getHelloWorld() {
        return "helloWorld";
    }

    // この場合　localhost:8080/restController/getCustomer のPOST通信でアクセス可能
    @RequestMapping(value = "/getCustomer", method = RequestMethod.POST)
    public CustomerDto getCustomerDto(@RequestBody int userId ) {
        return this.usecase.getCustomerDto( userId );
    }
}
