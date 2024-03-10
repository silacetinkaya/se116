import java.util.Random;
public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal("dog", "hav");
        animals[1] = new Animal("cat", "meow");
        animals[2] = new Animal("pig", "oink");
        animals[3] = new Animal("sheep", "mee");
        animals[4] = new Animal("cow", "moo");


        choir(animals);
    }
    public static void choir(Animal[] animals){
        Random rd=new Random();
        for(int i=0;i<20;i++){
            int index=rd.nextInt(0,4);
            System.out.println(animals[index].getSound());

        }


    }

}
