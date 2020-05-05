package com.launchacademy.giantleap.dtos;

import com.launchacademy.giantleap.models.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

  private Integer id;
  private String username;
  private String email;
  private String displayName;
  private String location;
  private String imageUrl;

  public static UserDto fromUser(User user) {
    UserDto dto = new UserDto();
    dto.setId(user.getId());
    dto.setUsername(user.getUsername());
    dto.setEmail(user.getEmail());
    dto.setDisplayName(user.getFirstName() + " " + user.getLastName().split("")[0] + ".");
    dto.setLocation(user.getLocation());
    dto.setImageUrl(user.getImageUrl());
    return dto;
  }

}
