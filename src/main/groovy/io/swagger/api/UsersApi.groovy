package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.NewPasswordRequest
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.PageResourceUserBaseResource
import io.swagger.model.TemplateResource
import io.swagger.model.UserResource

import java.util.*;

@Mixin(ApiUtils)
class UsersApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addTagUsingPOST1 ( Integer userId, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/tags"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (tag == null) {
            throw new RuntimeException("missing required params tag")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def createUserTemplateUsingPOST ( TemplateResource userTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteUserTemplateUsingDELETE ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/templates/{id}"

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
    def doPasswordResetUsingPUT ( Integer id, NewPasswordRequest newPasswordRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}/password-reset"

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
    def getTagsUsingGET3 ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/tags"

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
    def getUserTemplateUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/templates/{id}"

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
    def getUserTemplatesUsingGET ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/templates"

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
    def getUserUsingGET ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserResource.class )
                    
    }
    def getUsersUsingGET ( String filterDisplayname, String filterEmail, String filterFirstname, String filterFullname, String filterLastname, String filterUsername, String filterTag, String filterGroup, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterDisplayname)))
            queryParams.put("filterDisplayname", String.valueOf(filterDisplayname))
if (!"null".equals(String.valueOf(filterEmail)))
            queryParams.put("filterEmail", String.valueOf(filterEmail))
if (!"null".equals(String.valueOf(filterFirstname)))
            queryParams.put("filterFirstname", String.valueOf(filterFirstname))
if (!"null".equals(String.valueOf(filterFullname)))
            queryParams.put("filterFullname", String.valueOf(filterFullname))
if (!"null".equals(String.valueOf(filterLastname)))
            queryParams.put("filterLastname", String.valueOf(filterLastname))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filterUsername", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filterTag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterGroup)))
            queryParams.put("filterGroup", String.valueOf(filterGroup))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserBaseResource.class )
                    
    }
    def initiatePasswordResetUsingPOST ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}/password-reset"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def registerUserUsingPOST ( UserResource userResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    UserResource.class )
                    
    }
    def removeTagUsingDELETE1 ( Integer userId, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/tags/{tag}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (tag == null) {
            throw new RuntimeException("missing required params tag")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def setPasswordUsingPUT ( Integer id, String password, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}/password"

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
    def updateUserTemplateUsingPUT ( String id, TemplateResource userTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/templates/{id}"

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
    def updateUserUsingPUT ( String id, UserResource userResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}"

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
