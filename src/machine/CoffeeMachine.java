package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int beans = 120;
    static int money = 550;
    static int disCups = 9;

    public static void main(String[] args) {
        action();
        start();

    }

    public static void start() {
        System.out.println(" ");
        System.out.println("The coffee machine has: ");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(beans + " of coffee beans");
        System.out.println(disCups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void action() {
        System.out.println(" ");
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        Scanner sc = new Scanner(System.in);
        String chooseAction = sc.next();
        switch (chooseAction) {
            case "buy" -> buy();
            case "fill" -> fill();
            case "take" -> take();
            case "remaining" -> remaining();
            case "exit" -> exit();
        }
    }

    private static void exit() {
        System.exit(0);
    }

    private static void remaining() {
        start();
        action();
    }

    private static void fill() {
        System.out.println(" ");
        Scanner fill = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        water += fill.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        milk += fill.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        beans += fill.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        disCups += fill.nextInt();
        action();
    }

    private static void take() {
        System.out.println(" ");
        System.out.println("I gave you $" + money);
        money -= money;
        action();
    }

    private static void buy() {
        System.out.println(" ");
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner buy = new Scanner(System.in);
        String chooseTypeOfCoffee = buy.next();
        switch (chooseTypeOfCoffee) {
            case "1" -> {
                if (water >= 350 && milk >= 75 && beans >= 20 && disCups >= 1) {
                    water -= 250;
                    beans -= 16;
                    money += 4;
                    disCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else System.out.println("Sorry, not enough water!");
                break;
            }
            case "2" -> {
                if (water >= 350 && milk >= 75 && beans >= 20 && disCups >= 1) {
                    water -= 350;
                    milk -= 75;
                    beans -= 20;
                    money += 7;
                    disCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else System.out.println("Sorry, not enough water!");
                break;

            }
            case "3" -> {
                if (water >= 350 && milk >= 75 && beans >= 20 && disCups >= 1) {
                    water -= 200;
                    milk -= 100;
                    beans -= 12;
                    money += 6;
                    disCups -= 1;
                    System.out.println("I have enough resources, making you a coffee!");
                } else System.out.println("Sorry, not enough water!");
                break;
            }
        }
        action();
    }
}