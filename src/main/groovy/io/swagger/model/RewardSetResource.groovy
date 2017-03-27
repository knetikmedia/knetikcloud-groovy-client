package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.RewardCurrencyResource;
import io.swagger.model.RewardItemResource;
import java.util.List;
@Canonical
class RewardSetResource {

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The currency to give as rewards */
  List<RewardCurrencyResource> currencyRewards = new ArrayList<RewardCurrencyResource>()

  /* The assigned unique ID for this reward set */
  Integer id = null

  /* The items to give as rewards */
  List<RewardItemResource> itemRewards = new ArrayList<RewardItemResource>()

  /* A longer describe the reward set, usually included in details */
  String longDescription = null

  /* The maximum placing that will receive a reward */
  Integer maxPlacing = null

  /* The user friendly name for this reward set */
  String name = null

  /* A short paragraph to describe the reward set, usually included in listings.  Max 255 characters */
  String shortDescription = null

  /* A provided unique key for this reward set */
  String uniqueKey = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

