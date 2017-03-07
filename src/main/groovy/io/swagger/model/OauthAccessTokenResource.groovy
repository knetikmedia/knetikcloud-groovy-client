package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class OauthAccessTokenResource {

  /* The key of the client assosciated with the token */
  String clientId = null

  /* The token.  Not shown in list view */
  String token = null

  /* The username of the user associated with the token */
  String username = null
  

}

