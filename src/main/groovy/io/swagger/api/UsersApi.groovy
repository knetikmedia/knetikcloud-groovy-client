package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ChatMessageRequest
import io.swagger.model.ChatMessageResource
import io.swagger.model.NewPasswordRequest
import io.swagger.model.PageResourceChatMessageResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.PageResourceUserBaseResource
import io.swagger.model.PasswordResetRequest
import io.swagger.model.Result
import io.swagger.model.StringWrapper
import io.swagger.model.TemplateResource
import io.swagger.model.UserResource

import java.util.*;

@Mixin(ApiUtils)
class UsersApi {
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def addUserTag ( Integer userId, StringWrapper tag, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def createUserTemplate ( TemplateResource userTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteUserTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getDirectMessages1 ( Integer recipientId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{recipient_id}/messages"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (recipientId == null) {
            throw new RuntimeException("missing required params recipientId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceChatMessageResource.class )
                    
    }
    def getUser ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserResource.class )
                    
    }
    def getUserTags ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/tags"

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
                    String.class )
                    
    }
    def getUserTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    TemplateResource.class )
                    
    }
    def getUserTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceTemplateResource.class )
                    
    }
    def getUsers ( String filterDisplayname, String filterEmail, String filterFirstname, String filterFullname, String filterLastname, String filterUsername, String filterTag, String filterGroup, String filterRole, String filterLastActivity, String filterIdList, String filterSearch, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterDisplayname)))
            queryParams.put("filter_displayname", String.valueOf(filterDisplayname))
if (!"null".equals(String.valueOf(filterEmail)))
            queryParams.put("filter_email", String.valueOf(filterEmail))
if (!"null".equals(String.valueOf(filterFirstname)))
            queryParams.put("filter_firstname", String.valueOf(filterFirstname))
if (!"null".equals(String.valueOf(filterFullname)))
            queryParams.put("filter_fullname", String.valueOf(filterFullname))
if (!"null".equals(String.valueOf(filterLastname)))
            queryParams.put("filter_lastname", String.valueOf(filterLastname))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filter_username", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterTag)))
            queryParams.put("filter_tag", String.valueOf(filterTag))
if (!"null".equals(String.valueOf(filterGroup)))
            queryParams.put("filter_group", String.valueOf(filterGroup))
if (!"null".equals(String.valueOf(filterRole)))
            queryParams.put("filter_role", String.valueOf(filterRole))
if (!"null".equals(String.valueOf(filterLastActivity)))
            queryParams.put("filter_last_activity", String.valueOf(filterLastActivity))
if (!"null".equals(String.valueOf(filterIdList)))
            queryParams.put("filter_id_list", String.valueOf(filterIdList))
if (!"null".equals(String.valueOf(filterSearch)))
            queryParams.put("filter_search", String.valueOf(filterSearch))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserBaseResource.class )
                    
    }
    def passwordReset ( Integer id, NewPasswordRequest newPasswordRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{id}/password-reset"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def postUserMessage ( Integer recipientId, ChatMessageRequest chatMessageRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{recipient_id}/messages"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (recipientId == null) {
            throw new RuntimeException("missing required params recipientId")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ChatMessageResource.class )
                    
    }
    def registerUser ( UserResource userResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    UserResource.class )
                    
    }
    def removeUserTag ( Integer userId, String tag, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def setPassword ( Integer id, StringWrapper password, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{id}/password"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def startPasswordReset ( Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{id}/password-reset"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def submitPasswordReset ( PasswordResetRequest passwordReset, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/password-reset"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def updateUser ( String id, UserResource userResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateUserTemplate ( String id, TemplateResource userTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    TemplateResource.class )
                    
    }
}
