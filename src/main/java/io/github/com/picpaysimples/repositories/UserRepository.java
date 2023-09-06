package io.github.com.picpaysimples.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.com.picpaysimples.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByDocument(String document);

    Optional<User> findUserById(Long id);
}
