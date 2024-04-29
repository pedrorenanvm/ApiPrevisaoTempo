package com.dev.apiprevisaotempo.repository;

import com.dev.apiprevisaotempo.entity.Forecast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast, Long> {
}
