package guru.springframework.sfgpetclinic.services.petTypesServices;

import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("dogs")
@Service("petService")
public class DogPetService implements PetService {

    @Override
    public String getPetType() {
        return "Dogs Are the Best!";
    }
}
