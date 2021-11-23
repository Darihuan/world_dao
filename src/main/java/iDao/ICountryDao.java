package iDao;

import entities.City;
import entities.Country;

import java.util.List;

public interface ICountryDao {
    Country getCountry(String code);

    List<City> listaCiudades(String pais);

    void updateCountry(Country nuevoCountry);

    void aniadirPais(Country nuevoPais);

    void eliminarPais(Country pais);

}
