package database.phonebookperson;

import shared.util.address.Country;
import shared.util.person.Address;
import shared.util.person.phonelog.PhonebookPerson;

import java.sql.SQLException;

/**
 * Phonebook person data access object
 *
 * @author Kutaiba N Kashmar
 * @version 1.0
 */
public interface PhonebookPersonDAO
{
  /**
   * Creates a new phonebook person entry
   *
   * @param firstName   The person's first name
   * @param middleName  The person's middle name (optional)
   * @param lastName    The person's last name
   * @param phoneNumber The person's phone number
   * @param email       The person's email address
   * @param country     The person's country
   * @param dob         The person's date of berth
   * @param gender      The person's gender
   * @return a ne PhonebookPerson object
   * @throws SQLException f the given parameters violates the constraints, or object type in the database
   *                      the exception is thrown also if the connection to the database is not established
   */
  PhonebookPerson createPerson(String firstName, String middleName,
      String lastName, String phoneNumber, String email, Address address,
      Country country, String dob, String gender) throws SQLException;
}
