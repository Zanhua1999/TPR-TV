package com.company;
import java.util.Scanner;

public class Main {

  // ATTRIBUTEN
static Scanner scanner = new Scanner(System.in);

  //METHODES

  public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
Television myFirstTelevision = new Television();

while (true) {
  System.out.println("1.ON\n" +
"2. OFF\n" +
"3. CHANNEL UP\n" +
"4. CHANNEL DOWN\n" +
"5. VOLUME UP\n" +
"6. VOLUME DOWN\n" +
 "7. SET CHANNEL\n" +
 "8. SET VOLUME LEVEL\n" +
"9. EXIT\n");
System.out.println("Maak uw keuze: ");

int userChoice = scanner.nextInt();

switch (userChoice) {
  case 1: myFirstTelevision.turnOn(); break;
  case 2: myFirstTelevision.turnOff(); break;
  case 3: myFirstTelevision.channelUp(); break;
  case 4: myFirstTelevision.channelDown(); break;
  case 5: myFirstTelevision.volumeUp(); break;
  case 6: myFirstTelevision.volumeDown(); break;
  case 7: int choice = getNewChannel(); myFirstTelevision.setChannel(choice); break;
  case 8:int choice2 = getNewVolumeLevel(); myFirstTelevision.setVolume(choice2); break;
  case 9: System.exit(0);
  default:
  System.out.println("Sorry, die keuze staat niet in het menu.");
}

}

  }

  public static int getNewChannel(){
  System.out.print("Op welke kanaal wilt u de TV zetten? ");
  int choice = scanner.nextInt();
  return choice;
  }

  public static int getNewVolumeLevel() {
    System.out.print("Op welke vlume wilt u de TC zetten?");
    int choice2 = scanner.nextInt();
    return choice2;
  }






}
