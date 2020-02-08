package com.lemonfish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Masics 张超
 * @date 2020/2/5 23:26
 */
@Controller
public class CommonController {
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/toMain")
    public String toMain() {
        return "main";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "index";
    }


    @RequestMapping("/toCommon")
    public String toCommon(@RequestParam("test") String test, Model model) {
        model.addAttribute("test", test);
        return "common";
    }
}




