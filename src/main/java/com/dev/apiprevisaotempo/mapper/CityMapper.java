package com.dev.apiprevisaotempo.mapper;

import com.dev.apiprevisaotempo.dto.response.CityResponse;
import com.dev.apiprevisaotempo.entity.City;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityResponse toCityResponse(City city);

}
