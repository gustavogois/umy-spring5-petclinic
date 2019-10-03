package gois.study.umyspring5petclinic.services;

import gois.study.umyspring5petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
