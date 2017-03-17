package com.skyon.pms.controller;

import com.skyon.pms.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sut on 2017/3/17.
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String getActivity() {
        return activityService.getActivity().toString();
    }

}
