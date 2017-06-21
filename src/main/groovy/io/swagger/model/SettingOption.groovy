package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SettingOption {

  /* The textual name of the option: Ex: Hard (level 10) */
  String name = null

  /* The unique ID for the option. Ex: 10 */
  String value = null
  

}

