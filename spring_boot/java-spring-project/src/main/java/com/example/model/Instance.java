package com.example.model;

/**
 * An instance is made up of a host, port and argument
 */
public class Instance {
    private final String host;
    private final int port;
    private final String argument;

    public Instance(String host, int port, String argument) {
        this.host = host;
        this.port = port;
        this.argument = argument;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getArgument() {
        return argument;
    }
}
