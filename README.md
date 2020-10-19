# j-road-starter
This project is not related to [nortal/j-road](https://github.com/nortal/j-road). 
It is simple alternative, that doesn't keep any generated sources. You will also 
need to generate necessary classes in your project. Check out examples.

##How X-Road works?
X-Road is the way to securely exchange the data between e-Country services. The base 
idea is that you have security servers at both points. So if you need to test service
providing/consumption, you need security server at your point. The second thing is to
get access for your user to use services you need. The current project is not going to
help you do that. These work should be done before you use project's libs. Read more 
[here](https://www.ria.ee/en/state-information-system/x-tee.html).

##What does this project do?
It has two Java-libraries: client and server, where you control everything (including 
marshalling and unmarshalling).

Client lib provides the way to consume other services. It has simple Configuration 
class and simple Service class base. See example of it's usage in "example_client"
module.

Server - TODO description.

##What does this project not do?
This project doesn't keep the bunch of WSDLs and XSDs with generated classes. That's how
it stays clean. The idea is to simplify SOAP logic only. So it's on you to generate Java 
classes from WSDLs you need. It's also recommended to keep these WSDLs and generated
classes in your project's VCS. You can have the task for classes regeneration, like this:

```gradle
configurations {
  jaxws
}

dependencies {
  jaxws "com.sun.xml.ws:jaxws-tools:2.3.2"
  jaxws "com.sun.xml.bind:jaxb-impl:2.3.2"
}

/**
 * Run Gradle with "-PgenWsdlClasses" to regenerate WSDL/XSDs into Java classes.
 **/
task genJaxwsFiles {
  if (project.hasProperty("genWsdlClasses")) {
    delete fileTree("$projectDir/src/main/java/{...}/generated") {
      include "**/*.java"
    }
    ant.taskdef(name: 'wsimport', classname: 'com.sun.tools.ws.ant.WsImport', classpath: configurations.jaxws.asPath)
    ant.wsimport(
        sourcedestdir: "$projectDir/src/main/java",
        package: "{...}.generated",
        wsdl: "$projectDir/src/main/resources/wsdl/{...}.wsdl",
        wsdlLocation: "../{...}/../wsdl/{...}.wsdl",
        keep: true,
        extension: true,
        verbose: true,
        quiet: false,
        xendorsed: true,
        xnocompile: true
    ) {
      xjcarg(value: "-XautoNameResolution")
    }
  }
}
```
