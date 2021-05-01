public class Monkey extends Animal{
    private int energyLevel;
    private String sound;
    protected static int speciesCount = 0;

    public Monkey(){
        this.energyLevel = 100;
        this.sound = "Ooo";
    }

    static{
        speciesCount++; 
    }

    public String makeSound(){
        energyLevel -= 4;
        return sound;
    }

    
    public String eatFood(String food){
        energyLevel += 2;
        return "Monkey is eating " + food + ".";
    }

    public String sleep(){
        energyLevel += 5;
        return "Monkey is sleeping.";
    }

    public String play(){
        if(energyLevel > 0){
            energyLevel -= 8;
        return sound + " " + sound + " " + sound;
        }else{
            return "Monkey is too tired.";
        }
    }

    public int getEnergy(){
        return this.energyLevel;
    }
}