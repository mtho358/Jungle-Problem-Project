public class Tiger extends Animal{
    private int energyLevel;
    private String sound;
    protected static int speciesCount = 0;

    public Tiger(){
        this.energyLevel = 100;
        this.sound = "Rawr";
    }

    static{
        speciesCount++; 
    }

    public String makeSound(){
        energyLevel -= 3;
        return sound;
    }

    public String eatFood(String food){

        if(energyLevel < 100){
            if(food.equals("meat")){
                energyLevel += 5;
                return "Tiger is eating " + food;
            }else{
                return "Tiger cannot eat " + food;
            } 
        }else{
            return "Tiger is too full.";
        }
    }   

    public String sleep(){
        energyLevel += 5;
        return "Tiger is sleeping";
    }

    public int getEnergy(){
        return energyLevel;
    }

    public String tigerSwims(){
        return "Tiger is swimming... splash splash splash";
    }
}