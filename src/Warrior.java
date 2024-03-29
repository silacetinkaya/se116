public class Warrior extends Character{
    private int energy;

    public Warrior(String name,double hitPoint,String gender){
        super(name,hitPoint,gender);
        this.energy=20;
    }
    public Warrior(){
        super("",0,"");
        this.energy=20;
    }
    private void rest() {
        energy += 20;
        System.out.println("ENERGYYY LOADINGGG: " + energy);
    }
    @Override
    public double calculateDamage() {
        return getHitPoint() * 1.2;
    }

    @Override
    public void attack(){
        if(energy<10){
            System.out.println("no energy get rest... ");
            rest();
        }else{
            energy -=10;
            super.attack();
            System.out.println("Using sword to attack! Energy remaining: " + energy);

        }
    }

    @Override
    public void regerenatePower() {
     rest();
    }

    @Override
    public void printInfo() {
        super.printInfo(); // Call superclass printInfo method
        System.out.println("Energy: " + energy);
    }



}
