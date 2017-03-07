package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CartLineItem;
import io.swagger.model.CartShippingAddressRequest;
import io.swagger.model.CartShippingOption;
import io.swagger.model.CouponDefinition;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Set;
import java.util.List;
@Canonical
class Cart {

    Double countryTax = null

    List<CouponDefinition> coupons = new ArrayList<CouponDefinition>()

    Long created = null

    String currencyCode = null

    Double discountTotal = null

    Integer errorCode = null

    String errorMessage = null

    Double grandTotal = null

    String id = null

    Double invoiceId = null

    List<CartLineItem> items = new ArrayList<CartLineItem>()

    Integer owner = null

    List<CartShippingOption> selectedShippingOptions = new ArrayList<CartShippingOption>()

    Boolean shippable = null

    CartShippingAddressRequest shippingAddress = null

    Double shippingCost = null

    Map<String, Set> shippingOptions = new HashMap<String, Set>()

    Double stateTax = null

    String status = null

    Double subtotal = null

    Long updated = null
  

}

