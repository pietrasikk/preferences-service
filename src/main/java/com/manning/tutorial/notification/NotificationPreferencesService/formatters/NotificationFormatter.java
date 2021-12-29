package com.manning.tutorial.notification.NotificationPreferencesService.formatters;

import com.manning.tutorial.notification.NotificationPreferencesService.model.NotificationPreference;
import com.manning.tutorial.notification.NotificationPreferencesService.model.NotificationResponse;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class NotificationFormatter {

    public static NotificationResponse mapResponse(NotificationPreference notificationPreference) {
        if (notificationPreference != null) {
            return new NotificationResponse(
                    "SUCCESS",
                    "Notification Received Successfully",
                    notificationPreference.isSmsPreferenceFlag(),
                    notificationPreference.isEmailPreferenceFlag(),
                    notificationPreference.getEmailAddress(),
                    notificationPreference.getPhoneNumber());
        } else {
            return new NotificationResponse(
                    "ERROR",
                    "Customer does not exist",
                    false,
                    false,
                    null,
                    null);
        }
    }
}
