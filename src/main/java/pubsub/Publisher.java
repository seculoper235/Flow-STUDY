package pubsub;

public interface Publisher {
    void publish(EventChannel eventChannel, Event event);
}
