package com.manning.tutorial.notification.NotificationPreferencesService.config;

import com.manning.tutorial.notification.NotificationPreferencesService.repositories.NotificationRepository;
import com.manning.tutorial.notification.NotificationPreferencesService.services.NotificationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class NotificationConfig {

    @Bean
    NotificationService notificationService(NotificationRepository notificationRepository) {
        return new NotificationService(notificationRepository);
    }
}
