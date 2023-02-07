package guru.springframework.sfgpetclinic.services.injectionServices;

import guru.springframework.sfgpetclinic.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting()  {
        return "Hello world - Constructor";
    }
}
