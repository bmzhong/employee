package cn.blabla.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class ListController {

    @RequestMapping("/toList")
    public String toList(){
        return "employee/list";
    }
}
