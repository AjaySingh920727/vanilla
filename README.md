# Assignment

[Click here to read the assignment](./docs/assignment.md)

## vanilla

This is a base starter kit framework that you can use to build your tests for the above assignment.
However, if you are more comfortable with your own tool kit, feel free to use that as well!

## Execution Instructions

#### Execution On Local Machine:
Use this Maven Run command to run test in local machine: 
> mvn test -Dcucumber.options="--tags @amazon" -DHOST=host.localhost


#### Execution with Selenium Grid:
1. Download Selenium server standalone package from here - https://www.selenium.dev/downloads/
2. Copy jar file to project directory
3. Open terminal from the project directory and Run the command (replace filename with downloaded filename) :
    1. `java -jar filename.jar standalone`
4. Verify hub and nodes is up at : http://localhost:4444/ui
5. Use this Maven Run command to run test in Selenium Grid
> mvn test -Dcucumber.options="--tags @amazon" -DHOST=host.docker.selenium.grid


#### Execution On Docker Containers with Docker Compose file:
1. Setup Selenium hub and browsers Containers using below Docker Compose command for docker-compose-v3-swarm.yml file
> docker compose -f docker-compose-v3-swarm.yml up -d
2. Check docker containers are up and running
> docker ps
3. Verify hub and nodes is up at : http://localhost:4444/ui 
4. Use this Maven Run command to run test in Docker Selenium Hub 
> mvn clean test -DHOST=host.docker.container




## External dependencies

For this project to run, you would need to install below 3 dependencies on your machine:

- **[Java 11](https://openjdk.java.net/projects/jdk/11/)** (as the core programming language)
- **[Maven 3.8.5](https://maven.apache.org/download.cgi)** (for dependency management)
- **[Google Chrome latest version](https://www.google.com/chrome/?brand=CHBD&gclid=Cj0KCQjwr-SSBhC9ARIsANhzu15P0PA-n9Zp4NpxKaOHVGtBD1TZQH0HlQQE6hUfsOFAU1nf-Rzdlf4aAoTJEALw_wcB&gclsrc=aw.ds)** (browser to run your tests)

> If your JAVA_HOME is set to anything other than JDK 11, you would need to update the path. Else your project
> will not run. Also, do remember to set the correct JDK settings in your IDE.

## Getting Started

For easiest way to getting started, extract this project and open it from IntelliJ.
> Then Do a dry run on test in : test -> java -> TestSandbox class and see if your setup is correct.  

Tip: Do remember to update this readme file for anything else that you think needs updating here!

## Success
