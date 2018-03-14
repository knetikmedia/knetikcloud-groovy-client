package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ResourceTypeDescription {

  /* The field on the resource that the id is in */
  String idField = null

  /* The unique name for the resource in swagger. This serves as the unique identifier. Cannot be changed after creation */
  String name = null

  /* The base path of the service */
  String servicePath = null
  

}

