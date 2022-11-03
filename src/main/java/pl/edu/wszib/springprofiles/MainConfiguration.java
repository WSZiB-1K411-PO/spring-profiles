package pl.edu.wszib.springprofiles;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@Slf4j
@Configuration
public class MainConfiguration {
    @Bean
    @Profile("poland")
    public NowProvider polandNowProvider() {
        return () -> ZonedDateTime.now(ZoneId.of("UTC+1"));
    }

    @Bean
    @Profile("!poland")
    public CommandLineRunner commandLineRunner() {
        return args -> LOGGER.warn("Not Polish Time");
    }

    @Bean
    @Profile("england")
    public NowProvider englandNowProvider() {
        return () -> ZonedDateTime.now(ZoneId.of("UTC"));
    }
}
