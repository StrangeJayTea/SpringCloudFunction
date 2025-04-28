To test locally:
  1. Open a browser
  2. Type 'http://localhost:8080/reverseString/HelloWorld'
  3. Repeat for remaining functions (Ex: 'reverseString', 'upperCase', 'getLength', 'greeter', 'concatFunction').


To Run in AWS:
  1. Create the AWS Lambda Function
      * Be sure to click "Enable function URL" and for "Auth type" pick "NONE"
      * Upload the xxx_aws.jar
      * Set the handler to ``org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest``

  2. To test in AWS:
      * Create a test event with the name of the function to call (camel case)
        ``{
          "payload": "myText",
          "headers": {
              "spring.cloud.function.definition": "upperCase"
          }
        }``
  4. To test in Postman:
      * Copy the function URL
      * Set header with key=``spring.cloud.function.definition`` and value = name of function
      * Change body to "text/html" and set the String to send (ex: "test string here")
