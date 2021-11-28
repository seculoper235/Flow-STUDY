package pubsub;

public class Publisher1 implements Publisher {
    private final String name;
    private EventChannel eventChannel;

    public Publisher1(String name) {
        this.name = name;
        // 의존한다면 주입해주는 것이 맞고, 아니라면... 어떻게 하지...??
        // 일단 의존하지 않는다는 가정 하에 publish() 메소드를 작성한다
    }

    @Override
    public void publish(EventChannel eventChannel, Event event) {
        // Publisher는 Event Channel에 의존하는지, 아닌지?
        eventChannel.fire(event);
    }
}
