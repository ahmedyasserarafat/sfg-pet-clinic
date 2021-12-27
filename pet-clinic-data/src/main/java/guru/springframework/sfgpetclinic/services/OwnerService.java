package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;


/**
 * Created by jt on 7/18/18.
 */

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
