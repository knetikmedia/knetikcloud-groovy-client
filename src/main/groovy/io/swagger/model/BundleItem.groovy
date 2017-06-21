package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.BundledSku;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import io.swagger.model.StoreItem;
import java.util.List;
@Canonical
class BundleItem {

  /* The skus of items to be included in this bundle, and how they influence the bundle total price.  Must have at least one SKU */
  List<BundledSku> bundledSkus = new ArrayList<BundledSku>()
  

}

