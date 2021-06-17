package bm.learning.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class i18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world from i18nEnglishGreetingService";
    }
}
