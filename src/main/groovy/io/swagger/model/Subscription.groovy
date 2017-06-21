package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Behavior;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Sku;
import io.swagger.model.StoreItem;
import io.swagger.model.SubscriptionPlan;
import java.util.List;
@Canonical
class Subscription {

    String availability = null

    Integer consolidationDayOfMonth = null

    List<SubscriptionPlan> subscriptionPlans = new ArrayList<SubscriptionPlan>()
  

}

