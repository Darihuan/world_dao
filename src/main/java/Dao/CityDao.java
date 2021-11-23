package Dao;

import entities.City;
import iDao.ICityDao;

import javax.persistence.EntityManager;
import java.util.List;

public class CityDao extends Dao<City,Integer> implements ICityDao {
    @Override
    public Boolean existeCiudad(Integer code) {
        EntityManager em = super.getEntityManager();
        List ciudades = em.createQuery("SELECT c FROM City c WHERE c.id = :code")
                .setParameter("code",code)
                .getResultList();

        return ciudades.size() > 0;
    }

    @Override
    public City getCity(Integer code) {
        EntityManager em = super.getEntityManager();

        return this.find(code);
    }

    @Override
    public void updateCity(City nuevaCiudad) {
        super.update(nuevaCiudad);
    }

    @Override
    public void aniadirCiudad(City nuevaCiudad) {
        super.create(nuevaCiudad);

    }

    @Override
    public void eliminarCiudad(City ciudad) {
        super.delete(ciudad);
    }

    @Override
    public City find(Integer id) {
        EntityManager em = super.getEntityManager();
        City ciudad = em.find(City.class,id);
        return ciudad;
    }
}
