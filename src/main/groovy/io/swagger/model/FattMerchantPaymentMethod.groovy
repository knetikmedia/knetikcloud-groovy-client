package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FattMerchantPaymentMethod {

    String address1 = null

    String address2 = null

    String addressCity = null

    String addressCountry = null

    String addressState = null

    String addressZip = null

  /* Last four digits of the credit card */
  String cardLastFour = null

    String createdAt = null

  /* Unique FattMerchant customer ID */
  String customerId = null

    String deletedAt = null

    String id = null

  /* Nickname given to the FattMerchant payment method */
  String nickname = null

    String updatedAt = null
  

}

