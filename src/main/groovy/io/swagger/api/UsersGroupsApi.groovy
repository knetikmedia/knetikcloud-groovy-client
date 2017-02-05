package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.GroupMemberResource
import io.swagger.model.GroupResource
import io.swagger.model.PageResourceGroupMemberResource
import io.swagger.model.PageResourceGroupResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.TemplateResource

import java.util.*;

@Mixin(ApiUtils)
class UsersGroupsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addGroupUsingPOST ( GroupResource groupResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    GroupResource.class )
                    
    }
    def addMemberUsingPOST ( String uniqueName, GroupMemberResource username, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}/members"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }
        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    GroupMemberResource.class )
                    
    }
    def createGroupTemplateUsingPOST ( TemplateResource groupTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteGroupMemberUsingDELETE ( String uniqueName, Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}/members/{user_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteGroupTemplateUsingDELETE ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteGroupUsingDELETE ( String uniqueName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getGroupListUsingGET ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/groups"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    String.class )
                    
    }
    def getGroupMemberUsingGET ( String uniqueName, Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}/members/{user_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    GroupMemberResource.class )
                    
    }
    def getGroupTemplateUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TemplateResource.class )
                    
    }
    def getGroupTemplatesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/templates"

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
                    PageResourceTemplateResource.class )
                    
    }
    def getGroupUsingGET ( String uniqueName, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    GroupResource.class )
                    
    }
    def searchGroupsUsingGET ( String uniqueName, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}/members"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceGroupMemberResource.class )
                    
    }
    def searchGroupsUsingGET1 ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups"

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
                    PageResourceGroupResource.class )
                    
    }
    def updateGroupTemplateUsingPUT ( String id, TemplateResource groupTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/templates/{id}"

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
    def updateGroupUsingPUT ( String uniqueName, GroupResource groupResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateMemberStatusUsingPUT ( String uniqueName, Integer userId, String status, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/groups/{unique_name}/members/{user_id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (uniqueName == null) {
            throw new RuntimeException("missing required params uniqueName")
        }
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (status == null) {
            throw new RuntimeException("missing required params status")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
