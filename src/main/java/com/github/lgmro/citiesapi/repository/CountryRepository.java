package com.github.lgmro.citiesapi.repository;

import com.github.lgmro.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
