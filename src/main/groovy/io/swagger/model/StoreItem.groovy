package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.Item;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import java.util.List;
@Canonical
class StoreItem {

  /* Whether or not the item is currently visible to users. Does not block purchase; Use store_start or store_end to block purchase.  Default = true */
  Boolean displayable = null

  /* A list of country ID to include in the blacklist/whitelist geo policy */
  List<String> geoCountryList = new ArrayList<String>()

  /* Whether to use the geo_country_list as a black list or white list for item geographical availability */
  String geoPolicyType = null

  /* Provides the abstract shipping needs if this item is physical and can be shipped.  A value of zero means no shipping needed.  Default = 0 */
  Integer shippingTier = null

  /* The skus for the item. Each defines a unique configuration for the item to be purchased (Large-Blue, Small-Green, etc). These are what is ultimately selected in the store and added to the cart */
  List<Sku> skus = new ArrayList<Sku>()

  /* The date the item will become hidden and unavailable for purchase, unix timestamp in seconds.  If set to null, item will never leave the store */
  Long storeEnd = null

  /* The date the item will become visible (if displayable) and available for purchase, unix timestamp in seconds.  If set to null, item will appear in store immediately */
  Long storeStart = null

  /* The vendor who provides the item */
  Integer vendorId = null
  

}

