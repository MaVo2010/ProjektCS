package de.htwberlin.webtech.ProjektCS.service;

import de.htwberlin.webtech.ProjektCS.persistence.UserEntity;
import de.htwberlin.webtech.ProjektCS.persistence.UserRepository;
import de.htwberlin.webtech.ProjektCS.web.api.User;
import de.htwberlin.webtech.ProjektCS.web.api.UserManipulationRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        List<UserEntity> users = userRepository.findAll();
        return users.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public User findById(Long id) {
        var userEntity = userRepository.findById(id);
        return userEntity.map(this::transformEntity).orElse(null);
    }

    public User create(UserManipulationRequest request) {
        var userEntity = new UserEntity(request.getUserName(), request.getUserBalance(), request.isValidated());
        userEntity = userRepository.save(userEntity);
        return transformEntity(userEntity);
    }

    public User update(Long id, UserManipulationRequest request) {
        var userEntityOptional = userRepository.findById(id);
        if (userEntityOptional.isEmpty()) {
        return null;
        }

        var userEntity = userEntityOptional.get();
        userEntity.setUserName(request.getUserName());
        userEntity.setUserBalance(request.getUserBalance());
        userEntity.setValidated(request.isValidated());
        userEntity = userRepository.save(userEntity);

        return transformEntity(userEntity);
    }

    public boolean deleteById(Long id) {
        if (!userRepository.existsById(id)) {
            return false;
        }

        userRepository.deleteById(id);
        return true;
    }

    private User transformEntity(UserEntity userEntity) {
        return new User(
                userEntity.getId(),
                userEntity.getUserName(),
                userEntity.getUserBalance(),
                userEntity.getValidated()
        );

    }
}
