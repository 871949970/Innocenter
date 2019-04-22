package com.inno.eurekaclient.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {


    @RequestMapping("/")
    public String echo()    {

        return "Hello----------Cloud";

    }
}
