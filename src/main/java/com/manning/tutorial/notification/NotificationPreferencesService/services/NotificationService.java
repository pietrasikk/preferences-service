package com.manning.tutorial.notification.NotificationPreferencesService.services;

import com.manning.tutorial.notification.NotificationPreferencesService.entities.NotificationPreferenceEntity;
import com.manning.tutorial.notification.NotificationPreferencesService.model.NotificationPreference;
import com.manning.tutorial.notification.NotificationPreferencesService.repositories.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public NotificationPreference getNotificationPreferences(String customerId) {
        logger.info("In the Notification Preferences API Class");
        return notificationRepository.findByCustomerId(customerId)
                .map(this::map)
                .orElse(null);
    }

    private NotificationPreference map(NotificationPreferenceEntity notificationPreferenceEntity) {
        return NotificationPreference.builder()
                .id(notificationPreferenceEntity.getId())
                .customerId(notificationPreferenceEntity.getCustomerId())
                .emailPreferenceFlag(notificationPreferenceEntity.isEmailPreferenceFlag())
                .smsPreferenceFlag(notificationPreferenceEntity.isSmsPreferenceFlag())
                .phoneNumber(notificationPreferenceEntity.getPhoneNumber())
                .emailAddress(notificationPreferenceEntity.getEmailAddress())
                .build();
    }
}
