package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.PaymentMethodResource;
import io.swagger.model.SimpleUserResource;
import io.swagger.model.SubscriptionCreditResource;
import java.util.List;
@Canonical
class InventorySubscriptionResource {

  /* The date the subscription will be billed */
  Long billDate = null

  /* A credit of money already applied to a subscription for the next bill, or a debt if negative */
  Double credit = null

  /* A record of past and present credit/debt changes */
  List<SubscriptionCreditResource> creditLog = new ArrayList<SubscriptionCreditResource>()

  /* The date the grace period ends */
  Long graceEnd = null

  /* The id of the inventory */
  Integer inventoryId = null

  /* The inventory status object */
  String inventoryStatus = null

  /* The id of the item */
  Integer itemId = null

  /* The payment method object */
  PaymentMethodResource paymentMethod = null

  /* The recurring price that has been set to override the base price. Null if not overriding */
  Double priceOverride = null

  /* An explanation for the reason the price is being overridden */
  String priceOverrideReason = null

  /* The default recurring price */
  Double recurringPrice = null

  /* The recurring sku of the subscription */
  String sku = null

  /* The date the subscription will start */
  Long startDate = null

  /* The status of the subscription */
  Integer subscriptionStatus = null

  /* The user */
  SimpleUserResource user = null
  

}

