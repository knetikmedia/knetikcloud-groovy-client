package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class NotificationUserTypeResource {

  /* Whether the user has muted direct notification of this type. Notifications can still be retrieved via the api */
  Boolean silenced = null

  /* The notification type id */
  String type = null

  /* The user's id */
  Integer userId = null
  

}

