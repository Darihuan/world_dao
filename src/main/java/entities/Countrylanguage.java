package entities;

import javax.persistence.*;

@Entity
@Table(name = "countrylanguage")
@IdClass(CountrylanguagePK.class)
public class Countrylanguage {
    private String language;
    private String isOfficial;
    private double percentage;
    private Country countryByCountryCode;
    private String countryCode;

    @Id
    @Column(name = "Language", nullable = false, length = 30)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    @Id
    @Column(name = "CountryCode", nullable = false, length = 3)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "IsOfficial", nullable = false)
    public String getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial;
    }

    @Basic
    @Column(name = "Percentage", nullable = false, precision = 1)
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Countrylanguage that = (Countrylanguage) o;

        if (Double.compare(that.percentage, percentage) != 0) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        return isOfficial != null ? isOfficial.equals(that.isOfficial) : that.isOfficial == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = language != null ? language.hashCode() : 0;
        result = 31 * result + (isOfficial != null ? isOfficial.hashCode() : 0);
        temp = Double.doubleToLongBits(percentage);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @ManyToOne(optional = false)
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", nullable = false)
    public Country getCountryByCountryCode() {
        return countryByCountryCode;
    }

    public void setCountryByCountryCode(Country countryByCountryCode) {
        this.countryByCountryCode = countryByCountryCode;
    }


}
