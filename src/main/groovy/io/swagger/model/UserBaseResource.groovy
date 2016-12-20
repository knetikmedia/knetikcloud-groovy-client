package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UserBaseResource {

  /* The url of the user's avatar image */
  String avatarUrl = null

  /* The chosen display name of the user, defaults to username if not present */
  String displayName = null

  /* The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822) */
  String email = null

  /* The user's full name (private) */
  String fullname = null

  /* The id of the user */
  Integer id = null

  /* The login username for the user (private). May be set to match email if system does not require usernames separately. */
  String username = null
  

}

