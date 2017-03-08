package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ErrorResource;
import java.util.List;
@Canonical
class Result {

  /* The JSAPI error code */
  Integer code = null

  /* The id used for debugging lookup */
  String requestId = null

  /* The error object */
  List<ErrorResource> result = new ArrayList<ErrorResource>()
  

}

