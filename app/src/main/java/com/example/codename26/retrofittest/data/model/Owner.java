package com.example.codename26.retrofittest.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("reputation")
    @Expose
    public Integer reputation;
    @SerializedName("user_id")
    @Expose
    public Integer userId;
    @SerializedName("user_type")
    @Expose
    public String userType;
    @SerializedName("profile_image")
    @Expose
    public String profileImage;
    @SerializedName("display_name")
    @Expose
    public String displayName;
    @SerializedName("link")
    @Expose
    public String link;
    @SerializedName("accept_rate")
    @Expose
    public Integer acceptRate;

    public Integer getReputation() {
        return reputation;
    }

    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getAcceptRate() {
        return acceptRate;
    }

    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }
}