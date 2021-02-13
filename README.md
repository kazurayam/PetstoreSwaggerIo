# Petstore Swagger Io


This is a small Katalon Studio project for demostration purpose.
You can download the zip from [Releases] page, unzip it, open it using your Katalon Studio.

This project was developed in order to propose a solutionn raised in a post at the Katalon User Forum:

- https://forum.katalon.com/t/how-to-update-local-variable-at-runtime/52090


This project is a working example, which shows how to

1. create a parameterized RequestObject to a webservice api (https://petstore.swagger.io/v2/pet/findByStatus?status=${status})

2. make multiple times of Web Service requests while interpolating the parameter values as wanted

Please read the source of `Test Cases/multiple_searches_for_pets_by_status` and study it to find out how it works.
