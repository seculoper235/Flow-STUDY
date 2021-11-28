package pubsub;

public class Main {
    public static void main(String[] args) {
        // 발행자 생성
        Publisher1 publisher1 = new Publisher1("퍼블리셔1");
        // 이벤트 채널 생성
        EventChannel eventChannel = new EventChannel();

        // 구독자 등록
        System.out.println("*****************************************************************");
        Subscriber1 subscriber1 = new Subscriber1("옵1", eventChannel);

        // 이벤트 생성
        pubsub.Event event = new Event("이벤트1", "이벤트 1 입니다.");
        System.out.println();

        // 상태 업데이트
        System.out.println("*****************************************************************");
        publisher1.publish(eventChannel, event);

        // 옵저버 제거
        eventChannel.remove(subscriber1);
        System.out.println();

        // 제거 되었는지 확인
        System.out.println("*****************************************************************");
        publisher1.publish(eventChannel, event);
        System.out.println();
    }
}
