package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class AmazonS3Activity {

  /* S3 action (i.e., 'PUT') associated with the activity */
  String action = null

  /* Date the resource was created in S3 */
  Long createdDate = null

  /* Name of the file being processed as a resource in S3 */
  String filename = null

  /* Unique id of the S3 activity */
  Long id = null

  /* S3 object key for the resource */
  String objectKey = null

  /* URL for accessing the S3 resource */
  String url = null

  /* The id of the user that created this S3 activity */
  Integer userId = null
  

}

