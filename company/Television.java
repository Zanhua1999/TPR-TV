package com.company;

public class Television {

  //ATTRIBUTEN (EIGENCHAPPEN IN VARIABELEN)
  private int channel = 1;
  private int volumelevel = 1;
  private boolean on = false;

  //METHODE (GEDRAGINGEN - DINGEN DIE DE TV KAN DOEN)
  public void turnOn() {
    if (!on) {
      on = true;
      System.out.println("De TV staat nu aan.");
    } else {
      System.out.println("Sorry, de TV staat al aan.");
    }
  }

public void turnOff() {
  if (!on) {
    on = false;
    System.out.println("De TV staat nu uit.");
  } else {
    System.out.println("Sorry, de TV staat al uit.");
  }
}

public void setChannel(int newChannel) {
    this.channel = newChannel;
    System.out.println("Het kanaal staat nu op" + channel);
}

public void setVolume(int newVolumeLevel) {
this.volumelevel = newVolumeLevel;
  System.out.println("Het volume staat nu op" + volumelevel);
}

public void channelUp() {
  if (on) {
if (channel < 10) {
  channel++;
  System.out.println("De TV staat nu op" + channel + ".");
} else {
  System.out.println("Sorry, het kanaal kan niet hoger dan 10.");
}
} else {
  System.out.println("Sorry, je kan alleen zappen als de TV aan staat.");
  }
}

public void channelDown() {
if (on) {
  if (channel > 1) {
channel--;
System.out.println("De TV staat nu op" + channel + ".");
} else {
  System.out.println("Sorry, het kanaal kan niet lager dan 1.");
}
} else {
  System.out.println("Sorry, je kan alleen zappen als de TV aan staat");
}
}

public void volumeUp() {
  if (on) {
  if (volumelevel < 20) {
  volumelevel++;
  System.out.println("De TV staat nu op" + volumelevel + ".");
} else {
  System.out.println("Sorry, het volume kan niet hoger dan 20.");
}
} else {
  System.out.println("Sorry, je kan het volume alleen aanpassen als de TV aan staat.");
}
}

public void volumeDown() {
  if (on) {
  if (volumelevel > 0) {
  volumelevel--;
  System.out.println("De TV staat nu op" + volumelevel + ".");
} else {
  System.out.println("Sorry, het volume kan niet lager dan 0.");
}
} else {
  System.out.println("Sorry, je kan het volume alleen aanpassen als de TV aan staat");
}
}


}
