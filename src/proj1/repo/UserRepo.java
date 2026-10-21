package proj1.repo;

import proj1.entity.User;

public class UserRepo {

    public User save(User user){
        user.setId(1);
        //save
        return user;
    }

    public User getById(Integer id) {
        return new User();
    }
}
