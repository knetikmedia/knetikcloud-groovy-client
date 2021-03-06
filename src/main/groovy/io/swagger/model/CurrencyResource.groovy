package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class CurrencyResource {

  /* Whether the currency is active. Default true */
  Boolean active = null

  /* The unique id code for the currency. Maximum 5 characters */
  String code = null

  /* The unix timestamp in seconds the currency was added to the system */
  Long createdDate = null

  /* Whether this is the default currency. All real money wallets will be in this currency, and the 'factor' on each currency is in relation to the default. There must be one default currency and the current will be changed if you set another as the default. Cannot be combined with virtual currency. Take extreme caution when changing */
  Boolean defaultCurrency = null

  /* The decimal to multiply the default currency to localize to this one. Should be 1 for the default currency itself. */
  BigDecimal factor = null

  /* The url for an icon of the currency */
  String icon = null

  /* The name of the currency */
  String name = null

  /* The type of currency. Default 'real' */
  String type = null

  /* The unix timestamp in seconds the currency was last updated in the system. */
  Long updatedDate = null
  

}

