package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.FattMerchantPaymentMethod;
@Canonical
class FattMerchantPaymentMethodRequest {

  /* The FattMerchant payment method being created/updated */
  FattMerchantPaymentMethod method = null

  /* ID of the JSAPI user for whom the payment method is being created/updated. If ID is not that of the currently logged in user, FATMMERCHANT_ADMIN privilege is required. If ID is null, will use the currently logged in user's ID. */
  Integer userId = null
  

}

