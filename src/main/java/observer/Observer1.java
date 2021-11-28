package observer;

import lombok.Getter;

@Getter
public class Observer1 implements Observer {
    private final String name;
    private Subject subject;

    public Observer1(String name, Subject subject) {
        this.name = name;
        subject.register(this);
    }

    @Override
    public void notify(Event event) {
        System.out.println("옵저버 이름 = " + this.name);
        System.out.println("event = " + event.name());
        System.out.println("변경된 가격 = " + event.description());
    }
}
