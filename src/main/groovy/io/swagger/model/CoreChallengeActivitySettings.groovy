package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CoreChallengeActivitySettings {

  /* Whether the host can boot a user while the status is PLAYING. Null to inherit from activity */
  Boolean bootInPlay = null

  /* A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this challenge rather than the usual game server. Max length: 255 */
  String customLaunchAddress = null

  /* Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Will override the challenge's custom_launch_address if they do. Null to inherit from activity */
  Boolean customLaunchAddressAllowed = null

  /* Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Null to inherit */
  String hostOption = null

  /* Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Max length: 255. Null to inherit from activity */
  Boolean hostStatusControl = null

  /* Whether users can join while the status is PLAYING. Null to inherit from activity */
  Boolean joinInPlay = null

  /* Whether users can leave while the status is PLAYING. Null to inherit from activity */
  Boolean leaveInPlay = null

  /* The maximum number of players the game can hold. Null to inherit from activity */
  Integer maxPlayers = null

  /* The minimum number of players the game can hold. Null to inherit from activity */
  Integer minPlayers = null

  /* Restriction for who is able to report game end and results. Admin is always able to send results as well. Null to inherit from activity */
  String resultsTrust = null
  

}

