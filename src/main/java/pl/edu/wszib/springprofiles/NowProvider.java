package pl.edu.wszib.springprofiles;

import java.time.ZonedDateTime;

public interface NowProvider {
    ZonedDateTime now();
}
