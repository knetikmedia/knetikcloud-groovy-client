package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class ClientResource {

  /* The time limit of the token in seconds */
  Integer accessTokenValiditySeconds = null

  /* The client key, cannot be edited once created */
  String clientKey = null

  /* The grant types of the client */
  List<String> grantTypes = new ArrayList<String>()

  /* The id of the client */
  Integer id = null

  /* Whether the client is public or not */
  Boolean isPublic = null

  /* Whether a client is locked from being deleted */
  Boolean locked = null

  /* The name of the client */
  String name = null

  /* The redirect uris of the client */
  List<String> redirectUris = new ArrayList<String>()

  /* The time limit of the refresh token in seconds */
  Integer refreshTokenValiditySeconds = null

  /* The secret key of the client */
  String secret = null
  

}

