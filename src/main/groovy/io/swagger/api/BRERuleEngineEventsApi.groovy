package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.BreEvent
import io.swagger.model.OAuth2Authentication

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineEventsApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def fireEventUsingPOST ( BreEvent breEvent, OAuth2Authentication authentication, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/bre/events"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
