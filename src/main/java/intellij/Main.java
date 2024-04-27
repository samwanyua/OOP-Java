package intellij;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        Enemy enemy = new Enemy();
        enemy.Talk();

        Vampire vampire1 = new Vampire();
        vampire1.Talk();

        Werewolf werewolf = new Werewolf();
        werewolf.Talk();

        Enemy enemy_2 = vampire1;
        enemy_2.Talk(); //calls the vampire

//        Polymorphism
        Enemy [] enemies = {vampire1,werewolf};
        enemies[0].Talk();
        enemies[1].Talk();

//        Encapsulation
        Vampire vampire_two = new Vampire();

        vampire_two.setHealth(23);
        vampire_two.getHealth(); //23






    }

}