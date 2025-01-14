
abstract class Notification {
    public abstract void send(String message);
}

class EmailNoti extends Notification {
    public void send(String message) {
        System.out.println("Sending Email Notification" + message);
    }
}

class SMSNoti extends Notification {
    public void send(String message) {
        System.out.println("Sending SMS Notification" + message);
    }
}

class PushNoti extends Notification {
    public void send(String message) {
        System.out.println("Sending Push Notification" + message);
    }
}


class NotiCase {
    public static Notification getNoti(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNoti();
            case "sms":
                return new SMSNoti();
            case "push":
                return new PushNoti();
            default:
            throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}


class NotificationSender {
    private final Notification notification;

    public NotificationSender(Notification notification) {
        this.notification = notification;
    }

    public void sendNotification(String message) {
        notification.send(message);
    }
}


public class NotificationSystem {
    public static void main(String[] args) {
        Notification NewPolicy  = NotiCase.getNoti("email");
        NotificationSender hrSender = new NotificationSender(NewPolicy);
        hrSender.sendNotification("New policy update");

    
        Notification eventReminder = NotiCase.getNoti("sms");
        NotificationSender eventSender = new NotificationSender(eventReminder);
        eventSender.sendNotification("Reminder");

        Notification systemAlert = NotiCase.getNoti("push");
        NotificationSender itSender = new NotificationSender(systemAlert);
        itSender.sendNotification("Scheduled downtime");
    }
}
