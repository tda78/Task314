package ru.kata.spring.boot_security.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.Collection;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role findRoleByName(String name);

}
