package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class ActivityEntitlementResource {

  /* The ISO3 currency code the price is in, if available */
  String currencyCode = null

  /* The id of the entitlement item */
  Integer itemId = null

  /* The name of the entitlement item */
  String name = null

  /* The price of the sku, if available */
  BigDecimal price = null

  /* The sku id, if available. If multiple are available, then first one is returned */
  String sku = null
  

}

