# Json Comparison in Java

## Assessing the Json comparison functionality of JsonUnit, JSONAssert and Hamcrest-Json

#### applied on the Keycloak Admin API

***
*This repository in a series of similar repositories for API testing intended for a specific workflow that compares expected against actual API responses*

### (I) The problem

Besides using a `in-line diff tool` (e.g. [json-diff](https://github.com/andreyvit/json-diff)) or `side-to-side diff tool` (e.g. IntelliJ IDEA > View > Compare Files) you may wish to get a verbose output about the differences of 2 Json Structures (Json Objects or Json Arrays).

### (II) Comparison of existing solutions

The following 3 libraries are worthwhile comparing when it comes to Json comparison in Java:

* JsonUnit 2.5.0 :: [official repository](https://github.com/lukas-krecan/JsonUnit) ::  [Maven dependency](https://search.maven.org/artifact/net.javacrumbs.json-unit/json-unit/2.5.0/jar)
* JSONAssert 1.5.0 :: [official repository](https://github.com/skyscreamer/JSONassert) ::  [Maven dependency](https://search.maven.org/artifact/org.skyscreamer/jsonassert/1.5.0/jar)
* Hamcrest-Json 0.2 :: [official repository](https://github.com/hertzsprung/hamcrest-json) ::  [Maven dependency](https://search.maven.org/artifact/uk.co.datumedge/hamcrest-json/0.2/jar)


### (III) How to get started
1. Download this repository
2. Open the Java project with IntelliJ IDEA and try to run all tests
3. You will find the test results under `/src/test/resources` in the respective `.txt` files

**... TO BE CONTINUED ...**
