package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.InventorySubscriptionResource
import io.swagger.model.InvoiceResource
import io.swagger.model.ReactivateSubscriptionRequest

import java.util.*;

@Mixin(ApiUtils)
class UsersSubscriptionsApi {
    String basePath = "https://devsandbox.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getSubscriptionDetailsUsingGET ( Integer userId, Integer inventoryId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InventorySubscriptionResource.class )
                    
    }
    def getSubscriptionDetailsUsingGET1 ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    InventorySubscriptionResource.class )
                    
    }
    def reactivateUsingPOST ( Integer userId, Integer inventoryId, ReactivateSubscriptionRequest reactivateSubscriptionRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/reactivate"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InvoiceResource.class )
                    
    }
    def setBillDateUsingPUT ( Integer userId, Integer inventoryId, Long billDate, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/bill-date"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }
        // verify required params are set
        if (billDate == null) {
            throw new RuntimeException("missing required params billDate")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setPaymentMethodUsingPUT ( Integer userId, Integer inventoryId, Integer paymentMethodId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/payment-method"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setStatusUsingPUT ( Integer userId, Integer inventoryId, String status, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/status"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }
        // verify required params are set
        if (status == null) {
            throw new RuntimeException("missing required params status")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setUserPlanUsingPUT ( Integer userId, Integer inventoryId, String planId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/plan"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (inventoryId == null) {
            throw new RuntimeException("missing required params inventoryId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
