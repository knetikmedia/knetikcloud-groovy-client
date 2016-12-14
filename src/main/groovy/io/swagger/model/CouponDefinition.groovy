package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class CouponDefinition {

    String code = null

    String description = null

    String discountType = null

    Boolean exclusive = null

    Double maxDiscount = null

    Integer maxQuantity = null

    Double minCartTotal = null

    String name = null

    Integer targetItemId = null

    String type = null

    List<String> validForTags = new ArrayList<String>()

    Double value = null

    Integer vendorId = null
  

}

