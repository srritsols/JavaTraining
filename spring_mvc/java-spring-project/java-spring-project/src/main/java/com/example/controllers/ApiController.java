package com.example.controllers;

import com.example.model.App;
import com.example.model.Instance;
import com.example.services.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "/apps/{appName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody App getDetailsByApp(@PathVariable("appName") String appName ){
        return appService.getAppByName(appName);
    }


    @RequestMapping(value = "/apps/{appName}/**/**", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Instance getApps(@PathVariable("appName") String appName, HttpServletRequest request) {

        String url = request.getRequestURI();
        String[] urlPaths = url.split("/");
        System.out.println("urlPaths :" + urlPaths.length);
        if(urlPaths.length < 8) {
            String[] hostUrl = urlPaths[6].split(":");

            return appService.getAppByHostName(appName, hostUrl[0],Integer.valueOf(hostUrl[1]));
        }else{
            return null;
        }
    }


}
