package iDao;

import entities.Countrylanguage;

import java.util.List;
import java.util.Set;

public interface ICountryLanguageDao {
    List<Countrylanguage> getAllLanguages();

    Set<Countrylanguage> listaIdiomas(String pais);
}
