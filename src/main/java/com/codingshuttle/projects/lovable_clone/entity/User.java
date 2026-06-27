package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.security.Timestamp;
import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;
     String email;
     String passwordHash;
     String name;
     String avatarUrl;
     Instant createdAt;
     Instant updatedAt;
     Instant deletedAt;
}

