package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.ArrayList;
import java.util.List;

public interface RoleService {
    Role findRole(String name);

    List<Role> getAllRoles();

    String[] convertRolesToNames(List<Role> roles);

    List<Role> convertNamesToRoles(String[] names);
}
