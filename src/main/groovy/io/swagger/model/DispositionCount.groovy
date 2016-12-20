package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class DispositionCount {

  /* The number of users that have expressed this disposition */
  Long count = null

  /* The name of the disposition this count is for */
  String name = null
  

}

