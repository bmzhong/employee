package cn.blabla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {

    @RequestMapping("/employee/toList")
    public String toEmployee() {
        return "employee/list";
    }

    @RequestMapping("/clerk/toList")
    public String toClerk() {
        return "clerk/list";
    }
}
