package test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduleTask {

    @Scheduled(fixedRate = 10000)
    void task() {
        log.info("Execute task at 10s each!");
    }
}
