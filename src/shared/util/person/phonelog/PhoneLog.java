package shared.util.person.phonelog;

/**
 * Phone log pbjwct class
 *
 * @author Kutaiba n Kashmar
 * @version 1.0
 */
public class PhoneLog
{
  public PhonebookPerson person;

  public PhoneLog(PhonebookPerson person)
  {
    this.person = person;
  }

  public PhonebookPerson getPerson()
  {
    return person;
  }
}
