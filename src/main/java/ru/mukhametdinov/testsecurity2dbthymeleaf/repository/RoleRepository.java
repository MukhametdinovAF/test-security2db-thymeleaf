package ru.mukhametdinov.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mukhametdinov.testsecurity2dbthymeleaf.entitiy.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName (String name);
}
