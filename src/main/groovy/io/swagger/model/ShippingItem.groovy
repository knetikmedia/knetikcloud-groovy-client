package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import io.swagger.model.StoreItem;
import java.util.List;
@Canonical
class ShippingItem {

  /* A unique list of country iso3 codes that allow the shipping option */
  List<String> countries = new ArrayList<String>()

  /* An abstract max value that the values of item's shipping_tier work against to decide whether an order can be fulfilled */
  Integer maxTierTotal = null

  /* Whether tax should be applied to the shipping price.  Default = false */
  Boolean taxable = null
  

}

