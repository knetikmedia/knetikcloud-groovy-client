package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class CoreActivitySettings {

  /* Whether the host can boot a user while the status is PLAYING. Default false */
  Boolean bootInPlay = null

  /* Restriction for whether the host creating an occurrence can specify a custom launch address (such as their own ip address). Default 'false' */
  Boolean customLaunchAddressAllowed = null

  /* Restriction for who can host an occurrence. admin disallows regular users, player means the user must also be a player in the occurrence if not admin, non-player means the user has the option to host without being a player. Default 'player' */
  String hostOption = null

  /* Restriction for whether the host has control of the status once the game launches. If false they can only manage the game before (when setup and open). Default 'false' */
  Boolean hostStatusControl = null

  /* Whether users can join while the status is PLAYING. Default false */
  Boolean joinInPlay = null

  /* Whether users can leave while the status is PLAYING. Default false */
  Boolean leaveInPlay = null

  /* The maximum number of players the game can hold */
  Integer maxPlayers = null

  /* The minimum number of players the game can hold */
  Integer minPlayers = null

  /* Restriction for who is able to report game end and results. Admin is always able to send results as well. Default 'none' */
  String resultsTrust = null
  

}

