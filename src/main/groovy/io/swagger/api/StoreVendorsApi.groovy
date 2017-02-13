package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceVendorResource
import io.swagger.model.VendorResource

import java.util.*;

@Mixin(ApiUtils)
class StoreVendorsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createVendor ( VendorResource vendor, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/vendors"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    VendorResource.class )
                    
    }
    def deleteVendor ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/vendors/{id}"

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
    def getVendor ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/vendors/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    VendorResource.class )
                    
    }
    def getVendors ( String filterName, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/vendors"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filterName", String.valueOf(filterName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceVendorResource.class )
                    
    }
    def updateVendor ( Integer id, VendorResource vendor, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/vendors/{id}"

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
