package pubsub;

public abstract class Subscriber {
    protected final String name;
    private EventChannel eventChannel;

    public Subscriber(String name, EventChannel eventChannel) {
        this.name = name;
        eventChannel.register(this);
    }

    abstract void notify(Event event);
}
