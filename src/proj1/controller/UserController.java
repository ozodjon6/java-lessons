package proj1.controller;

import proj1.dto.UserDto;
import proj1.entity.User;
import proj1.service.UserService;
import proj1.service.UserServiceImpl;

import java.util.List;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public UserDto create(UserDto dto) {
      return userService.create(dto);
    }

    public UserDto update(Integer id, UserDto dto) {
        return userService.update(id, dto);
    }

    public UserDto getById(Integer id) {
        return userService.getById(id);
    }

    public List<UserDto> getList() {
        return userService.getList();
    }

    public void delete(Integer id) {
        userService.delete(id);
    }
}
