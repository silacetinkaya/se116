public class Mage extends Character {
    private int mana;

    public Mage(String name,double hitPoint,String gender){
        super(name, hitPoint, gender);
        this.mana=10;
    }
    public Mage(){
        super("",0,"");
        this.mana=10;
    }
    private void drinkPotion(){
        mana +=10;
        System.out.println("updated mana"+mana);
    }
    @Override
    public double calculateDamage(){
        return getHitPoint()*0.8;

    }
    @Override
    public void regerenatePower(){
       drinkPotion();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Mana: " + mana);
    }
    @Override
    public void attack(){
        if(mana<5){
            System.out.println("not enough mana");
            drinkPotion();
        }else{
            mana-=5;
            super.attack();
            System.out.println("final mana:"+mana);

        }
    }

}
