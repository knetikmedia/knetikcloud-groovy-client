package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Order;
import io.swagger.model.TopicResource;
import java.util.List;
@Canonical
class PageResourceTopicResource {

    List<TopicResource> content = new ArrayList<TopicResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    List<Order> sort = new ArrayList<Order>()

    Long totalElements = null

    Integer totalPages = null
  

}

