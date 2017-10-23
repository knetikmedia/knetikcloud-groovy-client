package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SelectedSettingRequest {

  /* The unique ID for the setting */
  String key = null

  /* The unique ID for the option. Must match one of the options from this setting in the activity, if not part of a challenge */
  String value = null
  

}

