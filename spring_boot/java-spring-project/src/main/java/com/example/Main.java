/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.server.JettyServer;

public class Main {
    public static void main(String[] args) throws Exception {
        JettyServer server = new JettyServer();
        server.start();
    }
}