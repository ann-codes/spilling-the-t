package com.launchacademy.giantleap.seeders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MasterSeeder implements CommandLineRunner {

  @Autowired UserSeeder userSeeder;

  @Override
  public void run(String... args) throws Exception {


    userSeeder.seed();
  }
}
