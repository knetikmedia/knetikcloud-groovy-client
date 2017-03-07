package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class RewardCurrencyResource {

  /* The code of the currency type to give */
  String currencyCode = null

  /* The name of the currency reward to give.  Set by currency_code) */
  String currencyName = null

  /* The highest number (worst) rank to give the reward to. Must be greater than or equal to minRank */
  Integer maxRank = null

  /* The lowest number (best) rank to give the reward to. Must be greater than zero */
  Integer minRank = null

  /* True if the value is actually a percentage of the intake */
  Boolean percent = null

  /* The amount of currency to give. For percentage values, 0.5 is 50% */
  Double value = null
  

}

