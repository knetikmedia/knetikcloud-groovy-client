package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CoreActivityOccurrenceSettings {

  /* Whether the host can boot another user while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit */
  Boolean bootInPlay = null

  /* A custom address (url, ip or whatever is needed in your game) that users should connect to to play in this occurrence rather than the usual game server. Could be the ip address of the host for peer-to-peer play. Can only be set if the activity/challenge custom_launch_address_allowed is true. Max length: 255 */
  String customLaunchAddress = null

  /* Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Cannot be true if activity/challenge has it false. Null to inherit */
  Boolean hostStatusControl = null

  /* Whether users can join while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit */
  Boolean joinInPlay = null

  /* Whether users can leave while the status is PLAYING. Must be false or null unless this setting is true in activity (or challenge if applicable). Null to inherit */
  Boolean leaveInPlay = null

  /* The maximum number of players the game can hold. Must be equal or less than activity (or must match challenge if applicable) */
  Integer maxPlayers = null

  /* The minimum number of players the game can hold. Must be equal or greater than activity (or must match challenge if applicable) */
  Integer minPlayers = null

  /* Restriction for whether the non-host players can control of the status in place of the host. Default: false */
  Boolean nonHostStatusControl = null

  /* Restriction for who is able to report game end and results. Admin is always able to send results as well. Must be equal or more restrictive than activity (or must match challenge if applicable). Default inherits */
  String resultsTrust = null
  

}

