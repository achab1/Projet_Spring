package sn.esmt.admin_.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.admin_.entities.AppRoleEntity;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRoleEntity, Integer> {

    AppRoleEntity findById(int id);
}
