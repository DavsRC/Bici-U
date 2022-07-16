package models.user.gateway;

import models.user.User;

import java.util.List;

public interface UserGateway {

    public List<User> getUsers();
    public User addUser();
}