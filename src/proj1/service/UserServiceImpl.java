package proj1.service;

import proj1.dto.UserDto;
import proj1.entity.User;
import proj1.repo.UserRepo;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepo repo = new UserRepo();

    @Override
    public UserDto create(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        User save = repo.save(user);
        //user map to userDto
        return dto;
    }

    @Override
    public UserDto update(Integer id, UserDto dto) {
        User user = repo.getById(id);
        user.setUsername(dto.getUsername());
        user.setPassword(dto.getPassword());
        User save = repo.save(user);
        return dto;
    }

    @Override
    public UserDto getById(Integer id) {
        return null;
    }

    @Override
    public List<UserDto> getList() {
        return List.of();
    }

    @Override
    public void delete(Integer id) {

    }
}
