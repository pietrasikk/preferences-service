package com.manning.tutorial.notification.NotificationPreferencesService.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class NotificationPreference {
    private final int id;
    private final String customerId;
    private final boolean smsPreferenceFlag;
    private final boolean emailPreferenceFlag;
    private final String phoneNumber;
    private final String emailAddress;
}
