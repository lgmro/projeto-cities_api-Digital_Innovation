package com.github.lgmro.citiesapi.cities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cidades")
public class City {

    @Id
    private Integer id;

    @Column(name = "nome")
    private String name;

    @Column(name = "codigo_ibge")
    private Integer ibge;

    @Column(name = "estado_id")
    private Integer uf;

    @Column(name = "populacao_2010")
    private Integer population;

    @Column(name = "densidade_demo")
    private Double density;

    @Column(name = "gentilico")
    private String gentile;

    @Column
    private Double area;

    public City() {

    }

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

    public Integer getIbge() {
        return ibge;
    }

    public void setIbge(Integer ibge) {
        this.ibge = ibge;
    }

    public Integer getUf() {
        return uf;
    }

    public void setUf(Integer uf) {
        this.uf = uf;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getDensity() {
        return density;
    }

    public void setDensity(Double density) {
        this.density = density;
    }

    public String getGentile() {
        return gentile;
    }

    public void setGentile(String gentile) {
        this.gentile = gentile;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
