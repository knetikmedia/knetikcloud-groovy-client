package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceSimpleWallet
import io.swagger.model.PageResourceWalletTotalResponse
import io.swagger.model.PageResourceWalletTransactionResource
import io.swagger.model.Result
import io.swagger.model.SimpleWallet
import io.swagger.model.WalletAlterRequest
import io.swagger.model.WalletTransactionResource

import java.util.*;

@Mixin(ApiUtils)
class PaymentsWalletsApi {
    String basePath = "https://sandbox.knetikcloud.com"
    String versionPath = "/api/v1"

    def getUserWallet ( Integer userId, String currencyCode, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/wallets/{currency_code}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SimpleWallet.class )
                    
    }
    def getUserWalletTransactions ( Integer userId, String currencyCode, String filterType, Long filterMaxDate, Long filterMinDate, String filterSign, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/wallets/{currency_code}/transactions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterMaxDate)))
            queryParams.put("filter_max_date", String.valueOf(filterMaxDate))
if (!"null".equals(String.valueOf(filterMinDate)))
            queryParams.put("filter_min_date", String.valueOf(filterMinDate))
if (!"null".equals(String.valueOf(filterSign)))
            queryParams.put("filter_sign", String.valueOf(filterSign))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTransactionResource.class )
                    
    }
    def getUserWallets ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/wallets"

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
                    SimpleWallet.class )
                    
    }
    def getWalletBalances ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/wallets/totals"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTotalResponse.class )
                    
    }
    def getWalletTransactions ( Integer filterInvoice, String filterType, String filterDate, String filterSign, Integer filterUserId, String filterUsername, String filterDetails, String filterCurrencyCode, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/wallets/transactions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterInvoice)))
            queryParams.put("filter_invoice", String.valueOf(filterInvoice))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filter_type", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterDate)))
            queryParams.put("filter_date", String.valueOf(filterDate))
if (!"null".equals(String.valueOf(filterSign)))
            queryParams.put("filter_sign", String.valueOf(filterSign))
if (!"null".equals(String.valueOf(filterUserId)))
            queryParams.put("filter_user_id", String.valueOf(filterUserId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filter_username", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterDetails)))
            queryParams.put("filter_details", String.valueOf(filterDetails))
if (!"null".equals(String.valueOf(filterCurrencyCode)))
            queryParams.put("filter_currency_code", String.valueOf(filterCurrencyCode))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTransactionResource.class )
                    
    }
    def getWallets ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/wallets"

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
                    PageResourceSimpleWallet.class )
                    
    }
    def updateWalletBalance ( Integer userId, String currencyCode, WalletAlterRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/{user_id}/wallets/{currency_code}/balance"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (currencyCode == null) {
            throw new RuntimeException("missing required params currencyCode")
        }

        

        // Also still TODO: form params, body param

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    WalletTransactionResource.class )
                    
    }
}
