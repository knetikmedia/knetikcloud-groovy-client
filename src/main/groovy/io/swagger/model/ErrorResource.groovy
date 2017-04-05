package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ErrorResource {

  /* Extra details about the error, if needed */
  Object details = null

  /* The JSON key the message pertains to */
  Object field = null

  /* The message explaining the error */
  String message = null
  

}

