package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourcePermissionResource
import io.swagger.model.PermissionResource

import java.util.*;

@Mixin(ApiUtils)
class AuthPermissionsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def createPermission ( PermissionResource permissionResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/permissions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    PermissionResource.class )
                    
    }
    def deletePermission ( String permission, Boolean force, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/permissions/{permission}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (permission == null) {
            throw new RuntimeException("missing required params permission")
        }

        if (!"null".equals(String.valueOf(force)))
            queryParams.put("force", String.valueOf(force))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getPermission ( String permission, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/permissions/{permission}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (permission == null) {
            throw new RuntimeException("missing required params permission")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PermissionResource.class )
                    
    }
    def getPermissions ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/permissions"

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
                    PageResourcePermissionResource.class )
                    
    }
    def updatePermission ( String permission, PermissionResource permissionResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/auth/permissions/{permission}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (permission == null) {
            throw new RuntimeException("missing required params permission")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
