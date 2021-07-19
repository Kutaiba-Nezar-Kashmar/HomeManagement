package shared.util.person;

/**
 * Person object abstract class
 *
 * @author Kutaiba n kashmar
 * @version 1.0
 * */
public abstract class Person
{
  private final String firstName;
  private final String middleName;
  private final String lastName;
  private final String email;
  private final String phoneNumber;
  private final Address address;
  private final String dob;
  private final String gender;

  public Person(String firstName, String middleName, String lastName,
      String email, String phoneNumber, Address address, String dob,
      String gender)
  {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.address = address;
    this.dob = dob;
    this.gender = gender;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getMiddleName()
  {
    return middleName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getEmail()
  {
    return email;
  }

  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public Address getAddress()
  {
    return address;
  }

  public String getDob()
  {
    return dob;
  }

  public String getGender()
  {
    return gender;
  }
}
