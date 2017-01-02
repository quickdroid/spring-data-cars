package com.cars.mike.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Location extends BaseModel {

    private String state;
    private String country;
    private String postCode;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private List<Brand> brandList = new ArrayList<>();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public List<Brand> getBrandList() {
        return brandList;
    }

    public void setBrandList(List<Brand> brandList) {
        this.brandList = brandList;
    }
}
