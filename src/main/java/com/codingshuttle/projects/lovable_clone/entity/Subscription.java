package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    User user;
    Plan plan;
    String status;
    String stripecustomerId;
    String  stripeSubscriptionId;
    Instant currentPeriodStart;
    Boolean cancelAtPeriodEnd;
    Instant createdAt;
    Instant updatedAt;

}
