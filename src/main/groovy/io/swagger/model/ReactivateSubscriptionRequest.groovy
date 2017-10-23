package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ReactivateSubscriptionRequest {

  /* The inventory to reactivate. Only required if using the deprecated subscriptions service */
  Integer inventoryId = null

  /* Whether to add the additional reactivation fee in addition to the recurring fee */
  Boolean reactivationFee = null
  

}

