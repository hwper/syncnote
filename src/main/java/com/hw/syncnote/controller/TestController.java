package com.hw.syncnote.controller;

import com.hw.syncnote.dao.LogTestDao;
import com.hw.syncnote.entity.LogTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by hw on 2017/4/2.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private LogTestDao logTestDao;


    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String list(Model model){
        List<LogTest> logTestList = logTestDao.findAll();
        model.addAttribute("list", logTestList);
        return "test";

    }
}
