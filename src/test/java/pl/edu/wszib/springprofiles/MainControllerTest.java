package pl.edu.wszib.springprofiles;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainControllerTest {
    @Test
    void shouldReturnResponse() {
        //given
        String message = "MESSAGE";
        ZonedDateTime now = ZonedDateTime.now();
        MainController controller = new MainController(message, () -> now);
        MainResponse expected = MainResponse.builder()
                .message(message)
                .timestamp(now)
                .build();

        //when
        MainResponse response = controller.get();

        assertEquals(expected, response);
    }
}