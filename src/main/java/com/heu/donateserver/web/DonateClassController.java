package com.heu.donateserver.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/hello")
public class HelloController {

    @RequestMapping(value = "/hello", method = GET, produces = "application/json")
    public WebResponse<Test> getMsg(@PathVariable Long id) {

    }
}
