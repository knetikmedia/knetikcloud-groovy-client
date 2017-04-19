package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.HashMap;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.UserRelationshipReferenceResource;
import java.util.List;
@Canonical
class UserResource {

  /* A map of additional properties, keyed on the property name (private). Must match the names and types defined in the template for this user type, or be an extra not from the template */
  Map<String, Property> additionalProperties = new HashMap<String, Property>()

  /* The first line of the user's address (private) */
  String address = null

  /* The second line of user's address (private) */
  String address2 = null

  /* The url of the user's avatar image */
  String avatarUrl = null

  /* Relationships where this user is the parent. Read-Only, manage through separate endpoints */
  List<UserRelationshipReferenceResource> children = new ArrayList<UserRelationshipReferenceResource>()

  /* The user's city (private) */
  String city = null

  /* The ISO3 code for the country from the user's address (private). Will be filled in based on GeoIP country at registration if not provided. */
  String countryCode = null

  /* The code for the user's real money currency (private) */
  String currencyCode = null

  /* The user's date of birth (private) as a unix timestamp */
  Long dateOfBirth = null

  /* The user's self description (private) */
  String description = null

  /* The chosen display name of the user, defaults to username if not present */
  String displayName = null

  /* The user's email address (private). May be required and/or unique depending on system configuration (both on by default). Must match standard email requirements if provided (RFC 2822) */
  String email = null

  /* The user's first name (private) */
  String firstName = null

  /* The user's full name (private) */
  String fullname = null

  /* The user's gender (private) */
  String gender = null

  /* The id of the user */
  Integer id = null

  /* The ISO3 code for the user's currency (private) */
  String languageCode = null

  /* The user's last name (private) */
  String lastName = null

  /* The date the user's info was last updated as a unix timestamp */
  Long lastUpdated = null

  /* The user's date of registration as a unix timestamp */
  Long memberSince = null

  /* The user's mobile phone number (private) */
  String mobileNumber = null

  /* Relationships where this user is the child. Read-Only, manage through separate endpoints */
  List<UserRelationshipReferenceResource> parents = new ArrayList<UserRelationshipReferenceResource>()

  /* The plain text password for the new user account. Required for registration; ignored on profile update.  Use password specific endpoints for editing */
  String password = null

  /* The user's postal code (private) */
  String postalCode = null

  /* The user's state (private) */
  String state = null

  /* Tags on the user. Can only be set by admin. Max length per tag is 64 characters */
  List<String> tags = new ArrayList<String>()

  /* A user template this user is validated against (private). May be null and no validation of properties will be done */
  String template = null

  /* The code for the user's timezone (private) */
  String timezoneCode = null

  /* The login username for the user (private). May be set to match email if system does not require usernames separately. */
  String username = null
  

}

