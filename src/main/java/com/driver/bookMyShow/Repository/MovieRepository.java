package com.driver.bookMyShow.Repository;


import com.driver.bookMyShow.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
}
