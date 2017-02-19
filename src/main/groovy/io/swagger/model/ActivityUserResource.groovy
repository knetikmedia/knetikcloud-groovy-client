package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MetricResource;
import io.swagger.model.SimpleUserResource;
@Canonical
class ActivityUserResource {

  /* Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false) */
  Boolean host = null

  /* The id of the activity user entry */
  Long id = null

  /* The date this user last joined the occurrence, unix timestamp in seconds */
  Long joinedDate = null

  /* The date this user last left the occurrence, unix timestamp in seconds. Null if still present */
  Long leftDate = null

  /* The metric for the user's results, after the game is over */
  MetricResource metric = null

  /* The current status of the user in the occurrence (default: present) */
  String status = null

  /* The user */
  SimpleUserResource user = null
  

}

