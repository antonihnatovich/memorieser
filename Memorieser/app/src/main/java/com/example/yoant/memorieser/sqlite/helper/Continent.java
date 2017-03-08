package com.example.yoant.memorieser.sqlite.helper;

public class Continent {
    private int continentID;
    private String continentImageURL;
    private String continentName;

    public Continent() {
    }

    public Continent(int continentID, String continentImageURL, String continentName) {
        this.continentID = continentID;
        this.continentImageURL = continentImageURL;
        this.continentName = continentName;
    }

    public int getContinentID() {
        return continentID;
    }

    public void setContinentID(int continentID) {
        this.continentID = continentID;
    }

    public String getContinentImageURL() {
        return continentImageURL;
    }

    public void setContinentImageURL(String continentImageURL) {
        this.continentImageURL = continentImageURL;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
}
