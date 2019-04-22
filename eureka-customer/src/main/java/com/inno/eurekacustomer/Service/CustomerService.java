package com.inno.eurekacustomer.Service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@FeignClient(name= "eureka-producer")
public interface CustomerService {



    @RequestMapping("/")
    String echo();
}
