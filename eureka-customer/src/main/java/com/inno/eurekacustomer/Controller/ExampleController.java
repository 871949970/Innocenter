package com.inno.eurekacustomer.Controller;

import com.inno.eurekacustomer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {



    @Autowired
    CustomerService customerService;


    @RequestMapping("/")
    public String echo() {


        String name=customerService.echo();

        return name;

    }
}
