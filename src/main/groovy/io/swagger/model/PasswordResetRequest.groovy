package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class PasswordResetRequest {

  /* The user's email address */
  String email = null

  /* The user's mobile phone number */
  String mobileNumber = null

  /* The user's username */
  String username = null
  

}

