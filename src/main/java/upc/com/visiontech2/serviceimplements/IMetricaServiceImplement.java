package upc.com.visiontech2.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.com.visiontech2.entities.Metrica;
import upc.com.visiontech2.repositories.MetricaRepository;
import upc.com.visiontech2.serviceinterfaces.IMetricaService;

import java.util.List;

@Service
public class IMetricaServiceImplement implements IMetricaService {
    @Autowired
    private MetricaRepository mR;


    @Override
    public List<Metrica> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Metrica m) {
        mR.save(m);
    }

    @Override
    public Metrica listId(int idMetrica) {
        return mR.findById(idMetrica).orElse(new Metrica());
    }

    @Override
    public void update(Metrica m) {
        mR.save(m);
    }

    @Override
    public void delete(int idMetrica) {
        mR.deleteById(idMetrica);
    }
}
