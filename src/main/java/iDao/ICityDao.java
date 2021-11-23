package iDao;

import entities.City;

public interface ICityDao {
    Boolean existeCiudad(Integer code);

    City getCity(Integer code);

    void updateCity(City nuevaCiudad);

    void aniadirCiudad(City nuevaCiudad);

    void eliminarCiudad(City ciudad);

}
