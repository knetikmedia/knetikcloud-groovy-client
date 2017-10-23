package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class OAuth2Resource {

  /* The access token issued by the authorization server */
  String accessToken = null

  /* The lifetime in seconds of the access token */
  String expiresIn = null

  /* The refresh token issued by the authorization server */
  String refreshToken = null

  /* The scope of the access token. Currently these values can be ignored, as security defaults to roles and permissions */
  String scope = null

  /* The type of the token issued */
  String tokenType = null
  

}

