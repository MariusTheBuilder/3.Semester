package intro_assignment_s2.Nail;

public class NailTest {
    public static void main(String[] args) {
        intro_assignment_s2.Nail.bodypart.Nail fingerNail
                = new intro_assignment_s2.Nail.bodypart.Nail(1.5, 0.8, "White");
        intro_assignment_s2.Nail.hardware.Nail metalNail
                = new intro_assignment_s2.Nail.hardware.Nail(5.0, 0.3);

        System.out.println(fingerNail);
        System.out.println(metalNail);
    }
}
