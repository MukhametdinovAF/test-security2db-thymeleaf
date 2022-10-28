package ru.mukhametdinov.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mukhametdinov.testsecurity2dbthymeleaf.entitiy.User;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
