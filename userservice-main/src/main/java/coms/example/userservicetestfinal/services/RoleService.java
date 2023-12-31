package coms.example.userservicetestfinal.services;

import coms.example.userservicetestfinal.repositories.RoleRepository;
import coms.example.userservicetestfinal.models.Role;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role createRole(String name) {
        Role role = new Role();
        role.setRole(name);

        return roleRepository.save(role);
    }
}
