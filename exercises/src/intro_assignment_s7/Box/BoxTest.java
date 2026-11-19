package intro_assignment_s7.Box;

public class BoxTest {
    public static void main(String[] args){
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(12345);
        Box<Double> doubleBox = new Box<>(6.7);
        Box<Boolean> booleanBox = new Box<>(true);
        Box<Character> characterBox = new Box<>('A');

        System.out.println(stringBox.getContent());
        System.out.println(integerBox.getContent());
        System.out.println(doubleBox.getContent());
        System.out.println(booleanBox.getContent());
        System.out.println(characterBox.getContent());

        stringBox.setContent("Goodbye");
        integerBox.setContent(6789);
        doubleBox.setContent(3.14);
        booleanBox.setContent(false);
        characterBox.setContent('Z');



        System.out.println(stringBox.getContent());
        System.out.println(integerBox.getContent());
        System.out.println(doubleBox.getContent());
        System.out.println(booleanBox.getContent());
        System.out.println(characterBox.getContent());

    }
}
