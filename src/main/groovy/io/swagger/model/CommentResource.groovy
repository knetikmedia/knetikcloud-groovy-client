package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SimpleUserResource;
@Canonical
class CommentResource {

  /* The comment content of that resource */
  String content = null

  /* The type of object this comment applies to (ex: video, article, etc). Required when passed to /comments */
  String context = null

  /* The id of the object this comment applies to.  Required when passed to /comments */
  Integer contextId = null

  /* The date/time this resource was created in seconds since epoch */
  Long createdDate = null

  /* The unique ID for that resource */
  Long id = null

  /* The summary of that resource */
  String summary = null

  /* The date/time this resource was last updated in seconds since epoch */
  Long updatedDate = null

  /* The user who created the comment */
  SimpleUserResource user = null
  

}

