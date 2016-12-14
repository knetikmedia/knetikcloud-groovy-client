package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.EntitlementItem
import io.swagger.model.InvoiceResource
import io.swagger.model.PageEntitlementItem
import io.swagger.model.PageUserInventoryResource
import io.swagger.model.PageUserItemLogResource
import io.swagger.model.UserInventoryAddRequest
import io.swagger.model.UserInventoryResource

import java.util.*;

@Mixin(ApiUtils)
class UsersInventoryApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addItemUsingPOST1 ( Integer id, UserInventoryAddRequest userInventoryAddRequest, Closure onSuccess, Closure onFailure)  {
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
    def createItemUsingPOST ( EntitlementItem entitlementItem, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/entitlements"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    EntitlementItem.class )
                    
    }
    def deleteItemUsingDELETE ( Integer entitlementId, Closure onSuccess, Closure onFailure)  {
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
    def entitlementCheckUsingGET ( String userId, Integer itemId, String sku, Closure onSuccess, Closure onFailure)  {
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
    def entitlementUseUsingPOST ( String userId, Integer itemId, String sku, String info, Closure onSuccess, Closure onFailure)  {
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
    def getCurrenciesUsingGET1 ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
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
                    PageEntitlementItem.class )
                    
    }
    def getInventoryListUsingGET ( Boolean inactive, Integer size, Integer page, String filterItemName, Long filterMinDate, Long filterMaxDate, Closure onSuccess, Closure onFailure)  {
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
if (!"null".equals(String.valueOf(filterMinDate)))
            queryParams.put("filterMinDate", String.valueOf(filterMinDate))
if (!"null".equals(String.valueOf(filterMaxDate)))
            queryParams.put("filterMaxDate", String.valueOf(filterMaxDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUserInventoryResource.class )
                    
    }
    def getInventoryUsingGET ( Integer userId, Integer id, Closure onSuccess, Closure onFailure)  {
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
    def getItemUsingGET ( Integer entitlementId, Closure onSuccess, Closure onFailure)  {
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
    def getUserInventoryListUsingGET ( Integer id, Boolean inactive, Integer size, Integer page, String filterItemName, Long filterMinDate, Long filterMaxDate, Closure onSuccess, Closure onFailure)  {
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
if (!"null".equals(String.valueOf(filterMinDate)))
            queryParams.put("filterMinDate", String.valueOf(filterMinDate))
if (!"null".equals(String.valueOf(filterMaxDate)))
            queryParams.put("filterMaxDate", String.valueOf(filterMaxDate))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageUserInventoryResource.class )
                    
    }
    def getUserInventoryLogUsingGET ( String userId, Integer id, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
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
                    PageUserItemLogResource.class )
                    
    }
    def updateItemUsingPUT1 ( Integer entitlementId, EntitlementItem entitlementItem, Closure onSuccess, Closure onFailure)  {
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
                    "PUT", "",
                    null )
                    
    }
    def updateUserInventoryBehaviorDataUsingPUT ( Integer userId, Integer id, Object data, Closure onSuccess, Closure onFailure)  {
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
    def updateUserInventoryExpiresUsingPUT ( Integer userId, Integer id, Long timestamp, Closure onSuccess, Closure onFailure)  {
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
    def updateUserInventoryStatusUsingPUT ( Integer userId, Integer id, String inventoryStatus, Closure onSuccess, Closure onFailure)  {
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
}
