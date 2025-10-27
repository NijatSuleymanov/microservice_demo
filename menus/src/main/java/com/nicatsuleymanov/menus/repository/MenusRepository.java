package com.nicatsuleymanov.menus.repository;

import com.nicatsuleymanov.menus.entity.Menus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenusRepository extends JpaRepository<Menus, Long> {
}
