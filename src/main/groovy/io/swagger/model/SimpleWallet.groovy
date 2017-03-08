package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SimpleWallet {

  /* The current balance of the wallet */
  Double balance = null

  /* The ISO currency code for the wallet */
  String code = null

  /* The name of the currency stored in the wallet */
  String currencyName = null

  /* The unique ID of the wallet */
  Integer id = null

  /* The ID of the user to whom the wallet belongs */
  Integer userId = null
  

}

