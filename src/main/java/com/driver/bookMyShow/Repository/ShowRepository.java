package com.driver.bookMyShow.Repository;


import com.driver.bookMyShow.Entities.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<ShowEntity,Integer> {

}
