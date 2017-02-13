package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.FulfillmentType
import io.swagger.model.PageResourceFulfillmentType

import java.util.*;

@Mixin(ApiUtils)
class FulfillmentApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createFulfillmentType ( FulfillmentType type, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/fulfillment/types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    FulfillmentType.class )
                    
    }
    def deleteFulfillmentType ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/fulfillment/types/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getFulfillmentType ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/fulfillment/types/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    FulfillmentType.class )
                    
    }
    def getFulfillmentTypes ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/fulfillment/types"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceFulfillmentType.class )
                    
    }
    def updateFulfillmentType ( Integer id, FulfillmentType fulfillmentType, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/store/fulfillment/types/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
