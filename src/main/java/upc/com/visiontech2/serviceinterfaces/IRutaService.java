package upc.com.visiontech2.serviceinterfaces;

import upc.com.visiontech2.entities.Ruta;

import java.util.List;

public interface IRutaService {
    public List<Ruta> list();
    public void insert(Ruta r);
    public Ruta listId(int idRuta);
    public void update(Ruta r);
    public void delete(int idRuta);
    public List<Ruta> buscarPorNombre(String nombre);
}