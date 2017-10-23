package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BigDecimal;
import io.swagger.model.CartLineItem;
import io.swagger.model.CartShippingAddressRequest;
import io.swagger.model.CartShippingOption;
import io.swagger.model.CouponDefinition;
import java.util.List;
@Canonical
class Cart {

    List<CartShippingOption> availableShippingOptions = new ArrayList<CartShippingOption>()

    BigDecimal countryTax = null

    List<CouponDefinition> coupons = new ArrayList<CouponDefinition>()

    Long created = null

    String currencyCode = null

    BigDecimal discountTotal = null

    Integer errorCode = null

    String errorMessage = null

    BigDecimal grandTotal = null

    String id = null

    BigDecimal invoiceId = null

    List<CartLineItem> items = new ArrayList<CartLineItem>()

    Integer owner = null

    List<CartShippingOption> selectedShippingOptions = new ArrayList<CartShippingOption>()

    Boolean shippable = null

    CartShippingAddressRequest shippingAddress = null

    BigDecimal shippingCost = null

    BigDecimal stateTax = null

    String status = null

    BigDecimal subtotal = null

    Long updated = null
  

}

