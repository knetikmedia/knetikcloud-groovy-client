package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CityResource {

  /* The iso3 of the country this city is in */
  String countryCodeIso3 = null

  /* The unique ID for this city */
  Integer id = null

  /* The name of the city */
  String name = null

  /* The code for the state this city is in */
  String stateCode = null
  

}

