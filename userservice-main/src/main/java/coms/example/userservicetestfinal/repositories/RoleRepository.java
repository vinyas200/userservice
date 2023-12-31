package coms.example.userservicetestfinal.repositories;

import coms.example.userservicetestfinal.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {


    List<Role> findAllByIdIn(List<Long> roleIds);
}
