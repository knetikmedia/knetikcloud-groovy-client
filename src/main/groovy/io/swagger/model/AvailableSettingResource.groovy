package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.SettingOption;
import java.util.List;
@Canonical
class AvailableSettingResource {

  /* Whether the setting is advanced. Default: false */
  Boolean advancedOption = null

  /* The value of the default option (must be in options array) */
  String defaultValue = null

  /* The description of the setting */
  String description = null

  /* The unique ID for the setting */
  String key = null

  /* The textual name of the setting */
  String name = null

  /* The set of options available for this setting */
  List<SettingOption> options = new ArrayList<SettingOption>()
  

}

