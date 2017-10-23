package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertyDefinitionResource;
import io.swagger.model.PropertyFieldListResource;
@Canonical
class FileGroupPropertyDefinitionResource {

  /* If provided, a file type that the property must match */
  String fileType = null

  /* If provided, the maximum number of files in the group */
  Integer maxCount = null

  /* If provided, the maximum allowed size per file in bytes */
  Long maxFileSize = null

  /* If provided, the minimum number of files in the group */
  Integer minCount = null
  

}

