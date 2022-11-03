package pl.edu.wszib.springprofiles;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.ZonedDateTime;

@Value
@Builder
@AllArgsConstructor(onConstructor = @__(@JsonCreator))
public class MainResponse {
    String message;
    ZonedDateTime timestamp;
}
