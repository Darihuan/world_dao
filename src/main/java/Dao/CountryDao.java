package Dao;

import entities.City;
import entities.Country;
import iDao.ICountryDao;

import javax.persistence.EntityManager;
import java.util.List;

public class CountryDao extends Dao<Country, String> implements ICountryDao {
    @Override
    public Country getCountry(String code) {
        return this.find(code);
    }

    @Override
    public List<City> listaCiudades(String pais) {
        EntityManager em = super.getEntityManager();
        List<City> paises = em.createQuery("SELECT c FROM City c WHERE c.countryByCountryCode.name like ?1")
                .setParameter(1, pais)
                .getResultList();
        return paises;
    }

    @Override
    public void updateCountry(Country nuevoCountry) {
        super.update(nuevoCountry);
    }

    @Override
    public void aniadirPais(Country nuevoPais) {
        super.create(nuevoPais);

    }

    @Override
    public void eliminarPais(Country pais) {
        super.delete(pais);

    }

    @Override
    public Country find(String id) {
        EntityManager em = super.getEntityManager();
        Country pais = em.find(Country.class, id);
        return pais;
    }
}
