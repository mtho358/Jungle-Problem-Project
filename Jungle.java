import java.util.List;
import java.util.ArrayList;

public class Jungle{
    List<Tiger> tigers = new ArrayList<>();
    List<Snake> snakes = new ArrayList<>();
    List<Monkey> monkeys = new ArrayList<>();
    String fish = "fish";
    String grain = "grain";
    String fruit = "fruit";
    String meat = "meat";
    String bug = "bug";

    public Jungle(){
        Tiger tiger = new Tiger();
        tigers.add(tiger);

        Snake snake = new Snake();
        snakes.add(snake);

        Monkey monkey = new Monkey();
        monkeys.add(monkey);

        nightTime();

        dayTime();

        animalActions();

        nightTime();

        dayTime();

        animalActions();

        animalActions();
    }

    public static void main(String[] args){
        Jungle jungle = new Jungle();
        jungle.soundOff();
    }

    public void nightTime(){
        for(Monkey monkey : monkeys){
            monkey.sleep();
        }

        for(Snake snake : snakes){
            snake.eatFood(meat);
        }

        for(Tiger tiger : tigers){
            tiger.eatFood(meat);
        }
    }

    public void dayTime(){
        for(Monkey monkey : monkeys){
            monkey.eatFood(fruit);
        }

        for(Tiger tiger : tigers){
            tiger.sleep();
        }
        
        for(Snake snake : snakes){
            snake.sleep();
        }
    }

    public void animalActions(){
        for(Monkey monkey : monkeys){
            monkey.play();
        }

        for(Tiger tiger : tigers){
            tiger.tigerSwims();
        }

        for(Snake snake : snakes){
            snake.snakeSlithers();
        }
    }

    public void soundOff(){
        for(Monkey monkey : monkeys){
            System.out.println("Monkey makes " + monkey.makeSound() + " sound and has " + monkey.getEnergy() + " energy left.");
        }

        for(Snake snake : snakes){
            System.out.println("Snake makes " + snake.makeSound() + " sound and has " + snake.getEnergy() + " energy left.");
        }

        for(Tiger tiger : tigers){
            System.out.println("Tiger makes " + tiger.makeSound() + " sound and has " + tiger.getEnergy() + " energy left.");
        }
    }
}