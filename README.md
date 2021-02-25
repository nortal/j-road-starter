# j-road-starter
This project is not related to [nortal/j-road](https://github.com/nortal/j-road). 
It is simple alternative, that doesn't keep any generated sources. You will also 
need to generate necessary classes in your project. Check out examples.

## How to use it

### If you need to call some other x-road service

```
    <dependency>
      <groupId>com.nortal.jroad.starter</groupId>
      <artifactId>j-road-client</artifactId>
      <version>0.3.0</version>
    </dependency>
```

### If you need to provide an x-road service

```
    <dependency>
      <groupId>com.nortal.jroad.starter</groupId>
      <artifactId>j-road-server</artifactId>
      <version>0.3.0</version>
    </dependency>
```

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



## Publishing new version to Maven Central
These instructions are needed only for developers and maintainers of this repository.

### First-time actions


#### Create yourself a user in Sonatype repo

https://oss.sonatype.org/

#### Get access rights to publish to Maven Central

You need to create a JIRA ticket and find someone who already has access to (com.nortal) to approve.
Then you need to wait for the rights to be added to your user.

#### Generate yourself a GPG key

```gpg --gen-key```

You get the ID as output. Something like this: FA074FD8AD325C5E16447B587D5B9A643F9CA057
In next commands you need 8 last digits of it: 3F9CA057
And also pick a password that you need later. We use 'myPassword' here

#### Export the secret
```gpg --keyring secring.gpg --export-secret-keys 3F9CA057 > ~/.gnupg/secring.gpg```

#### Set the values in

Use file gradle.properties.sample to create your own version of gradle.properties


### Actions on every release

#### Set correct version
Edit build.gradle

#### New release in GitHub

Tag a new version in GitHub
And then perform a clean clone and checkout on it (to be sure you are a correct tag and that you have no uncommitted changes).

git clone https://github.com/nortal/j-road-starter.git --branch 0.3.0


Avoid creating a relase on working directory (as you might depend on files not committed to VCS)


#### Test signing works

This build has to pass:
```gradle sign -Psigning.secretKeyRingFile=/Users/me/.gnupg/secring.gpg -Psigning.password=myPassword -Psigning.keyId=3F9CA057```

#### You now need to publish your public key

```gpg --keyserver hkp://pool.sks-keyservers.net --send-keys 3F9CA057```

#### Test key is published

```gpg --keyserver hkp://pool.sks-keyservers.net --recv-keys 3F9CA057```

#### Test publishing by publishing to your own Maven Local (~/.m2/repostitory)

```gradle clean sign publishToMavenLocal```

#### Build and publish the artifact

```gradle clean sign publish -Psigning.secretKeyRingFile=/Users/me/.gnupg/secring.gpg -Psigning.password=myPassword -Psigning.keyId=3F9CA057```


#### Log into staging repository

https://oss.sonatype.org/

Click "close".

In case there are any errors you need to solve them before proceeding.

#### Test the update

For every item you need to define a staging repository in dependent component:

```
    <repository>
      <id>stagingJroadStarter</id>
      <name>Maven Central Staging</name>
      <url>https://oss.sonatype.org/content/repositories/comnortaljroad-1056/</url>
    </repository>
```

Clean build the dependent project to test.
Remove from local repository every time you switch to new one.

