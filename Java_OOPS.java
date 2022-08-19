package com.JAVA_DSA;
interface Driver1Info{
    String Name();
    String DOB();
    String Qualifications();
}
interface Driver2Info {
    String Name();

    String DOB();

    String Qualifications();
}
class Train{

    static int EngineNumOfWheels = 12;
    static int CoachNumOfWheels = 8;
    public void BlowHorn(){
        System.out.println("Poooooooooo......Poooooooooo");
    }
    public void EngineOn(){
        System.out.println("Turning On Engine");
    }
    public void RunningStatus(){
        System.out.println("Started To Run");
    }
}
class RajExpress extends Train implements Driver1Info{
    public String Name() {
        return "Name :- XYZ Kumar";
    }

    public String DOB() {
        System.out.println();
        return "23-12-1987";
    }

    public String Qualifications() {
        return "B.A. In History";
    }
    public String Speed(){
        return "Max Speed is " + 140 +" " + "MPH";
    }
    public String Journey(){
        return "Patna To Delhi <-----> Delhi To Patna";
    }
}
class VibhutiExpress extends Train implements Driver2Info {
    public String Name() {
        return "Name :- ABC Kumar";
    }

    public String DOB() {
        System.out.println();
        return "09-04-1993";
    }

    public String Qualifications() {
        return "B.A. In Political Science";
    }

    public String Speed() {
        return "Max Speed is " + 120 + " " + "KMPH";
    }

    public String Journey() {
        return "Patna To Howrah <-----> Howrah To Patna";
    }
}
public class Java_OOPS {
    public static void main(String[] args) {
        System.out.println("Train Properties");
        Train T1 = new Train();

        T1.BlowHorn();
        T1.EngineOn();
        T1.RunningStatus();
        System.out.println("\n");
        System.out.println("No. Of Wheels In A Train's Coach is " + " " + Train.CoachNumOfWheels);
        System.out.println("No. Of Wheels In A Train's Engine is" + " " + Train.EngineNumOfWheels);

        System.out.println("Raj Express Details ");

        RajExpress R1 = new RajExpress();
        System.out.println("Journey Details" + " " +R1.Journey());
        System.out.println("Max Speed" + " " + R1.Speed());
        System.out.println("Driver's Details");
        System.out.println("Driver's Name" + " " + R1.Name());
        System.out.println("Driver's DOB" + " "+ R1.DOB());
        System.out.println("Driver's Qualifications" + R1.Qualifications());
        System.out.println("\n");

         VibhutiExpress V1 = new VibhutiExpress();
        System.out.println("Journey Details" + " " +V1.Journey());
        System.out.println("Max Speed" + " " + V1.Speed());
        System.out.println("Driver's Details");
        System.out.println("Driver's Name" + " " + V1.Name());
        System.out.println("Driver's DOB" + " "+ V1.DOB());
        System.out.println("Driver's Qualifications" + " " + V1.Qualifications());
    }
}