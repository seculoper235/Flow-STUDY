package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject1 implements Subject {
    // 관리하는 Observer 리스트
    private final List<Observer> observerList = new ArrayList<>();

    // 변화하는 대상인 이벤트 데이터
    private Event event;

    public void register(Observer observer) {
        observerList.add(observer);
        System.out.println(observer.toString()+ " 추가!");
    }

    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    public void fire() {
        observerList.forEach(
                observer -> observer.notify(event)
        );
    }

    public void setEvent(Event event) {
        this.event = event;
        fire();
    }
}
