package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ImportJobOutputResource;
import java.util.List;
@Canonical
class ImportJobResource {

  /* The id of the category to assign all questions in the import to */
  String categoryId = null

  /* The date the job was created in seconds since unix epoc */
  Long createdDate = null

  /* The id of the job */
  Long id = null

  /* A name for this import for later reference */
  String name = null

  /* Error information from validation */
  List<ImportJobOutputResource> output = new ArrayList<ImportJobOutputResource>()

  /* The number of questions form the CSV file. Filled in after validation */
  Long recordCount = null

  /* The status of the job */
  String status = null

  /* The date the job was last updated in seconds since unix epoc */
  Long updatedDate = null

  /* The url of a CSV file to pull trivia questions from. Cannot be changed after initial POST */
  String url = null

  /* The vendor who supplied this set of questions */
  String vendor = null
  

}

