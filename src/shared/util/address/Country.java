package shared.util.address;

/**
 * Country object class
 *
 * @author Kutaiba n Kashmar
 * @version 1.0
 */
public class Country
{
  private final String countryName;
  private final String alphaCode;
  private final String numericCode;

  public Country(String name, String alphaCode, String numericCode)
  {
    this.countryName = name;
    this.alphaCode = alphaCode;
    this.numericCode = numericCode;
  }

  public String getCountryName()
  {
    return countryName;
  }

  public String getAlphaCode()
  {
    return alphaCode;
  }

  public String getNumericCode()
  {
    return numericCode;
  }
}
