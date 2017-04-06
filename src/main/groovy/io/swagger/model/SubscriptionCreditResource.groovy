package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SubscriptionCreditResource {

  /* The amount of the credit, negative for debt */
  Double amount = null

  /* The date this credit was added, unix timestamp in seconds */
  Long createdDate = null

  /* The id of the credit record */
  Integer id = null

  /* The id of the subscription inventory entry */
  Integer inventoryId = null

  /* The reason for the subscription credit */
  String reason = null
  

}

