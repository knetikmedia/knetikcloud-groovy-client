package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AddressResource {

  /* The first line of the address */
  String address1 = null

  /* A second line of the address */
  String address2 = null

  /* The city */
  String city = null

  /* The iso3 code for the country */
  String countryCode = null

  /* The postal code */
  String postalCode = null

  /* The code for the state. Required if the country has states/provinces/equivalent */
  String stateCode = null
  

}

