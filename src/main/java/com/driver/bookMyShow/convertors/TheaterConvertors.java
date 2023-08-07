package com.driver.bookMyShow.convertors;


import com.driver.bookMyShow.Entities.TheaterEntity;
import com.driver.bookMyShow.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {


    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }

}
