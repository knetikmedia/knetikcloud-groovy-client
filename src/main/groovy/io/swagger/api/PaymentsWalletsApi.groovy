package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.PageResourceSimpleWallet
import io.swagger.model.PageResourceWalletTotalResponse
import io.swagger.model.PageResourceWalletTransactionResource
import io.swagger.model.SimpleWallet
import io.swagger.model.WalletAlterRequest
import io.swagger.model.WalletTransactionResource

import java.util.*;

@Mixin(ApiUtils)
class PaymentsWalletsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def getWalletTotalsUsingGET ( Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/wallets/totals"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTotalResponse.class )
                    
    }
    def getWalletUsingGET ( Integer userId, String currencyCode, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    SimpleWallet.class )
                    
    }
    def getWalletsUsingGET ( Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/wallets"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    SimpleWallet.class )
                    
    }
    def getWalletsUsingGET1 ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceSimpleWallet.class )
                    
    }
    def transactionHistoryUsingGET ( Integer filterInvoice, String filterType, Long filterMaxDate, Long filterMinDate, String filterSign, Integer filterUserId, String filterUsername, String filterDetails, String filterCurrencyCode, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/wallets/transactions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterInvoice)))
            queryParams.put("filterInvoice", String.valueOf(filterInvoice))
if (!"null".equals(String.valueOf(filterType)))
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterMaxDate)))
            queryParams.put("filterMaxDate", String.valueOf(filterMaxDate))
if (!"null".equals(String.valueOf(filterMinDate)))
            queryParams.put("filterMinDate", String.valueOf(filterMinDate))
if (!"null".equals(String.valueOf(filterSign)))
            queryParams.put("filterSign", String.valueOf(filterSign))
if (!"null".equals(String.valueOf(filterUserId)))
            queryParams.put("filterUserId", String.valueOf(filterUserId))
if (!"null".equals(String.valueOf(filterUsername)))
            queryParams.put("filterUsername", String.valueOf(filterUsername))
if (!"null".equals(String.valueOf(filterDetails)))
            queryParams.put("filterDetails", String.valueOf(filterDetails))
if (!"null".equals(String.valueOf(filterCurrencyCode)))
            queryParams.put("filterCurrencyCode", String.valueOf(filterCurrencyCode))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTransactionResource.class )
                    
    }
    def updateBalanceUsingPUT ( Integer userId, String currencyCode, WalletAlterRequest request, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    WalletTransactionResource.class )
                    
    }
    def userTransactionHistoryUsingGET ( Integer userId, String currencyCode, String filterType, Long filterMaxDate, Long filterMinDate, String filterSign, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
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
            queryParams.put("filterType", String.valueOf(filterType))
if (!"null".equals(String.valueOf(filterMaxDate)))
            queryParams.put("filterMaxDate", String.valueOf(filterMaxDate))
if (!"null".equals(String.valueOf(filterMinDate)))
            queryParams.put("filterMinDate", String.valueOf(filterMinDate))
if (!"null".equals(String.valueOf(filterSign)))
            queryParams.put("filterSign", String.valueOf(filterSign))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceWalletTransactionResource.class )
                    
    }
}
