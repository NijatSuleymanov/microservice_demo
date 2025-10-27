package com.nijatsuleymanov.customers.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customers {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private int id;
      private String name;
      private String surname;
      private String email;
}
