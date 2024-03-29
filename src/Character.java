public abstract class Character {
    private String name;
    private double hitPoint;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(double hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Character(String name, double hitPoint, String gender) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.gender = gender;
    }
    public Character(){}

    public double calculateDamage(){
        return hitPoint;
    }
    public void attack(){
        System.out.println("Attacking... Damage is: " + calculateDamage());

    }
    public void regeneratePower(){
        System.out.println("Regenerating...");
    }

    public abstract void regerenatePower();

    public void printInfo(){
        System.out.println("Name:"+name);
        System.out.println("HitPoint:"+hitPoint);
        System.out.println("Gender:"+gender);
    }
}
