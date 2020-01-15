# tests.pluscodes
Simple java offline implementation of pluscodes

## What does this code do
It converts a latitude and longitude into a PlusCode, in three formats: Full, Within and Shortened. The conversion is made offline, without any remote API call.

## What this code doesn't do
It does not shows a semantic form of address, with city name, country name, or other names, like streets, avenues, or even house numbers.

## References

- https://en.wikipedia.org/wiki/Open_Location_Code
- https://plus.codes/developers
- https://github.com/google/open-location-code

## Building

Before start, check the basic requirements: Java 8 or higher and Maven

```sh
$ git clone https://github.com/google/open-location-code
$ cd cd open-location-code/java/
$ cd ../../
$ git clone https://github.com/Scicrop/tests.pluscodes
$ cd tests.pluscodes
$ mvn package
```
## Running

```sh
$ java -jar target/tests.pluscodes-0.0.1-jar-with-dependencies.jar -23.982528 -46.916556
```
![Live CLI](./demo.svg)
