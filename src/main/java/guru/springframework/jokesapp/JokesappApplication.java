/*
We have taken a maven dependency in pom.xml <chuck-norris-for-actuator>
this dependecy means that it is a proggram or an API. It will give us a random joke.
In Services we have created the object of ChuckNorrisQuotes class. This class is present in the
maven dependency we have implemented. We will use it's methods and will get some random jokes.
 */

package guru.springframework.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokesappApplication {

    public static void main(String[] args) {
        SpringApplication.run(JokesappApplication.class, args);




    }

}
