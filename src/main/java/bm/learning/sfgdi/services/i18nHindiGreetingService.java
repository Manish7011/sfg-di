package bm.learning.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"HN","default"})
@Service("i18nGreetingService")
public class i18nHindiGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world from i18nHindiGreetingService";
    }
}
