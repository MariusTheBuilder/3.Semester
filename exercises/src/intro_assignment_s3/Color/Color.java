package intro_assignment_s3.Color;

public class Color {
    int red = 0;
    int green = 0;
    int blue = 0;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String describe() {
        return "RGB: red: " + red + " green: " + green + " blue: " + blue;
    }
    public static void main(String[] args) {
        ClrRed red = new ClrRed();
        ClrGreen green = new ClrGreen();
        ClrBlue blue = new ClrBlue();
        ClrBlack black = new ClrBlack();
        ClrWhite white = new ClrWhite();
        ClrGray gray = new ClrGray();
        ClrCyan cyan  = new ClrCyan();

        System.out.println(red.describe());
        System.out.println(green.describe());
        System.out.println(blue.describe());
        System.out.println(black.describe());
        System.out.println(white.describe());
        System.out.println(gray.describe());
        System.out.println(cyan.describe());
    }
}
