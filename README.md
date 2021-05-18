# MailService
## Description
**MailService** is a secured and customized email web service. 

**MailService** gives a possibility to:  

- Set up your email & password using environment variables
- Get your jwt token for future authorization
- Send your text email using rest api

## How to use
- Assign your email to *FROM_EMAIL* environment variable
- Assign your password to *FROM_EMAIL_PASS* environment variable
- Get jwt token , by creating plain basic auth post request to */auth* (by default login: *foo* , password: *foo*)
- Create and send valid post request */send*

## How to create valid post request to */send* 
- Add given jwt token to Authorization header , like: Bearer *yourjwttoken*
- Add request body with required variables ("to","subject", "text") as json file
- Example body:
 
    {
    "to": "lecompt.by@gmail.com",
    "subject": "hi",
    "text": "hi mate"}
    

## Technology used 

- Spring Boot
- Spring Security
- Spring MVC
- Maven


