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
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def getBREActions ( String filterCategory, String filterName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/actions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    ActionResource.class )
                    
    }
}
