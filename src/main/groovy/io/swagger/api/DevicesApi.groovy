package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.DeviceResource
import io.swagger.model.PageResourceDeviceResource

import java.util.*;

@Mixin(ApiUtils)
class DevicesApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def createDeviceUsingPOST ( DeviceResource device, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/devices"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (device == null) {
            throw new RuntimeException("missing required params device")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DeviceResource.class )
                    
    }
    def deleteDeviceUsingDELETE ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/devices/{id}"

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
    def getDeviceUsingGET ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/devices/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    DeviceResource.class )
                    
    }
    def getDevicesUsingGET ( String filterMake, String filterModel, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/devices"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterMake)))
            queryParams.put("filterMake", String.valueOf(filterMake))
if (!"null".equals(String.valueOf(filterModel)))
            queryParams.put("filterModel", String.valueOf(filterModel))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceDeviceResource.class )
                    
    }
    def updateDeviceUsingPUT ( DeviceResource device, Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/devices/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (device == null) {
            throw new RuntimeException("missing required params device")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
