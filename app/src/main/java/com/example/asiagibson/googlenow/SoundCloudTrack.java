package com.example.asiagibson.googlenow;

public class SoundCloudTrack {

    private String title;
    private String artwork_url;
    private User user;
    private String permalink_url;

    public String getPermalinkUrl() {
        return permalink_url;
    }

    public void setPermalinkUrl(String permalink_url) {
        this.permalink_url = permalink_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
