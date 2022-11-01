package ru.mukhametdinov.testsecurity2dbthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mukhametdinov.testsecurity2dbthymeleaf.entitiy.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
