package pubsub;

public class Subscriber1 extends Subscriber {
    /* 필드 설정 */

    public Subscriber1(String name, EventChannel eventChannel) {
        super(name, eventChannel);
    }

    @Override
    public void notify(Event event) {
        System.out.println("구독자 이름 = " + super.name);
        System.out.println("event = " + event.name());
        System.out.println("변경된 설명 = " + event.description());
    }
}
