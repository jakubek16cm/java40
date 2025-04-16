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
    system.out.println("Wybierz opcję: ");
    system.out.println("1. Dodaj studenta");
    system.out.println("2. Wyświetl studentów");
    system.out.println("3. Wyjście");
    wybor = scanner.nextInt();
    scanner.nextLine();
    
    System.out.println("Podaj imię studenta: ");
    String imie=scanner.nextLine();
    System.out.println("Podaj wiek studenta: ");
    int wiek=scanner.nextInt();

    Student nowystudent = new Student(imie, wiek);
   try{
    s.addStudent(nowystudent);
   }
   catch(IOException e){
   
   }
    
    
  }
}