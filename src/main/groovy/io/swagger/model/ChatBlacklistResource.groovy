package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class ChatBlacklistResource {

  /* The user that is blacklisted */
  SimpleUserResource blacklistedUser = null

  /* The date the user was blacklisted */
  Long createdDate = null

  /* The unique ID for this chat message blacklist */
  String id = null

  /* The user that has blacklisted someone */
  Integer userId = null
  

}

