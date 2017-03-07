package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ChallengeEventResource;
import io.swagger.model.Order;
import java.util.List;
@Canonical
class PageResourceChallengeEventResource {

    List<ChallengeEventResource> content = new ArrayList<ChallengeEventResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    List<Order> sort = new ArrayList<Order>()

    Long totalElements = null

    Integer totalPages = null
  

}

