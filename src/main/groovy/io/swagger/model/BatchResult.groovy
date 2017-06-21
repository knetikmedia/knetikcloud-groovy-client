package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.BatchReturn;
import java.util.List;
@Canonical
class BatchResult {

  /* List of batch responses.  Returns in the order requested */
  List<BatchReturn> batchReturn = new ArrayList<BatchReturn>()

  /* The date the batch call started processing */
  Long createdDate = null

  /* The token to use at the /batch/{token} endpoint if the request times out */
  String id = null

  /* The date the batch call finished processing */
  Long updatedDate = null
  

}

