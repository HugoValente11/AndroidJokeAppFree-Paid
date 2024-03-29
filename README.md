## Project Overview

App with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. The finished app will consist
of four modules. A Java library that provides jokes, a Google Cloud Endpoints
(GCE) project that serves those jokes, an Android Library containing an
activity for displaying jokes, and an Android app that fetches jokes from the
GCE module and passes them to the Android Library for display.

## Why this Project

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.


* Add free and paid flavors to the app, and set up build to share code between them
* Configure a multi project build to compile libraries and app
* Gradle App Engine plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server

## Instructions

Start or stop the local server by using the gradle tasks as shown in the following screenshot:
![instruction](https://user-images.githubusercontent.com/25724955/46161359-4179c500-c27d-11e8-9927-873a049822db.png)

After the server is running you can run the app and it will load the jokes from the server.

## Screenshots - Free version 

![free 1](https://user-images.githubusercontent.com/25724955/46096271-b33b0b80-c1b6-11e8-931b-28cf3646c323.png)
![free 2](https://user-images.githubusercontent.com/25724955/46096273-b33b0b80-c1b6-11e8-8bf8-16ed54f26c83.png)

## Screenshots - Paid Version (NO ADS AND DIRTY JOKE BUTTON)

![paid 1](https://user-images.githubusercontent.com/25724955/46096274-b33b0b80-c1b6-11e8-979a-40dac8aee053.png)
![paid 2](https://user-images.githubusercontent.com/25724955/46096275-b3d3a200-c1b6-11e8-82b4-00999bee89e6.png)

