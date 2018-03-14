package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.IntWrapper
import io.swagger.model.InventorySubscriptionResource
import io.swagger.model.InvoiceResource
import io.swagger.model.ReactivateSubscriptionRequest
import io.swagger.model.Result
import io.swagger.model.StringWrapper
import io.swagger.model.SubscriptionPriceOverrideRequest
import io.swagger.model.SubscriptionStatusWrapper

import java.util.*;

@Mixin(ApiUtils)
class UsersSubscriptionsApi {
    String basePath = "https://jsapi-integration.us-east-1.elasticbeanstalk.com"
    String versionPath = "/api/v1"

    def getUserSubscriptionDetails ( Integer userId, Integer inventoryId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    InventorySubscriptionResource.class )
                    
    }
    def getUsersSubscriptionDetails ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/subscriptions"

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
                    InventorySubscriptionResource.class )
                    
    }
    def reactivateUserSubscription ( Integer userId, Integer inventoryId, ReactivateSubscriptionRequest reactivateSubscriptionRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    InvoiceResource.class )
                    
    }
    def setSubscriptionBillDate ( Integer userId, Integer inventoryId, Long billDate, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setSubscriptionPaymentMethod ( Integer userId, Integer inventoryId, IntWrapper paymentMethodId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setSubscriptionStatus ( Integer userId, Integer inventoryId, SubscriptionStatusWrapper status, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setUserSubscriptionPlan ( Integer userId, Integer inventoryId, StringWrapper planId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def setUserSubscriptionPrice ( Integer userId, Integer inventoryId, SubscriptionPriceOverrideRequest theOverrideDetails, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/subscriptions/{inventory_id}/price-override"

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

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
}
