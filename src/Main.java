public class Main {
    public static void main(String[] args) {

        Cat catOne = new Cat(3, 6, true,"Milk","Vaska","Sam");

       catOne.getVoice();

        System.out.println(catOne);

        Animals an = catOne;
        System.out.println(an.getAge());

    }

}
