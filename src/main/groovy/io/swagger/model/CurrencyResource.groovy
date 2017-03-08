package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CurrencyResource {

  /* Whether the currency is active. Default true */
  Boolean active = null

  /* The unique id code for the currency. Maximum 5 characters */
  String code = null

  /* The unix timestamp in seconds the currency was added to the system */
  Long createdDate = null

  /* The decimal to multiply the system base currency (from config 'currency') to localize to this one. Should be 1 for the base currency itself. */
  Double factor = null

  /* The url for an icon of the currency */
  String icon = null

  /* The name of the currency */
  String name = null

  /* The type of currency. Default 'real' */
  String type = null

  /* The unix timestamp in seconds the currency was last updated in the system. */
  Long updatedDate = null
  

}

