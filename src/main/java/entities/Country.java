package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "country")
public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;
    private double surfaceArea;
    private Short indepYear;
    private int population;
    private Double lifeExpectancy;
    private Double gnp;
    private Double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private Integer capital;
    private String code2;
    private Collection<City> citiesByCode;
    private Collection<Countrylanguage> countrylanguagesByCode;

    @Id
    @Column(name = "Code", nullable = false, length = 3)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "Name", nullable = false, length = 52)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Continent", nullable = false)
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Basic
    @Column(name = "Region", nullable = false, length = 26)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "SurfaceArea", nullable = false, precision = 2)
    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    @Basic
    @Column(name = "IndepYear", nullable = true)
    public Short getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Short indepYear) {
        this.indepYear = indepYear;
    }

    @Basic
    @Column(name = "Population", nullable = false)
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Basic
    @Column(name = "LifeExpectancy", nullable = true, precision = 1)
    public Double getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    @Basic
    @Column(name = "GNP", nullable = true, precision = 2)
    public Double getGnp() {
        return gnp;
    }

    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }

    @Basic
    @Column(name = "GNPOld", nullable = true, precision = 2)
    public Double getGnpOld() {
        return gnpOld;
    }

    public void setGnpOld(Double gnpOld) {
        this.gnpOld = gnpOld;
    }

    @Basic
    @Column(name = "LocalName", nullable = false, length = 45)
    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    @Basic
    @Column(name = "GovernmentForm", nullable = false, length = 45)
    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    @Basic
    @Column(name = "HeadOfState", nullable = true, length = 60)
    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    @Basic
    @Column(name = "Capital", nullable = true)
    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Basic
    @Column(name = "Code2", nullable = false, length = 2)
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (Double.compare(country.surfaceArea, surfaceArea) != 0) return false;
        if (population != country.population) return false;
        if (code != null ? !code.equals(country.code) : country.code != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (continent != null ? !continent.equals(country.continent) : country.continent != null) return false;
        if (region != null ? !region.equals(country.region) : country.region != null) return false;
        if (indepYear != null ? !indepYear.equals(country.indepYear) : country.indepYear != null) return false;
        if (lifeExpectancy != null ? !lifeExpectancy.equals(country.lifeExpectancy) : country.lifeExpectancy != null)
            return false;
        if (gnp != null ? !gnp.equals(country.gnp) : country.gnp != null) return false;
        if (gnpOld != null ? !gnpOld.equals(country.gnpOld) : country.gnpOld != null) return false;
        if (localName != null ? !localName.equals(country.localName) : country.localName != null) return false;
        if (governmentForm != null ? !governmentForm.equals(country.governmentForm) : country.governmentForm != null)
            return false;
        if (headOfState != null ? !headOfState.equals(country.headOfState) : country.headOfState != null) return false;
        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;
        if (code2 != null ? !code2.equals(country.code2) : country.code2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (continent != null ? continent.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        temp = Double.doubleToLongBits(surfaceArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (indepYear != null ? indepYear.hashCode() : 0);
        result = 31 * result + population;
        result = 31 * result + (lifeExpectancy != null ? lifeExpectancy.hashCode() : 0);
        result = 31 * result + (gnp != null ? gnp.hashCode() : 0);
        result = 31 * result + (gnpOld != null ? gnpOld.hashCode() : 0);
        result = 31 * result + (localName != null ? localName.hashCode() : 0);
        result = 31 * result + (governmentForm != null ? governmentForm.hashCode() : 0);
        result = 31 * result + (headOfState != null ? headOfState.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "countryByCountryCode",cascade = CascadeType.ALL)
    public Collection<City> getCitiesByCode() {
        return citiesByCode;
    }

    public void setCitiesByCode(Collection<City> citiesByCode) {
        this.citiesByCode = citiesByCode;
    }

    @OneToMany(mappedBy = "countryByCountryCode")
    public Collection<Countrylanguage> getCountrylanguagesByCode() {
        return countrylanguagesByCode;
    }

    public void setCountrylanguagesByCode(Collection<Countrylanguage> countrylanguagesByCode) {
        this.countrylanguagesByCode = countrylanguagesByCode;
    }
}
