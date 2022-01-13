package observer;

import lombok.Getter;

@Getter
public record Event(String name, int price, String description) {
    // Git 테스트
}
