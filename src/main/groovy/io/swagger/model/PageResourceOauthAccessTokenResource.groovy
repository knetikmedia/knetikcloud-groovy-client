package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.OauthAccessTokenResource;
import io.swagger.model.Order;
import java.util.List;
@Canonical
class PageResourceOauthAccessTokenResource {

    List<OauthAccessTokenResource> content = new ArrayList<OauthAccessTokenResource>()

    Boolean first = null

    Boolean last = null

    Integer number = null

    Integer numberOfElements = null

    Integer size = null

    List<Order> sort = new ArrayList<Order>()

    Long totalElements = null

    Integer totalPages = null
  

}

