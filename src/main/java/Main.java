/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    
      Service s = new Service();
    Scanner scanner = new Scanner(System.in);
    int wybor;
    while(true){
    System.out.println("Wybierz opcję: ");
    System.out.println("1. Dodaj studenta");
    System.out.println("2. Wyświetl studentów");
    System.out.print("3. Wyjście");
    wybor = scanner.nextInt();
    scanner.nextLine();

    switch(wybor)
    {
      case 1:
        
    System.out.println("Podaj imię studenta: ");
    String imie=scanner.nextLine();
    System.out.println("Podaj wiek studenta: ");
    int wiek=scanner.nextInt();
        scanner.nextLine();
    System.out.println("Podaj nazwisko studenta: ");
    String nazwisko=scanner.nextLine();
      
    Student nowystudent = new Student(imie, wiek);
   try{
    s.addStudent(nowystudent);
      }

   catch(IOException e){
  
        }
  break;
      case 2:
        try{
        var students = s.getStudents();
        for(Student current : students)
        {
          System.out.println(current.ToString());
          
        }
        }
        catch(IOException e){
        }
        break;
      case 3:
        System.out.println("Koniec programu");
        return;
        
        
   }   
   
    }
}
}