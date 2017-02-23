package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SavedAddressResource {

  /* The first line of the address */
  String address1 = null

  /* A second line of the address */
  String address2 = null

  /* The city */
  String city = null

  /* The iso3 code for the country */
  String countryCode = null

    Boolean _default = null

  /* The first name of the user */
  String firstName = null

  /* The id of the address */
  Integer id = null

  /* The last name of the user */
  String lastName = null

  /* The name of the address */
  String name = null

  /* The first phone number of the user */
  String phone1 = null

  /* The second phone number of the user */
  String phone2 = null

  /* The postal code */
  String postalCode = null

  /* The code for the state. Required if the country has states/provinces/equivalent */
  String stateCode = null
  

}

