import Dao.CityDao;
import Dao.CountryDao;
import Dao.CountryLanguageDao;
import entities.City;
import entities.Country;
import entities.Countrylanguage;

import java.util.Collection;

public class App {
    public static void main(String[] args) {
        CityDao cityDao = new CityDao();
        CountryDao countryDao = new CountryDao();
        CountryLanguageDao countryLanguageDao = new CountryLanguageDao();


        //city test
        System.out.println(cityDao.existeCiudad(699));
        System.out.println(cityDao.existeCiudad(18128129));


        City ciudadAd = new City(null, "JurasicPark", "Uno", 40, countryDao.getCountry("AGO"));

        cityDao.aniadirCiudad(ciudadAd);
        Country pais = new Country("ZZZ","mipais","Asia","pacific",10,1986,100,700,650,"Andalucia",null,null,3,"ZZ",countryDao);




        private String headOfState;
        private Integer capital;
        private String code2;
        private Collection<City> citiesByCode;
        private Collection<Countrylanguage> countrylanguagesByCode;



/*        System.out.println("****************************");
        System.out.println(ciudad.getName());

        //country
        System.out.println(countryDao.getCountry("ESP").getName());*/


    }
}
