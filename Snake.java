public class Snake extends Animal{
    private int energyLevel;
    private String sound;
    protected static int speciesCount = 0;

    public Snake(){
        this.energyLevel = 100;
        this.sound = "Sss";
    }

    static{
        speciesCount++; 
    }

    @Override
    public String makeSound(){
        energyLevel -= 3;
        return sound;
    }

    @Override
    public String eatFood(String food){
        energyLevel += 5;
        return "Snake is eating " + food + ".";
    }

    @Override
    public String sleep(){
        energyLevel += 10;
        return "Snake is sleeping.";
    }

    @Override
    public int getEnergy(){
        return this.energyLevel;
    }

    public String snakeSlithers(){
        return "Snake is slithering on the forest floor.";
    }
}