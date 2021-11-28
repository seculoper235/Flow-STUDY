package pubsub;

import java.util.ArrayList;
import java.util.List;

public class EventChannel {
    private final List<Subscriber> subscriberList = new ArrayList<>();

    public void register(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void fire(Event event) {
        subscriberList.forEach(
                sub -> sub.notify(event)
        );
    }

    public void remove(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }
}
