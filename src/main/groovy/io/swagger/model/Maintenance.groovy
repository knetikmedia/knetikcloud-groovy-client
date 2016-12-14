package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class Maintenance {

  /* Whether access to the system has been locked */
  Boolean accessLocked = null

  /* A simple object of any schema for client side use and processing */
  Object details = null

  /* User displayable message about the maintenance */
  String message = null
  

}

