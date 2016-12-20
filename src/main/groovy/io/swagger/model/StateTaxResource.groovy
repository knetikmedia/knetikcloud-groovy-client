package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StateTaxResource {

  /* The iso3 code of the country, cannot be changed */
  String countryIso3 = null

  /* Whether the state is exempt from paying the country tax */
  Boolean federallyExempt = null

  /* The name of the tax */
  String name = null

  /* The tax rate as a percentage to a maximum of two decimal places (1.5 means 1.5%) */
  Double rate = null

  /* The code of the state, cannot be changed */
  String stateCode = null

  /* Whether the tax applies to shipping costs */
  Boolean taxShipping = null
  

}

