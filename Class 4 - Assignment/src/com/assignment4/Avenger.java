package com.assignment4;

public class Avenger {

    public String name;
    public int age;
    public int power;
    public String weapon;
    public String planet;

    public Avenger () { }

    public Avenger (String _name, int _age, int _power, String _weapon, String _planet) {
        name = _name;
        age = _age;
        power = _power;
        weapon = _weapon;
        planet = _planet;
    }

    public String[] getDetails () {
        return new String[]{name, Integer.toString(age), Integer.toString(power), weapon, planet};
    }

    public void displayDetails () {
        String[] avArray = {name, Integer.toString(age), Integer.toString(power), weapon, planet};
        for (String details : avArray) {
            System.out.println(details);
        }
    }

}
