package com.mastertech.user.model;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String district;

    @Column
    private String cep;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
