package upc.com.visiontech2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.com.visiontech2.entities.CondicionAtmosferica;
import upc.com.visiontech2.repositories.CondicionAtmosfericaRepository;
import upc.com.visiontech2.serviceinterfaces.ICondicionAtmosfericaService;

import java.util.List;

@Service
public class CondicionAtmosfericaServiceImplement implements ICondicionAtmosfericaService {
    @Autowired
    private CondicionAtmosfericaRepository cR;

    @Override
    public List<CondicionAtmosferica> list() {return cR.findAll();}

    @Override
    public void insert(CondicionAtmosferica ca) {cR.save(ca);}

    @Override
    public CondicionAtmosferica listId(int idCondicionAtmosferica) {return cR.findById(idCondicionAtmosferica).orElse(new CondicionAtmosferica());}

    @Override
    public void update(CondicionAtmosferica ca) {cR.save(ca);}

    @Override
    public void delete(int idCondicionAtmosferica) {cR.deleteById(idCondicionAtmosferica);}
}
