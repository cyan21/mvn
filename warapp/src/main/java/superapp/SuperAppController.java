package superapp;

import org.ych.Human;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperAppController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getmsg")
    public String appSaid() {
        return Human.says();
    }
}
