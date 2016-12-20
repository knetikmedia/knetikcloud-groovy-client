package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class StoreListRequest {

  /* Whether the location is ignored */
  Boolean ignoreLocation = null

  /* Whether the item is in stock */
  Boolean inStockOnly = null

  /* The amount of items returned */
  Integer limit = null

  /* The page of the request */
  Integer page = null

  /* Whether the catalog is used */
  Boolean useCatalog = null
  

}

