package com.driver.bookMyShow.convertors;


import com.driver.bookMyShow.Entities.ShowEntity;
import com.driver.bookMyShow.EntryDtos.ShowEntryDto;

public class Showconvertors {


    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                                .build();

        return showEntity;
    }
}
