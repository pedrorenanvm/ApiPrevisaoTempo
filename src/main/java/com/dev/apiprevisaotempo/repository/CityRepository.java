package com.dev.apiprevisaotempo.repository;

import com.dev.apiprevisaotempo.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByNome(String name);
}
