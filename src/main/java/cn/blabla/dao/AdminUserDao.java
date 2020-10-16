package cn.blabla.dao;

import cn.blabla.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserDao extends JpaRepository<AdminUser, Integer> {
    AdminUser findByUsernameAndPassword(String username, String pwd);
}
