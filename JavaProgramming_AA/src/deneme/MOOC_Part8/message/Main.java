package deneme.MOOC_Part8.message;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Message sms = new Message("SMS");
        Message mms = new Message("MMS");

        System.out.println(sms.equals(sms));
        System.out.println(sms.equals(mms));

        ArrayList<Message> messages = new ArrayList<>();
        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(sms)) {
            messages.add(sms);
        }

        if (!messages.contains(new Message("SMS"))) {
            messages.add(sms);
        }

        System.out.println(messages.size());
        System.out.println(messages.contains(sms));
        System.out.println(messages.contains(new Message("SMS")));

        for (Message message : messages) {
            System.out.println(message.getName());
        }

        System.out.println(messages.get(0).equals(messages.get(1)));

    }
}
