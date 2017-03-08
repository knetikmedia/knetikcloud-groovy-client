package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class NewPasswordRequest {

  /* The new password in plain text */
  String password = null

  /* The secret provided after the password reset */
  String secret = null
  

}

