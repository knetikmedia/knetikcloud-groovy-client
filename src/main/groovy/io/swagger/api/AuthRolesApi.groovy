package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ClientResource
import io.swagger.model.PageResourceRoleResource
import io.swagger.model.Result
import io.swagger.model.RoleResource
import io.swagger.model.UserResource

import java.util.*;

@Mixin(ApiUtils)
class AuthRolesApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def createRole ( RoleResource roleResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    RoleResource.class )
                    
    }
    def deleteRole ( String role, Boolean force, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles/{role}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (role == null) {
            throw new RuntimeException("missing required params role")
        }

        if (!"null".equals(String.valueOf(force)))
            queryParams.put("force", String.valueOf(force))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getClientRoles ( String clientKey, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/clients/{client_key}/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    RoleResource.class )
                    
    }
    def getRole ( String role, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles/{role}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (role == null) {
            throw new RuntimeException("missing required params role")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    RoleResource.class )
                    
    }
    def getRoles ( String filterName, String filterRole, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterName)))
            queryParams.put("filter_name", String.valueOf(filterName))
if (!"null".equals(String.valueOf(filterRole)))
            queryParams.put("filter_role", String.valueOf(filterRole))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceRoleResource.class )
                    
    }
    def getUserRoles ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/users/{user_id}/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    RoleResource.class )
                    
    }
    def setClientRoles ( String clientKey, List<String> rolesList, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/clients/{client_key}/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (clientKey == null) {
            throw new RuntimeException("missing required params clientKey")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ClientResource.class )
                    
    }
    def setPermissionsForRole ( String role, List<String> permissionsList, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles/{role}/permissions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (role == null) {
            throw new RuntimeException("missing required params role")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    RoleResource.class )
                    
    }
    def setUserRoles ( Integer userId, List<String> rolesList, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/users/{user_id}/roles"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    UserResource.class )
                    
    }
    def updateRole ( String role, RoleResource roleResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/auth/roles/{role}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (role == null) {
            throw new RuntimeException("missing required params role")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    RoleResource.class )
                    
    }
}
