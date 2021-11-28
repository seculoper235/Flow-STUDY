package observer;

public class Main {
    public static void main(String[] args) {
        // 서브젝트 생성
        Subject1 subject1 = new Subject1();

        // 옵저버 등록
        System.out.println("*****************************************************************");
        Observer1 observer1 = new Observer1("옵1", subject1);
        Observer2 observer2 = new Observer2("옵2", subject1);

        // 이벤트 생성
        Event event = new Event("이벤트1", 100000, "가격을 변경합니다.");
        System.out.println();

        // 상태 업데이트
        System.out.println("*****************************************************************");
        subject1.setEvent(event);

        // 옵저버 제거
        subject1.remove(observer1);
        System.out.println();

        // 제거 되었는지 확인
        System.out.println("*****************************************************************");
        subject1.setEvent(event);
        System.out.println();
    }
}
