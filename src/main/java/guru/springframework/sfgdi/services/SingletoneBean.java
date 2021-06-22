package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletoneBean {

    public SingletoneBean(){
        System.out.println("Creating a singleton Bean!!!!");
    }
    public String getMyScope(){
        return "I am Singleton";
    }
}
