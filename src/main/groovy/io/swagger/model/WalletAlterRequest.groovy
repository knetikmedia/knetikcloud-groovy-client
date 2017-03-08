package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class WalletAlterRequest {

  /* The amount of currency to add/remove. positive to add, negative to remove */
  Double delta = null

  /* The id of an invoice to attribute the transaction to */
  Integer invoiceId = null

  /* The admin entered or system generated reason */
  String reason = null

  /* The transaction type to allow for search/etc */
  String type = null
  

}

