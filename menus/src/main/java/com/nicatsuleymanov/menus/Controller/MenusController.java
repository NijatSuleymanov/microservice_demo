package com.nicatsuleymanov.menus.Controller;

import com.nicatsuleymanov.menus.entity.Menus;
import com.nicatsuleymanov.menus.service.IMenusService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/menus")
public class MenusController {

    private IMenusService menusService;

    @PostMapping("create")
    public ResponseEntity<String> createMenus(@RequestBody Menus menus) {
        menusService.createMenus(menus);
        return ResponseEntity.ok("Menus created successfully");
    }

    @GetMapping
    public ResponseEntity<List<Menus>> getAllMenus() {
         return ResponseEntity.ok(menusService.getAllMenus());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menus> getMenusById(@PathVariable Long id) {
        return menusService.getMenusById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }

    @PutMapping("/update")
    public ResponseEntity<String> updateMenus(@RequestBody Menus menus) {
        menusService.updateMenus(menus);
        return ResponseEntity.ok("Menus updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMenus(@PathVariable Long id) {
        menusService.deleteMenus(id);
        return ResponseEntity.ok("Menus deleted successfully");
    }
}
