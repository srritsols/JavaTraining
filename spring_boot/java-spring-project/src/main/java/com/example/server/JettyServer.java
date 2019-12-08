package com.example.server;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class JettyServer {

    /**
     * Start a simple embedded Jetty server with a spring MVC webapp as a dispatcher
     * @throws Exception
     */
    public void start() throws Exception {
        // create a new embedded jetty server
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8090);
        server.setConnectors(new Connector[]{connector});

        // add in a spring handler
        HandlerCollection handlers = new HandlerCollection();
        handlers.addHandler(getServletContextHandler());
        server.setHandler(handlers);

        // start the server
        server.start();
    }

    private ServletContextHandler getServletContextHandler() {
        // Create a new WebAppContext to run our spring webapp in the embedded jetty server
        WebAppContext webAppContext = new WebAppContext();
        webAppContext.setContextPath("/");
        webAppContext.setResourceBase(Resource.newClassPathResource("/webapp").toString());

        // Create a dispatcher servlet using a spring WebMVC configuration class and tell it to handle all / requests
        AnnotationConfigWebApplicationContext annotationConfigContext = new AnnotationConfigWebApplicationContext();
        annotationConfigContext.register(SpringConfiguration.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(annotationConfigContext);

        // Create a ServletHolder to tell spring to respond to all requests
        ServletHolder servletHolder = new ServletHolder("default", dispatcherServlet);
        webAppContext.addServlet(servletHolder, "/");
        webAppContext.addEventListener(new ContextLoaderListener(annotationConfigContext));

        return webAppContext;
    }
}
