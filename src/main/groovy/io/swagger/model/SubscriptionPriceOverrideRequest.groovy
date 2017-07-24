package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SubscriptionPriceOverrideRequest {

  /* The recurring price that has been set to override the base price. Null if not overriding */
  Double newPrice = null

  /* An explanation for the reason the price is being overridden */
  String reason = null
  

}

