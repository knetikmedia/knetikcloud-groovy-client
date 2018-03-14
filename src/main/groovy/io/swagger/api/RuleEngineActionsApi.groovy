package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ActionResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class RuleEngineActionsApi {
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def getBREActions ( String filterCategory, String filterName, String filterTags, String filterSearch, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/actions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filter_category", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterTags)))
            queryParams.put("filter_tags", String.valueOf(filterTags))
if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    ActionResource.class )
                    
    }
}
