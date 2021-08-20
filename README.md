### soap-web-services

## An exercise based on Udemy's course Master Java Web Services and RestFul API with Spring Boot (in28minutes)

In this project we are going to build a basic SOAP service that will allow to execute three operations: GET (All courses) , GET (ById a course) and DELETE (ByID a course).
We wouldn't use a DB. 
We will be used Spring Boot, Spring Boot Web Services and jaxb2-maven-plugin to convert XML to Java code.

Just finished the project, we show some images according to the results obtained after testing the methods with a SOAP tool: SOAP UI

In this image, we test the method getAllCourseDetails 
![Initial Table](https://github.com/caivosco/soap-web-services/blob/main/soap-course-management/src/main/resources/images/gettAll.png)

In this image, we test the method getCourseDetails. We specify which course to see its details 
![Initial Table](https://github.com/caivosco/soap-web-services/blob/main/soap-course-management/src/main/resources/images/getCourse.png)

In this image, we test the method DeleteCourseDetails. We specify which course to delete. In this try - first one - we obtained a success 
![Initial Table](https://github.com/caivosco/soap-web-services/blob/main/soap-course-management/src/main/resources/images/DeleteSuccess.png)

In this image, we test the method DeleteCourseDetails. We specify which course to delete. In this try - second one and using the same id that we used before - we obtained a failure, because that course already does not exist 
![Initial Table](https://github.com/caivosco/soap-web-services/blob/main/soap-course-management/src/main/resources/images/DeleteFailure.png)


## Technologies

# Backend
- Languaje: Java 11
- Spring Boot, Spring Web Services and JAXB2
# Frontend
- Soap UI
# Tools
- GitBash
- Eclipse Version: 2020-06 (4.16.0)
- Github
# Support
- Course's Q&A
- Stackoverflow
- Searching :)
