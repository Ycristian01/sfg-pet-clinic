package guru.springframework.sfgpetclinic.services.profileServices;

import guru.springframework.sfgpetclinic.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola mundo - ES";
    }
}
