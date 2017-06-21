package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class SubscriptionPlan {

    Map<String, Property> additionalProperties = new HashMap<String, Property>()

    String availability = null

    Integer billGraceDays = null

    Boolean consolidated = null

    Integer firstBill = null

    String firstBillUnitOfTime = null

    String id = null

    String latePaymentSku = null

    Boolean locked = null

    Integer maxAutoRenew = null

    Integer maxBillAttempts = null

    String migrationPlan = null

    Integer minimumTerm = null

    String name = null

    String primarySku = null

    String reactivationSku = null

    String recurringSku = null

    Integer renewPeriod = null

    String renewPeriodUnitOfTime = null

    Integer subscriptionId = null
  

}

