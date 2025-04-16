public class Student {

  private String Name;
  private int Age;
  private String Surname;

  public Student(String name, String surname, int age) {
    Name = name;
    Surname = surname;
    Age = age;
    
  }

  public String GetName() {return Name;}
  public String GetSurname() {return Surname;}
  public int GetAge() {return Age;}
  

  public String ToString() {
    return Name + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1,"Parse Error");
    return new Student(data[0], data [2], Integer.parseInt(data[1]));
  }
}