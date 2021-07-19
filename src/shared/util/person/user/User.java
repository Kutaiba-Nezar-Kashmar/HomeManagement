package shared.util.person.user;

import shared.util.person.Address;
import shared.util.person.Person;
import shared.util.person.phonelog.PhoneLog;

/**
 * User Object class
 *
 * @author Kutaiba N Kashmar
 * @version 1.0
 */
public class User extends Person
{
  private final String cprNumberFirst;
  private final String cprNumberSecond;
  private final String socialStatus;
  private final Note note;
  private final PhoneLog phoneLog;
  private final Image image;

  public User(String firstName, String middleName, String lastName,
      String email, String phoneNumber, Address address, String dob,
      String gender, String cprNumberFirst, String cprNumberSecond, String socialStatus, Note note, PhoneLog phoneLog, Image image)
  {
    super(firstName, middleName, lastName, email, phoneNumber, address, dob,
        gender);
    this.cprNumberFirst = cprNumberFirst;
    this.cprNumberSecond = cprNumberSecond;
    this.socialStatus = socialStatus;
    this.note = note;
    this.phoneLog = phoneLog;
    this.image = image;
  }

  public String getCprNumberFirst()
  {
    return cprNumberFirst;
  }

  public String getCprNumberSecond()
  {
    return cprNumberSecond;
  }

  public String getSocialStatus()
  {
    return socialStatus;
  }

  public Note getNote()
  {
    return note;
  }

  public PhoneLog getPhoneLog()
  {
    return phoneLog;
  }

  public Image getImage()
  {
    return image;
  }
}
