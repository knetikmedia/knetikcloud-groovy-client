package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.EntitlementGrantRequest
import io.swagger.model.EntitlementItem
import io.swagger.model.InvoiceResource
import io.swagger.model.ItemTemplateResource
import io.swagger.model.PageResourceEntitlementItem
import io.swagger.model.PageResourceItemTemplateResource
import io.swagger.model.PageResourceUserInventoryResource
import io.swagger.model.PageResourceUserItemLogResource
import io.swagger.model.Result
import io.swagger.model.UserInventoryAddRequest
import io.swagger.model.UserInventoryResource

import java.util.*;

@Mixin(ApiUtils)
class UsersInventoryApi {
    String basePath = "https://localhost:8080/"
    String versionPath = "/api/v1"

    def addItemToUserInventory ( Integer id, UserInventoryAddRequest userInventoryAddRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}/inventory"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InvoiceResource.class )
                    
    }
    def checkUserEntitlementItem ( String userId, Integer itemId, String sku, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/entitlements/{item_id}/check"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (itemId == null) {
            throw new RuntimeException("missing required params itemId")
        }

        if (!"null".equals(String.valueOf(sku)))
            queryParams.put("sku", String.valueOf(sku))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )
                    
    }
    def createEntitlementItem ( Boolean cascade, EntitlementItem entitlementItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    EntitlementItem.class )
                    
    }
    def createEntitlementTemplate ( ItemTemplateResource template, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ItemTemplateResource.class )
                    
    }
    def deleteEntitlementItem ( Integer entitlementId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/{entitlement_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (entitlementId == null) {
            throw new RuntimeException("missing required params entitlementId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteEntitlementTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/templates/{id}"

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
    def getEntitlementItem ( Integer entitlementId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/{entitlement_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (entitlementId == null) {
            throw new RuntimeException("missing required params entitlementId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    EntitlementItem.class )
                    
    }
    def getEntitlementItems ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements"

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
                    PageResourceEntitlementItem.class )
                    
    }
    def getEntitlementTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ItemTemplateResource.class )
                    
    }
    def getEntitlementTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/templates"

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
                    PageResourceItemTemplateResource.class )
                    
    }
    def getUserInventories ( Integer id, Boolean inactive, Integer size, Integer page, String filterItemName, Integer filterItemId, String filterUsername, String filterGroup, String filterDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{id}/inventory"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(filterItemName)))
            queryParams.put("filterItemName", String.valueOf(filterItemName))
if (!"null".equals(String.valueOf(filterItemId)))
            queryParams.put("filterItemId", String.valueOf(filterItemId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filterUsername", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterGroup)))
            queryParams.put("filterGroup", String.valueOf(filterGroup))
if (!"null".equals(String.valueOf(filterDate)))
            queryParams.put("filterDate", String.valueOf(filterDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserInventoryResource.class )
                    
    }
    def getUserInventory ( Integer userId, Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/inventory/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    UserInventoryResource.class )
                    
    }
    def getUserInventoryLog ( String userId, Integer id, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/inventory/{id}/log"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserItemLogResource.class )
                    
    }
    def getUsersInventory ( Boolean inactive, Integer size, Integer page, String filterItemName, Integer filterItemId, String filterUsername, String filterGroup, String filterDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/inventories"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(inactive)))
            queryParams.put("inactive", String.valueOf(inactive))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(filterItemName)))
            queryParams.put("filterItemName", String.valueOf(filterItemName))
if (!"null".equals(String.valueOf(filterItemId)))
            queryParams.put("filterItemId", String.valueOf(filterItemId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filterUsername", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterGroup)))
            queryParams.put("filterGroup", String.valueOf(filterGroup))
if (!"null".equals(String.valueOf(filterDate)))
            queryParams.put("filterDate", String.valueOf(filterDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceUserInventoryResource.class )
                    
    }
    def grantUserEntitlement ( Integer userId, EntitlementGrantRequest grantRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/entitlements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (grantRequest == null) {
            throw new RuntimeException("missing required params grantRequest")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def updateEntitlementItem ( Integer entitlementId, Boolean cascade, EntitlementItem entitlementItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/{entitlement_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (entitlementId == null) {
            throw new RuntimeException("missing required params entitlementId")
        }

        if (!"null".equals(String.valueOf(cascade)))
            queryParams.put("cascade", String.valueOf(cascade))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateEntitlementTemplate ( String id, ItemTemplateResource template, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements/templates/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    ItemTemplateResource.class )
                    
    }
    def updateUserInventoryBehaviorData ( Integer userId, Integer id, Object data, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/inventory/{id}/behavior-data"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateUserInventoryExpires ( Integer userId, Integer id, Long timestamp, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/inventory/{id}/expires"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateUserInventoryStatus ( Integer userId, Integer id, String inventoryStatus, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/inventory/{id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def useUserEntitlementItem ( String userId, Integer itemId, String sku, String info, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/entitlements/{item_id}/use"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (itemId == null) {
            throw new RuntimeException("missing required params itemId")
        }

        if (!"null".equals(String.valueOf(sku)))
            queryParams.put("sku", String.valueOf(sku))
if (!"null".equals(String.valueOf(info)))
            queryParams.put("info", String.valueOf(info))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
}
