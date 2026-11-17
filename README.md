# MockMvc Controller Unit Testing

This project implements the task shown in the uploaded lab sheet:

- Create a Spring Boot controller endpoint: `GET /ms1/add`
- Pass query parameters `a=5` and `b=10`
- Use MockMvc to test the controller without starting the full embedded web server
- Verify HTTP status `200 OK`
- Verify response body: `MS1.1 - Addition = 15`

## Requirements

- JDK 17 or later
- Maven 3.6+ (or use the Maven wrapper supplied by your IDE)

## Run the unit test

Open a terminal in this project folder and run:

```bash
mvn test
```

Expected result: `BUILD SUCCESS`.

## Run the application

```bash
mvn spring-boot:run
```

Then open this URL in a browser or Postman:

```text
http://localhost:8080/ms1/add?a=5&b=10
```

Expected response:

```text
MS1.1 - Addition = 15
```

## Run in STS / Eclipse

1. Extract the ZIP file.
2. Open STS and choose **File -> Import -> Maven -> Existing Maven Projects**.
3. Select the extracted project folder and click **Finish**.
4. Right-click the project -> **Run As -> Maven test** to execute the unit test.
5. To start the application, run `MockMvcControllerTestApplication.java` as **Spring Boot App**.

## Important

`@WebMvcTest` loads only the MVC/controller layer. `MockMvc` simulates the HTTP request and response, so the full embedded server does not need to start.
