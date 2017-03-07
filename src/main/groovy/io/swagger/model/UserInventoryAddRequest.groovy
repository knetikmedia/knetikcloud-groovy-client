package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class UserInventoryAddRequest {

  /* A note to be passed to the invoice or transaction */
  String note = null

  /* A list of behaviors to ignore explicitely.  Ex: 'limited_gettable' */
  List<String> overrides = new ArrayList<String>()

  /* If set to true will cause the endpoint to skip creation of cart and invoice to track the inventory change */
  Boolean skipInvoice = null

  /* The specific SKU of the item to be added to the inventory */
  String sku = null
  

}

