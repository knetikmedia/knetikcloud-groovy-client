package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SettingOption;
import java.util.List;
@Canonical
class TheDefinitionOfAnActivityParametersExDifficultyLevel {

  /* Whether the setting is advanced. Default: false */
  Boolean advancedOption = null

  /* The default value of the setting (must be in options array). Ex: easy */
  String defaultValue = null

  /* The description of the setting: Ex: Choose the difficulty level to show more or less complicated questions (for a trivia activity) */
  String description = null

  /* The unique ID for the setting: Ex: difficulty */
  String key = null

  /* The textual name of the setting: Ex: Difficulty Level */
  String name = null

  /* The set of options available for this setting, Ex: easy, medium, hard */
  List<SettingOption> options = new ArrayList<SettingOption>()
  

}

