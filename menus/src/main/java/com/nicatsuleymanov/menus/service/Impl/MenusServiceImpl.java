package com.nicatsuleymanov.menus.service.Impl;

import com.nicatsuleymanov.menus.entity.Menus;
import com.nicatsuleymanov.menus.repository.MenusRepository;
import com.nicatsuleymanov.menus.service.IMenusService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MenusServiceImpl implements IMenusService {

    private MenusRepository menusRepository;


    @Override
    public void createMenus(Menus menus) {
        menusRepository.save(menus);
    }

    @Override
    public List<Menus> getAllMenus() {
        return menusRepository.findAll();
    }

    @Override
    public Optional<Menus> getMenusById(Long id) {
        return menusRepository.findById(id);
    }

    @Override
    public void updateMenus(Menus menus) {
        menusRepository.save(menus);
    }

    @Override
    public void deleteMenus(Long id) {
        menusRepository.deleteById(id);
    }
}
