package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Affiliate;
import io.swagger.model.ArrayList;
import io.swagger.model.Country;
import io.swagger.model.Currency;
import io.swagger.model.GroupMember;
import io.swagger.model.HashMap;
import io.swagger.model.Language;
import io.swagger.model.Map;
import io.swagger.model.Property;
import io.swagger.model.Role;
import io.swagger.model.Timezone;
import io.swagger.model.UserRelationship;
import io.swagger.model.UserTag;
import java.util.List;
@Canonical
class User {

    Map<String, Property> additionalProperties = new HashMap<String, Property>()

    String address = null

    String address2 = null

    Affiliate affiliate = null

    String avatarUrl = null

    List<UserRelationship> children = new ArrayList<UserRelationship>()

    String city = null

    Country country = null

    Currency currency = null

    Long dateCreated = null

    Long dateOfBirth = null

    Long dateUpdated = null

    String description = null

    String displayName = null

    String email = null

    String firstName = null

    String fullname = null

    String gender = null

    List<GroupMember> groups = new ArrayList<GroupMember>()

    Boolean guest = null

    Integer id = null

    String inviteToken = null

    Language lang = null

    Long lastActivity = null

    Long lastLogin = null

    String lastName = null

    Integer lockoutAttempts = null

    Long lockoutDate = null

    String mobileNumber = null

    Integer oldId = null

    List<UserRelationship> parents = new ArrayList<UserRelationship>()

    String password = null

    String postalCode = null

    String propertiesString = null

    List<Role> roles = new ArrayList<Role>()

    String state = null

    String status = null

    List<String> tagStrings = new ArrayList<String>()

    List<UserTag> tags = new ArrayList<UserTag>()

    String template = null

    Timezone timezone = null

    String token = null

    String typeHint = null

    String username = null
  

}

