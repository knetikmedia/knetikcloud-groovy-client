package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Batch
import io.swagger.model.BatchReturn

import java.util.*;

@Mixin(ApiUtils)
class UtilBatchApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getBatchPOSTUsingPOST ( Batch batch, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/batch"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
