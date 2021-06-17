package bm.learning.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    public String sayGreeting() {
        return "Hello world from Primary Service service IMPL";
    }
}
