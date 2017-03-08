package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BareActivityResource {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* Details about how to launch the activity */
  String launch = null

  /* The user friendly name of that resource. Defaults to blank string */
  String longDescription = null

  /* The user friendly name of that resource */
  String name = null

  /* The user friendly name of that resource. Defaults to blank string */
  String shortDescription = null

  /* Whether this activity is a template for other activities. Default: false */
  Boolean template = null

  /* The type of the activity */
  String type = null

  /* The unique key (for static reference in code) of the activity */
  String uniqueKey = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

