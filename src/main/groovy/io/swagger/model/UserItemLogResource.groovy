package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleReferenceResourceint;
import io.swagger.model.SimpleUserResource;
@Canonical
class UserItemLogResource {

  /* The log entry id */
  Integer id = null

  /* Additional information defined by the type */
  String info = null

  /* The item interacted with */
  SimpleReferenceResourceint item = null

  /* The date/time this event occurred in seconds since epoch */
  Long logDate = null

  /* The type of event */
  String type = null

  /* The user making the interaction */
  SimpleUserResource user = null

  /* The id of the inventory entry this event is related to, if any */
  Integer userInventory = null
  

}

