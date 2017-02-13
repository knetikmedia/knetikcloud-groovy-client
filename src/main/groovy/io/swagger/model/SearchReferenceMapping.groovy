package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import java.util.List;
@Canonical
class SearchReferenceMapping {

  /* Unique identifier for the mapping to protect against duplicates */
  String id = null

  /* The field within the type that contains the id from the refType */
  String refIdField = null

  /* The index type that the mapping pulls data from */
  String refType = null

  /* A map whose keys are the field names in the refType and values are the field name in the type */
  Map<String, String> sourceFieldToDestinationField = new HashMap<String, String>()

  /* The index type that the mapping is for */
  String type = null
  

}

