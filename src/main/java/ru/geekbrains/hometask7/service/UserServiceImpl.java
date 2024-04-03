package ru.geekbrains.hometask7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.geekbrains.hometask7.entity.UserEntity;
import ru.geekbrains.hometask7.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Optional<UserEntity> getUserByLogin(String login) {
        return Optional.ofNullable(userRepository.findByLogin(login).orElse(null));
    }

    @Override
    public List<UserEntity> getAllUsers() {
        List<UserEntity> dbUsers = userRepository.findAll();
        return new ResponseEntity<>(dbUsers, HttpStatus.OK).getBody();
    }
}
