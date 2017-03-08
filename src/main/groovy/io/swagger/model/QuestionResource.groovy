package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AnswerResource;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.NestedCategory;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class QuestionResource {

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The list of available answers */
  List<AnswerResource> answers = new ArrayList<AnswerResource>()

  /* The category for the question */
  NestedCategory category = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The difficulty of the question */
  Integer difficulty = null

  /* The unique ID for that resource */
  String id = null

  /* The id of the import job that created the question, or null if not from an import */
  Long importId = null

  /* When the question becomes available, null for never, in seconds since epoch */
  Long publishedDate = null

  /* The question. Different 'type' values indicate different structures as the question may be test, image, etc. See information on additional properties for the list and their structures */
  Property question = null

  /* The first source of the question */
  String source1 = null

  /* The second source of the question */
  String source2 = null

  /* The list of tags */
  List<String> tags = new ArrayList<String>()

  /* A question template this question is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null

  /* The supplier of the question */
  String vendor = null
  

}

