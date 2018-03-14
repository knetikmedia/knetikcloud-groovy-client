package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.RewardCurrencyResource;
import io.swagger.model.RewardItemResource;
import io.swagger.model.SimpleUserResource;
import java.util.List;
@Canonical
class UserActivityResults {

  /* Any currency rewarded to this user */
  List<RewardCurrencyResource> currencyRewards = new ArrayList<RewardCurrencyResource>()

  /* Any items rewarded to this user */
  List<RewardItemResource> itemRewards = new ArrayList<RewardItemResource>()

  /* The position of the user in the leaderboard. Null means non-compete or disqualification */
  Long rank = null

  /* The raw score in this leaderboard. Null means non-compete or disqualification */
  Long score = null

  /* Any tags for the metric. Each unique tag will translate into a unique leaderboard. Maximum 10 tags and 50 characters each */
  List<String> tags = new ArrayList<String>()

  /* The number of users tied at this rank, including this user. 1 means no tie */
  Integer ties = null

  /* The date this score was recorded or updated. Unix timestamp in seconds */
  Long updatedDate = null

  /* The player for this entry */
  SimpleUserResource user = null
  

}

