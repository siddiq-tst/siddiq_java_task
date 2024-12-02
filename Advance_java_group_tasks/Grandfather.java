package Advance_java_group_tasks;

class Grandfather {
    String land = "Land (Advance_java_group_tasks.Grandfather's property)";
    public void showLand(){
        System.out.println("Inherited property: " + land);
    }
}

class Father extends Grandfather {
    String house = "House (Advance_java_group_tasks.Father's property)";

    public void showHouse() {
        System.out.println("Advance_java_group_tasks.Father's own property: " + house);
    }
}

class Son extends Father {
    int bankBalance = 500000;

    public void showBankbalance() {
        System.out.println("Advance_java_group_tasks.Son's bank balance: " + bankBalance);

    }
}


class Grandson extends Son {
    String car = "Car (Advance_java_group_tasks.Grandson's property)";

    public void showCar() {
        System.out.println("Advance_java_group_tasks.Grandson's property: " + car);
    }
}

class Greatgrandson extends Grandson {
    String gold = "Gold (Advance_java_group_tasks.Greatgrandson's property)";

    public void showGold() {
        System.out.println("Advance_java_group_tasks.Greatgrandson's property: " + gold);
    }
}

 class Main{

    public static void main(String[] args) {
        //Daughter daughter = new Daughter();
        Greatgrandson greatgrandson = new Greatgrandson();
        greatgrandson.showLand();
        greatgrandson.showHouse();
        greatgrandson.showBankbalance();
        greatgrandson.showCar();
        greatgrandson.showGold();

        System.out.println("*Properties list**");
        System.out.println("---> :" + greatgrandson.land);
        System.out.println("---> :" + greatgrandson.house);
        System.out.println("---> :" + greatgrandson.bankBalance);
        System.out.println("---> :" + greatgrandson.car);
        System.out.println("---> :" + greatgrandson.gold);
    }
}