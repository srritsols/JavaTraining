package com.example.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppServiceTest {

    AppService appService;

    @Before
    public void setUp() throws Exception {
        appService = new AppService();
        appService.postConstruct();
    }

    @Test
    public void getApps() {
        assertEquals(3, appService.getApps().size());
    }
}