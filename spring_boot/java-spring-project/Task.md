# Interview Problems

## Java

Browse through the included java-spring-project. This project is a simple Spring MVC app run with an embedded Jetty server. This application has three facets:

- A Spring MVC based ApiController to return JSON responses when the user hits an api/v1/ url
- A Spring Service to handle any business logic for dealing with applications and their metadata
- A set of POJOs for storing information about applications and application instances.

You can launch this app by executing `gradle run` and pointing your browser
to http://localhost:8090/api/v1/apps

This should return a JSON response like this:

```json
[
  {
    "name": "app1",
    "argument": "-Darg1=arg1 -Xmx4G -Xms1024M",
    "instances": [
      {
        "host": "host1.example.com",
        "port": 5000,
        "argument": "-Xmx2G -Xms1G -Darg1=arg1override"
      },
      {
        "host": "host2.example.com",
        "port": 5000,
        "argument": ""
      }
    ]
  },
  {
    "name": "app2",
    "argument": "-Darg1=arg2 -Xmx1G -Xms512M",
    "instances": [
      {
        "host": "host1.example.com",
        "port": 5001,
        "argument": "-Xmx10G"
      }
    ]
  },
  {
    "name": "app3",
    "argument": "-Darg1=arg2 -Xmx2G -Xms2G",
    "instances": [
      {
        "host": "host2.example.com",
        "port": 5001,
        "argument": ""
      }
    ]
	
  }
]
```

### Task 1 - Add a new REST url a single App

Add a new REST url to return just a single app by name, rather than all apps.

Hitting the url http://localhost:8090/api/v1/apps/app1 should return the following:

```json
{
  "name": "app1",
  "argument": "-Darg1=arg1 -Xmx4G -Xms1024M",
  "instances": [
    {
      "host": "host1.example.com",
      "port": 5000,
      "argument": "-Xmx2G -Xms1G -Darg1=arg1override"
    },
    {
      "host": "host2.example.com",
      "port": 5000,
      "argument": ""
    }
  ]
}
```

### Task 2 - Add a new REST url for an Instance

Add a new REST url to return an instance of an app keyed by the host and port

Hitting the url http://localhost:8090/api/v1/instances/host1.example.com:5000 should return the following:

```json
{
  "host": "host1.example.com",
  "port": 5000,
  "argument": "-Xmx2G -Xms1G -Darg1=arg1override"
}
```

### Task 3 - Calculate memory usage for an Instance

Add a new REST url to return the memory settings for an application's instance, in megabytes.

Make the following assumptions:

- The arguments of an instance are a composite of the app argument and the instance argument
  - For example, the above instance host1.example.com:5000 for app1 would have a composite argument of: `-Darg1=arg1 -Xmx4G -Xms1024M -Xmx2G -Xms1G -Darg1=arg1override`
- Assume we only have megabytes and gigabytes as units (i.e. -Xmx1G or -Xmx512M)
- Assume 1000 megabytes per gigabyte
- For an application, an instance argument overrides an app argument (it occurs later in the composite argument string)

Hitting the url http://localhost:8090/api/v1/instances/host1.example.com:5000/memory-usage should return the following:

```json
{
  "minMemory": 1000.0,
  "maxMemory": 2000.0
}
```

Feel free to modify the models, service and controller methods, but assume the app "data" initialized in AppService.postConstruct() comes from a database and cannot be changed. I.e., you can add a helper field or method to the model class, but the initialization in preConstruct() must remain the same.

## What I am looking for

I want to see that the candidate is able to:

- Read through an existing codebase and understand it
- Add functionality to the codebase
- Write clean and readable code
