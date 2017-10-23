package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.IdRef;
@Canonical
class Participant {

  /* Whether this user is the 'host' of the occurrence and has increased access to settings/etc (default: false) */
  Boolean host = null

  /* The current status of the user in the occurrence (default: present) */
  String status = null

  /* The user */
  IdRef user = null
  

}

