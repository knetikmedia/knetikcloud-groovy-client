package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.CommentResource
import io.swagger.model.ContributionResource
import io.swagger.model.DispositionResource
import io.swagger.model.FlagResource
import io.swagger.model.PageResourceCommentResource
import io.swagger.model.PageResourceDispositionResource
import io.swagger.model.PageResourceVideoRelationshipResource
import io.swagger.model.PageResourceVideoResource
import io.swagger.model.VideoRelationshipResource
import io.swagger.model.VideoResource

import java.util.*;

@Mixin(ApiUtils)
class MediaVideosApi {
    String basePath = "https://integration.knetikcloud.com/"
    String versionPath = "/api/v1"

    def addUserToVideoWhitelist ( Long id, Integer userId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{id}/whitelist"

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
    def addVideo ( VideoResource videoResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    VideoResource.class )
                    
    }
    def addVideoComment ( Integer videoId, CommentResource commentResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/comments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    CommentResource.class )
                    
    }
    def addVideoContributor ( Long videoId, ContributionResource contributionResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/contributors"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def addVideoFlag ( Long videoId, String reason, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/moderation"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def addVideoRelationships ( Long videoId, VideoRelationshipResource videoRelationshipResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/related"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    VideoRelationshipResource.class )
                    
    }
    def createVideoDisposition ( Integer videoId, DispositionResource dispositionResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/dispositions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    DispositionResource.class )
                    
    }
    def deleteVideo ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{id}"

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
    def deleteVideoComment ( Long videoId, Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/comments/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteVideoDisposition ( Long dispositionId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/dispositions/{disposition_id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (dispositionId == null) {
            throw new RuntimeException("missing required params dispositionId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteVideoFlag ( Long videoId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/moderation"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def deleteVideoRelationship ( Long videoId, Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/related/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def getUserVideos ( Integer userId, Boolean excludeFlagged, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/users/{user_id}/videos"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }

        if (!"null".equals(String.valueOf(excludeFlagged)))
            queryParams.put("excludeFlagged", String.valueOf(excludeFlagged))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceVideoResource.class )
                    
    }
    def getVideo ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    VideoResource.class )
                    
    }
    def getVideoComments ( Integer videoId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/comments"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceCommentResource.class )
                    
    }
    def getVideoDispositions ( Integer videoId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/dispositions"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceDispositionResource.class )
                    
    }
    def getVideoRelationships ( Long videoId, Integer size, Integer page, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/related"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }

        if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceVideoRelationshipResource.class )
                    
    }
    def getVideos ( Boolean excludeFlagged, String filterVideosByUploader, String filterCategory, String filterTagset, String filterVideosByName, String filterVideosByContributor, String filterVideosByAuthor, Boolean filterHasAuthor, Boolean filterHasUploader, String filterRelatedTo, Boolean filterFriends, String filterDisposition, Integer size, Integer page, String order, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    

        if (!"null".equals(String.valueOf(excludeFlagged)))
            queryParams.put("excludeFlagged", String.valueOf(excludeFlagged))
if (!"null".equals(String.valueOf(filterVideosByUploader)))
            queryParams.put("filterVideosByUploader", String.valueOf(filterVideosByUploader))
if (!"null".equals(String.valueOf(filterCategory)))
            queryParams.put("filterCategory", String.valueOf(filterCategory))
if (!"null".equals(String.valueOf(filterTagset)))
            queryParams.put("filterTagset", String.valueOf(filterTagset))
if (!"null".equals(String.valueOf(filterVideosByName)))
            queryParams.put("filterVideosByName", String.valueOf(filterVideosByName))
if (!"null".equals(String.valueOf(filterVideosByContributor)))
            queryParams.put("filterVideosByContributor", String.valueOf(filterVideosByContributor))
if (!"null".equals(String.valueOf(filterVideosByAuthor)))
            queryParams.put("filterVideosByAuthor", String.valueOf(filterVideosByAuthor))
if (!"null".equals(String.valueOf(filterHasAuthor)))
            queryParams.put("filterHasAuthor", String.valueOf(filterHasAuthor))
if (!"null".equals(String.valueOf(filterHasUploader)))
            queryParams.put("filterHasUploader", String.valueOf(filterHasUploader))
if (!"null".equals(String.valueOf(filterRelatedTo)))
            queryParams.put("filterRelatedTo", String.valueOf(filterRelatedTo))
if (!"null".equals(String.valueOf(filterFriends)))
            queryParams.put("filterFriends", String.valueOf(filterFriends))
if (!"null".equals(String.valueOf(filterDisposition)))
            queryParams.put("filterDisposition", String.valueOf(filterDisposition))
if (!"null".equals(String.valueOf(size)))
            queryParams.put("size", String.valueOf(size))
if (!"null".equals(String.valueOf(page)))
            queryParams.put("page", String.valueOf(page))
if (!"null".equals(String.valueOf(order)))
            queryParams.put("order", String.valueOf(order))


        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PageResourceVideoResource.class )
                    
    }
    def removeUserFromVideoWhitelist ( Long videoId, Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/whitelist/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def removeVideoContributor ( Long videoId, Integer id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/contributors/{id}"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )
                    
    }
    def updateVideo ( Long id, VideoResource videoResource, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{id}"

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
    def updateVideoComment ( Long videoId, Long id, String content, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/comments/{id}/content"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def updateVideoRelationship ( Long videoId, Long relationshipId, String details, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{video_id}/related/{id}/relationship_details"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (videoId == null) {
            throw new RuntimeException("missing required params videoId")
        }
        // verify required params are set
        if (relationshipId == null) {
            throw new RuntimeException("missing required params relationshipId")
        }

        

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )
                    
    }
    def viewVideo ( Long id, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/media/videos/{id}/views"

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
}
