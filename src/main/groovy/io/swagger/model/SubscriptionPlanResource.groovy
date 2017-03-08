package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class SubscriptionPlanResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this subscription */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The length of the billing cycle in number of billing cycle unit */
  Integer billingCycleLength = null

  /* The time period unit to apply to the length of billing cycles */
  String billingCycleUnit = null

  /* Whether this plan will be renewed on the consolidated billing cycle */
  Boolean consolidated = null

  /* The ISO3 currency code to use for the fees */
  String currencyCode = null

  /* Used to schedule plan availability end date */
  Long endDate = null

  /* Optional override for the length of the first billing cycle before the first recurring billing */
  Integer firstBillingCycleLength = null

  /* The time period unit to apply to the length of the first billing cycle. Required when first_billing_cycle_length is specified */
  String firstBillingCycleUnit = null

  /* The number of late payment days before a subscription is canceled */
  Integer gracePeriod = null

  /* The id of the plan used to generate the SKUs */
  String id = null

  /* The fee charged when the subscription is purchased */
  Double initialFee = null

  /* The SKU to be used when purchasing the subscription through the cart */
  String initialSku = null

  /* The fee to add to the bill when an invoice has gone unpaid passed the grace period */
  Double latePaymentFee = null

  /* The SKU that will show on the invoice when the subscription is delinquent */
  String latePaymentSku = null

  /* Whether this plan is locked because it has been purchased by at least one user.  When locked, a number of properties can no longer be changed */
  Boolean locked = null

  /* The number of charge attempts before the subscription becomes delinquent */
  Integer maxBillAttempts = null

  /* Maximum number of renewals. If a migration plan is provided, the subscription will automatically switch to it when this limit is reached */
  Integer maxCycles = null

  /* Automatically migrate to the specified plan when the subscription is first renewed */
  String migrateToPlan = null

  /* The minimum number of renewals to charge for */
  Integer minCycles = null

  /* The name of the plan used to generate the SKUs */
  String name = null

  /* Whether this plan is currently available */
  Boolean published = null

  /* The fee to charge when a suspended subscription is to be re-activated */
  Double reactivationFee = null

  /* The SKU that will show on the invoice when the subscription is re-activated after a suspension */
  String reactivationSku = null

  /* The recurring fee to charge for each renewal */
  Double recurringFee = null

  /* The SKU that will show on the invoice when the subscription is activated */
  String recurringSku = null

  /* Used to schedule plan availability start date */
  Long startDate = null
  

}

