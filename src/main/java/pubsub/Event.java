package pubsub;

import lombok.Getter;

@Getter
public record Event(String name, String description) {
}
