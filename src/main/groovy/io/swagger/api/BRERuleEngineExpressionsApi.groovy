package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ExpressionResource
import io.swagger.model.Result
import io.swagger.model.StringWrapper

import java.util.*;

@Mixin(ApiUtils)
class BRERuleEngineExpressionsApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getBREExpression ( String type, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/expressions/{type}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (type == null) {
            throw new RuntimeException("missing required params type")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ExpressionResource.class )
                    
    }
    def getBREExpressions ( String filterTypeGroup, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/expressions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterTypeGroup)))
            queryParams.put("filter_type_group", String.valueOf(filterTypeGroup))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    ExpressionResource.class )
                    
    }
    def getExpressionAsText ( ExpressionResource expression, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/bre/expressions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    StringWrapper.class )
                    
    }
}
