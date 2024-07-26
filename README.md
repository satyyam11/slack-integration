# Slack Integration Spring Boot Application

## Overview
This project is a Spring Boot application designed to send messages to a Slack channel using Slack's Incoming Webhooks. The application provides a REST endpoint to accept a message and send it to a predefined Slack channel.

## Table of Contents
- [Objective](#objective)
- [Features](#features)
- [Running the Application](#running-the-application)
- [Project Structure](#project-structure)
- [Testing](#testing)

## Objective
The main objective of this project is to create a Spring Boot application that sends messages to a Slack channel via Slack's Incoming Webhooks.

## Features
- REST endpoint `/sendSlackMessage` to accept POST requests with JSON payloads.
- Integration with Slack using Incoming Webhooks.
- Configuration of Slack webhook URL via application properties.
- Unit and integration tests for the service and endpoint.

## Running the Application
1. **Build and Run the Application:**
   - Use Maven to clean, install, and run the application.

2. **Test the Application:**
   - You can use these links to test it on my Slack channel:
     - **Slack Channel Link:** [Slack Channel](https://newworkspace-tn09249.slack.com/archives/C07DRHQ5KHC)
     - **Webhook Link:** [Webhook URL](https://hooks.slack.com/services/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) (Also mentioned in the code)

3. **Use Your Own Webhook:**
   - Alternatively, you can use your own webhook and run it in your own Slack channel.
   - To do this, set up a Slack Incoming Webhook and get the webhook URL.
   - Update the `application.properties` or `application.yml` file in the `src/main/resources` directory with your Slack webhook URL.

4. **Use a Tool like Postman:**
   - Use a tool like Postman to send a POST request to `http://localhost:8080/sendSlackMessage` with a JSON payload containing the message you want to send.


## Testing
The application includes unit tests and integration tests to ensure functionality.

- **Unit Tests:**
  - Located in the `src/test/java/com/example/slackintegration/SlackServiceTest.java`.
  
- **Integration Tests:**
  - Located in the `src/test/java/com/example/slackintegration/SlackControllerTest.java`.

To run the tests, use Maven to execute the test phase.
