package gois.study.umyspring5petclinic.controllers;

import gois.study.umyspring5petclinic.model.Owner;
import gois.study.umyspring5petclinic.model.PetType;
import gois.study.umyspring5petclinic.repositories.OwnerRepository;
import gois.study.umyspring5petclinic.services.PetService;
import gois.study.umyspring5petclinic.services.PetTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.Optional;

@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {

    private static final String VIEWS_PETS_CREATE_OR_UPDATE_FORM = "pets/createOrUpdatePetForm";
    private final PetService petService;
    private final PetTypeService petTypeService;
    private final OwnerRepository owners;

    public PetController(PetService petService, PetTypeService petTypeService, OwnerRepository owners) {
        this.petService = petService;
        this.petTypeService = petTypeService;
        this.owners = owners;
    }

    @ModelAttribute("types")
    public Collection<PetType> populatePetTypes() {
        return petTypeService.findAll();
    }

    @ModelAttribute("owner")
    public Optional<Owner> findOwner(@PathVariable Long ownerId) {
        return this.owners.findById(ownerId);
    }

    @InitBinder("owner")
    public void initOwnerBinder(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
