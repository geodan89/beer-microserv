package com.beerproject.beermicroserv.web.mapper;

import com.beerproject.beermicroserv.domain.Beer;
import com.beerproject.beermicroserv.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
