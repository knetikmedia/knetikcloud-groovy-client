package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Batch
import io.swagger.model.BatchResult
import io.swagger.model.BatchReturn
import io.swagger.model.Result

import java.util.*;

@Mixin(ApiUtils)
class UtilBatchApi {
    String basePath = "https://devsandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getBatch ( String token, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/batch/{token}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    BatchReturn.class )
                    
    }
    def sendBatch ( Batch batch, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/batch"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "array",
                    BatchReturn.class )
                    
    }
}
