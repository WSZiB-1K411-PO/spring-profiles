package pl.edu.wszib.springprofiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
public class MainController {
    private final String message;
    private final NowProvider nowProvider;

    public MainController(@Value("${message}") String message, NowProvider nowProvider) {
        this.message = message;
        this.nowProvider = nowProvider;
    }

    @GetMapping
    public MainResponse get() {
        return MainResponse.builder()
                .message(message)
                .timestamp(nowProvider.now())
                .build();
    }
}
