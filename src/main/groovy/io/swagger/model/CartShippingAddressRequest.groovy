package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CartShippingAddressRequest {

  /* The city of the user */
  String city = null

  /* The country code of the user */
  String countryCodeIso3 = null

  /* The email of the user */
  String email = null

  /* The first name of the user */
  String firstName = null

  /* The last name of the user */
  String lastName = null

    String namePrefix = null

  /* The order notes the user */
  String orderNotes = null

  /* The phone number of the user */
  String phoneNumber = null

  /* The postal state code of the user */
  String postalStateCode = null

  /* The shipping address of the user, first line */
  String shippingAddressLine1 = null

  /* The shipping address of the user, second line */
  String shippingAddressLine2 = null

  /* The zipcode of the user */
  String zip = null
  

}

