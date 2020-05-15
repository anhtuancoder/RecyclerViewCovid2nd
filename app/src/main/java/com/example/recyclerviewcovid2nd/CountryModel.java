package com.example.recyclerviewcovid2nd;

public class CountryModel {
    private int imgId;
    private String countryName;
    private String status;
    private String cases;
    private String todayCases;

    public CountryModel(int imgId, String countryName, String status, String cases, String todayCases) {
        this.imgId = imgId;
        this.countryName = countryName;
        this.status = status;
        this.cases = cases;
        this.todayCases = todayCases;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public String getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(String todayCases) {
        this.todayCases = todayCases;
    }
}
