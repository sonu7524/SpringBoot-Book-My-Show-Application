package com.driver.bookMyShow.Services;



import com.driver.bookMyShow.Entities.MovieEntity;
import com.driver.bookMyShow.EntryDtos.MovieEntryDto;
import com.driver.bookMyShow.Repository.MovieRepository;
import com.driver.bookMyShow.convertors.MovieConvertors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieEntryDto movieEntryDto)throws Exception{


        MovieEntity movieEntity = MovieConvertors.convertEntryDtoToEntity(movieEntryDto);

        movieRepository.save(movieEntity);

        return "Movie Added successfully";


    }

    public List<String> getMovie() {
        List<String> movieList = new ArrayList<>();
        List<MovieEntity> movieEntityList = movieRepository.findAll();
        for(int i=0; i<movieEntityList.size(); i++){
            movieList.add(movieEntityList.get(i).getMovieName());
        }

        return movieList;
    }
}
