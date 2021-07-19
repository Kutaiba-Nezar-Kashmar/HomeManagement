package shared.util.person.phonelog;

import shared.util.address.Country;
import shared.util.person.Address;
import shared.util.person.Person;

/**
 * Phonebook person Object class
 *
 * @author Kutaiba N Kashmar
 * @version 1.0
 */
public class PhonebookPerson extends Person
{
  private final Country country;

  public PhonebookPerson(String firstName, String middleName, String lastName,
      String email, String phoneNumber, Address address, String dob,
      String gender, Country country)
  {
    super(firstName, middleName, lastName, email, phoneNumber, address, dob,
        gender);
    this.country = country;
  }

  public Country getCountry()
  {
    return country;
  }
}
