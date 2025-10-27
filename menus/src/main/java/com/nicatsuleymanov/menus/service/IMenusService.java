package com.nicatsuleymanov.menus.service;

import com.nicatsuleymanov.menus.entity.Menus;

import java.util.List;
import java.util.Optional;

public interface IMenusService {

    void createMenus(Menus menus);

    List<Menus> getAllMenus();

    Optional<Menus> getMenusById(Long id);

    void updateMenus(Menus menus);

    void deleteMenus(Long id);
}

