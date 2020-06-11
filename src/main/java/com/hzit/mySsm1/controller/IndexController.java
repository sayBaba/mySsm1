package com.hzit.mySsm1.controller;

import com.hzit.mySsm1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/show")
    public String showIndex(Model model){

        String name = indexService.query();

        model.addAttribute("name",name);

        return "index";
    }
}
