# Spring Boot OAuth2 JWT 

Simple project on how to setup OAuth2 server and JWT tokens.

## Highlights
Java 8
Spring Boot, OAuth2

## DataBases
H2

## Use

You can curl a POST request with the following credentials to receive a JWT token:

curl -X POST --user 'webapp:' -d 'grant_type=password&username=user&password=123456' http://localhost:9999/oauth/token
The response should look like this:

{"access_token":"7e46d81b-58cc-48fb-b012-c9b028b9ff9d","token_type":"bearer","refresh_token":"d7fe669c-cf46-46ee-b790-a9ef39ea7e63","expires_in":3599,"scope":"read write"}
