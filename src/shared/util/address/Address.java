package shared.util.address;

/**
 * Address object class
 *
 * @author Kutaiba N kashmar
 * @version 1.0
 * */
public class Address
{
  private final String streetName;
  private final String streetNumber;
  private final String houseNumber;
  private final City city;

  public Address(String streetName, String streetNumber, String houseNumber,
      City city)
  {
    this.streetName = streetName;
    this.streetNumber = streetNumber;
    this.houseNumber = houseNumber;
    this.city = city;
  }

  public String getStreetName()
  {
    return streetName;
  }

  public String getStreetNumber()
  {
    return streetNumber;
  }

  public String getHouseNumber()
  {
    return houseNumber;
  }

  public City getCity()
  {
    return city;
  }
}
