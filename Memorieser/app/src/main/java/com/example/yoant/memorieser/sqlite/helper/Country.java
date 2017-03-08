package com.example.yoant.memorieser.sqlite.helper;

public class Country {
    private String name;
    private String review;
    private String flagURL;
    private String[] imagesURL;
    private int id, continentNumber;

    public Country() {
    }

    public Country(int id, String name, String flagURL, int continentNumber) {
        this.id = id;
        this.name = name;
        this.flagURL = flagURL;
        this.continentNumber = continentNumber;
    }

    public Country(int id, String name, String review, String flagURL, int continentNumber) {
        this.id = id;
        this.name = name;
        this.flagURL = flagURL;
        this.continentNumber = continentNumber;
        this.review = review;
    }

    public Country(int id, String name, String review, String flagURL, String[] imagesURL, int continentNumber) {
        this.id = id;
        this.name = name;
        this.flagURL = flagURL;
        this.continentNumber = continentNumber;
        this.review = review;
        this.imagesURL = imagesURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getFlagURL() {
        return flagURL;
    }

    public void setFlagURL(String flagURL) {
        this.flagURL = flagURL;
    }

    public String[] getImagesURL() {
        return imagesURL;
    }

    public void setImagesURL(String[] imagesURL) {
        this.imagesURL = imagesURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContinentNumber() {
        return continentNumber;
    }

    public void setContinentNumber(int continentNumber) {
        this.continentNumber = continentNumber;
    }
}
