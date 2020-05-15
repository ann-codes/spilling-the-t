package com.launchacademy.giantleap.helpers;

public class PassHash {

  private String password;

  public PassHash(String password) {
    this.password = password;
  }

  public String saltAndHash() {
    String salted = password + "4d26cf0b9dc2caadfa784a5c69e02100fd8fc1e7700012a512954a2257c05380";
    String pass1 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(salted);
    String pass2 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass1);
    String pass3 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass2);
    String pass4 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass3);
    String pass5 = org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass4);
    return org.apache.commons.codec.digest.DigestUtils.sha256Hex(pass5);
  }

}
