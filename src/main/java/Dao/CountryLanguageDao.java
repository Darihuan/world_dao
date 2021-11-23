package Dao;

import entities.Countrylanguage;
import entities.CountrylanguagePK;
import iDao.ICountryLanguageDao;

import javax.persistence.EntityManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountryLanguageDao extends Dao<Countrylanguage, CountrylanguagePK> implements ICountryLanguageDao {
    @Override
    public List<Countrylanguage> getAllLanguages() {
        EntityManager em = super.getEntityManager();
        List<Countrylanguage> idiomas = em.createQuery("SELECT c FROM Countrylanguage  c ")
                .getResultList();
        return idiomas;
    }

    @Override
    public Set<Countrylanguage> listaIdiomas(String pais) {
        EntityManager em = super.getEntityManager();
        Set<Countrylanguage> idiomas = new HashSet<>();
        em.createQuery("SELECT c FROM Countrylanguage  c where c.countryByCountryCode.name like ?1 ")
                .setParameter(1, pais)
                .getResultList().forEach(elemento -> idiomas.add((Countrylanguage) elemento));

        return idiomas;
    }


    @Override
    public Countrylanguage find(CountrylanguagePK id) {
        EntityManager em = super.getEntityManager();
        Countrylanguage idioma = em.find(Countrylanguage.class, id);
        return idioma;

    }
}
