package com.example.controllers;

import com.example.model.App;
import com.example.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api/v1", method = RequestMethod.GET)
public class ApiController {

    @Autowired
    AppService appService;

    @RequestMapping(value = "apps", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<App> getApps() {
        return appService.getApps();
    }

}
