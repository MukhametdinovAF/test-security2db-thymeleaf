package ru.mukhametdinov.testsecurity2dbthymeleaf.service;

import ru.mukhametdinov.testsecurity2dbthymeleaf.dto.UserDto;
import ru.mukhametdinov.testsecurity2dbthymeleaf.entitiy.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List <UserDto> findAllUsers();
}
