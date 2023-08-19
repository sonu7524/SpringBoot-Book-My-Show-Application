package com.driver.bookMyShow.Services;



import com.driver.bookMyShow.Entities.UserEntity;
import com.driver.bookMyShow.EntryDtos.UserEntryDto;
import com.driver.bookMyShow.Repository.UserRepository;
import com.driver.bookMyShow.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto){

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        if(userEntity.getMobNo().length() != 10){
            return "mobile no. is not correct";
        }


        userRepository.save(userEntity);

        return "User Added successfully";

    }



}
