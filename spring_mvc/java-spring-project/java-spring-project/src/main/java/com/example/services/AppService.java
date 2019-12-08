package com.example.services;

import com.example.model.App;
import com.example.model.Instance;
import com.example.model.MemoryUsage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * This service manages apps
 */
@Service
public class AppService {
    private List<App> apps = new ArrayList<>();

    @PostConstruct
    public void postConstruct() {
        // add some sample data for testing
        App app1 = new App("app1", "-Darg1=arg1 -Xmx4G -Xms1024M");
        app1.addInstance("host1.example.com", 5000, "-Xmx2G -Xms1G -Darg1=arg1override");
        app1.addInstance("host2.example.com", 5000);

        App app2 = new App("app2", "-Darg1=arg2 -Xmx1G -Xms512M");
        app2.addInstance("host1.example.com", 5001, "-Xmx10G");

        App app3 = new App("app3", "-Darg1=arg2 -Xmx2G -Xms2G");
        app3.addInstance("host2.example.com", 5001);

        apps.add(app1);
        apps.add(app2);
        apps.add(app3);
    }

    public List<App> getApps() {
        return apps;
    }

    public App getAppByName(String appName) {
        App appDetails = new App("", "");
        for (App app : apps) {
            if (app.getName().equalsIgnoreCase(appName)) {
                appDetails = app;
            }

        }
        return appDetails;
    }

    public Instance getAppByHostName(String appName, String host, Integer port) {
        Instance instance = null;
        for (App app : apps) {
            if(app.getName().equalsIgnoreCase(appName)) {
                List<Instance> instances = app.getInstances();
                for (Instance instanceDetails : instances) {
                    if (instanceDetails.getHost().equalsIgnoreCase(host) && instanceDetails.getPort() == port) {
                        instance = instanceDetails;
                    }
                }
            }
        }
        return instance;
    }

}