package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Maintenance

import java.util.*;

@Mixin(ApiUtils)
class UtilMaintenanceApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def deleteUsingDELETE1 ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/maintenance"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getUsingGET1 ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/maintenance"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    Maintenance.class )
                    
    }
    def postUsingPOST ( Maintenance maintenance, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/maintenance"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def postUsingPUT ( Maintenance maintenance, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/maintenance"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
