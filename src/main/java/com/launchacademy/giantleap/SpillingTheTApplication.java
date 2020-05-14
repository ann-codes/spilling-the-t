package com.launchacademy.giantleap;

import com.launchacademy.giantleap.helpers.PassHash;
import java.security.NoSuchAlgorithmException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpillingTheTApplication {

  public static void main(String[] args) throws NoSuchAlgorithmException {
    SpringApplication.run(SpillingTheTApplication.class, args);
  }

}
