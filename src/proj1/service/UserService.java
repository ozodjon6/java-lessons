package proj1.service;

import proj1.dto.UserDto;

import java.util.List;

//Crud
public interface UserService {

    UserDto create(UserDto dto);

    UserDto update(Integer id, UserDto dto);

    UserDto getById(Integer id);

    List<UserDto> getList();

    void delete(Integer id);
}
