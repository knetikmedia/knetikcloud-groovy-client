package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FulfillmentType {

  /* Whether the type is core and cannot be altered/deleted, read-only */
  Boolean core = null

  /* A description of the type */
  String description = null

  /* The unique id of the type, read-only */
  Integer id = null

  /* The name of the type */
  String name = null
  

}

