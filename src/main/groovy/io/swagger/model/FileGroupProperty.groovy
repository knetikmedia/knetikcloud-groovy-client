package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.FileProperty;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class FileGroupProperty {

  /* The list of files */
  List<FileProperty> files = new ArrayList<FileProperty>()
  

}

