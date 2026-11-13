package intro_assignment_s7.Pair;

public class PairTest {
    public static void main(String[] args){
        Pair<String, Integer> nameAndAge = new Pair<>("Marius", 23);
        Pair<Double, Integer> roundedDown = new Pair<>(3.14, 3);

        System.out.println(nameAndAge.getaContent() + " is " + nameAndAge.getbContent() + " years old!");
        System.out.println(roundedDown.getaContent() + " rounded down is " + roundedDown.getbContent() + "!");

        System.out.println(nameAndAge.getaContent() + "' favorite number is " + roundedDown.getbContent() + "!");

        System.out.println(nameAndAge.getaContent() + " used " + roundedDown.getaContent() + " as pi to calculate the circumference");


        Pair<Integer, String> ageAndName = nameAndAge.swap();
        System.out.println(ageAndName.getaContent() + " is " + ageAndName.getbContent() + " years old!");

    }
}
