package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.ArtistResource
import io.swagger.model.PageResourceArtistResource
import io.swagger.model.PageResourceTemplateResource
import io.swagger.model.TemplateResource

import java.util.*;

@Mixin(ApiUtils)
class MediaArtistsApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addArtist ( ArtistResource artistResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    ArtistResource.class )
                    
    }
    def createArtistTemplate ( TemplateResource artistTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/templates"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    TemplateResource.class )
                    
    }
    def deleteArtist ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteArtistTemplate ( String id, String cascade, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/templates/{id}"

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
    def getArtist ( Long id, Integer showContributions, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (!"null".equals(String.valueOf(showContributions)))
            queryParams.put("showContributions", String.valueOf(showContributions))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    ArtistResource.class )
                    
    }
    def getArtistTemplate ( String id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/templates/{id}"

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
    def getArtistTemplates ( Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/templates"

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
    def getArtists ( String filterArtistsByName, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(filterArtistsByName)))
            queryParams.put("filterArtistsByName", String.valueOf(filterArtistsByName))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceArtistResource.class )
                    
    }
    def updateArtist ( Long id, ArtistResource artistResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/{id}"

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
    def updateArtistTemplate ( String id, TemplateResource artistTemplateResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/artists/templates/{id}"

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
