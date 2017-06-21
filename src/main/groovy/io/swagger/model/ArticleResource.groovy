package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.NestedCategory;
import io.swagger.model.Property;
import java.util.List;
@Canonical
class ArticleResource {

  /* Whether the article is active */
  Boolean active = null

  /* A map of additional properties, keyed on the property name.  Must match the names and types defined in the template for this item type */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The body of the article */
  String body = null

  /* The category for the article */
  NestedCategory category = null

  /* The date/time this resource was created in seconds since unix epoch */
  Long createdDate = null

  /* The id of the article */
  String id = null

  /* The tags for the article */
  List<String> tags = new ArrayList<String>()

  /* An article template this article is validated against (private). May be null and no validation of additional_properties will be done */
  String template = null

  /* The title of the article */
  String title = null

  /* The date/time this resource was last updated in seconds since unix epoch */
  Long updatedDate = null
  

}

