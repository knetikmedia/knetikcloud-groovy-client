package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StateResource {

  /* The code of the state */
  String code = null

  /* The iso3 of the country this state is in */
  String countryCodeIso3 = null

  /* The unique ID for the state */
  Integer id = null

  /* The name of the state */
  String name = null
  

}

