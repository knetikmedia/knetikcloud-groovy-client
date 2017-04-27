package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import java.util.List;
@Canonical
class ClientResource {

  /* The expiration time of an initial oauth token in seconds */
  Integer accessTokenValiditySeconds = null

  /* The client_id field of the oauth token request */
  String clientKey = null

  /* The oauth grant type as in: password (username/password auth), client_credentials (server-to-server, private clients), refresh_token (to allow clients to refresh their initial token), facebook, google, etc) See documentation for a complete list. use dedicated endpoint PUT /grant-types to edit this list */
  List<String> grantTypes = new ArrayList<String>()

  /* Generated unique ID for the client */
  Integer id = null

  /* Set to true if the client is public i.e the secret key can be secured */
  Boolean isPublic = null

  /* Used to flag system clients that are not meant to be tinkered with */
  Boolean locked = null

  /* The friendly name of the client */
  String name = null

  /* A redirection URL to use when granting access to third-parties (seldomly used) */
  List<String> redirectUris = new ArrayList<String>()

  /* The expiration time of a refresh oauth token in seconds */
  Integer refreshTokenValiditySeconds = null

  /* The client-secret field of the oauth request when creating a private client */
  String secret = null
  

}

