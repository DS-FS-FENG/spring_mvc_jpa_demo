package com.mahosyojyo.controller;

import com.mahosyojyo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by FredFung on 2014/6/2.
 * sample controller
 */

/* TODO define controller that handle request*/
@Controller
@RequestMapping("/sample") //Controller mapping, tell dispatcherServlet when to use this controller
public class SampleController {
    @Resource(name = "userServiceImpl")
    private IUserService userService;

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET) //Configure request method
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "SpringMVC Hello World");

        //forward and redirect
        //reture "redirect:/pages/testServlet";

        model.addAttribute("service", userService.hashCode());
        return "forward:/pages/sample";

        //return "hello";
    }
}
