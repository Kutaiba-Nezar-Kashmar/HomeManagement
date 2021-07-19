package shared.util.address;

/**
 * City object class
 *
 * @author Kutaiba N Kashmar
 * @version 1.0
 * */
public class City
{
  private final int zipCode;
  private final String cityName;
  private final Country country;

  public City(int zipCode, String cityName, Country country)
  {
    this.zipCode = zipCode;
    this.cityName = cityName;
    this.country = country;
  }

  public int getZipCode()
  {
    return zipCode;
  }

  public String getCityName()
  {
    return cityName;
  }

  public Country getCountry()
  {
    return country;
  }
}
