package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class GroupMemberResource {

  /* The url of the user's avatar image */
  String avatarUrl = null

  /* The public username of the user */
  String displayName = null

  /* The id of the user */
  Integer id = null

  /* The member's access level. Default: member */
  String status = null

  /* The username of the user */
  String username = null
  

}

