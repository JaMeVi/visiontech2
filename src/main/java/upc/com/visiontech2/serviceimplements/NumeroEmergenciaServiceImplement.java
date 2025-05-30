package upc.com.visiontech2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.com.visiontech2.entities.NumeroEmergencia;
import upc.com.visiontech2.repositories.NumeroEmergenciaRepository;
import upc.com.visiontech2.serviceinterfaces.INumeroEmergenciaService;

import java.util.List;

@Service
public class NumeroEmergenciaServiceImplement implements INumeroEmergenciaService {
    @Autowired
    private NumeroEmergenciaRepository nR;

    @Override
    public List<NumeroEmergencia> list() {
        return nR.findAll();
    }

    @Override
    public void insert(NumeroEmergencia n) {
        nR.save(n);
    }

    @Override
    public NumeroEmergencia listId(int idNumeroEmergencia) {
        return nR.findById(idNumeroEmergencia).orElse(new NumeroEmergencia());
    }


    @Override
    public void update(NumeroEmergencia n) {
        nR.save(n);
    }

    @Override
    public void delete(int idNumeroEmergencia) {
        nR.deleteById(idNumeroEmergencia);
    }
}
