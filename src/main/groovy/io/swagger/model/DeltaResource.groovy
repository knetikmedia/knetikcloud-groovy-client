package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class DeltaResource {

  /* The id of the category for question */
  String categoryId = null

  /* The media type of the question */
  String mediaType = null

  /* The id of the question */
  String questionId = null

  /* Whether the question was updated or removed */
  String state = null

  /* The tags for the question */
  List<String> tags = new ArrayList<String>()

  /* The date this question was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

