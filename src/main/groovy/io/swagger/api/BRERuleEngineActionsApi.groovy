package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ActionResource
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineActionsApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getBREActions ( String filterCategory, String filterName, String filterTags, String filterSearch, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/actions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterTags)))
            queryParams.put("filterTags", String.valueOf(filterTags))
if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filterSearch", String.valueOf(filterSearch))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    ActionResource.class )
                    
    }
}
