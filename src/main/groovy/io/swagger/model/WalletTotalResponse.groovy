package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BigDecimal;
@Canonical
class WalletTotalResponse {

  /* The currency code */
  String currencyCode = null

  /* The sum of all wallets in the system for this currency */
  BigDecimal total = null
  

}

