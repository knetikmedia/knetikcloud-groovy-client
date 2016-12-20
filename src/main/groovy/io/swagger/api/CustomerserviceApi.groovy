package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CustomerConfig
import io.swagger.model.CustomerResource

import java.util.*;

@Mixin(ApiUtils)
class CustomerserviceApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createCustomerUsingPOST ( CustomerConfig customer, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/customers"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (customer == null) {
            throw new RuntimeException("missing required params customer")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def getCustomersUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/customers"

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
                    "GET", "array",
                    CustomerResource.class )
                    
    }
}
