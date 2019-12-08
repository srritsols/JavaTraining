package com.example.model;

import java.util.ArrayList;
import java.util.List;

/**
 * An App has a name, a default command line argument and a list of instances to map
 * the app to a host and port
 */
public class App {

    private final String name;
    private final String argument;
    private final List<Instance> instances = new ArrayList();

    public App(String name, String argument) {
        this.name = name;
        this.argument = argument;
    }

    public void addInstance(String host, int port, String argument) {
        instances.add(new Instance(host, port, argument));
    }

    public void addInstance(String host, int port) {
        instances.add(new Instance(host, port, ""));
    }

    public String getName() {
        return name;
    }

    public String getArgument() {
        return argument;
    }

    public List<Instance> getInstances() {
        return instances;
    }
}
