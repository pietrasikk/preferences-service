package com.manning.tutorial.notification.NotificationPreferencesService.repositories;

import com.manning.tutorial.notification.NotificationPreferencesService.entities.NotificationPreferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationPreferenceEntity, Integer> {

    Optional<NotificationPreferenceEntity> findByCustomerId(String customerId);
}
