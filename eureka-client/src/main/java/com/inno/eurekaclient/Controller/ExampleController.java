package com.inno.eurekaclient.Controller;

import com.inno.eurekaclient.Service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {

    @Autowired
    private UserServiceImpl userService;


    @RequestMapping("/")
    public String echo()    {

        String name=userService.selectAll();
        return name;

    }
}
