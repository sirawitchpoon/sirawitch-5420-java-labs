package butryojantho.sirawitch.exercise;
public class RecComputation {
    public static void main(String[] args) {
        int num = args.length;
        if (num != 2) {
            System.out.println("Java input <width> <height>");
            System.exit(0);
        }
        String width = args[0];
        String height = args[1];
        Double w = Double.parseDouble(width);
        Double h = Double.parseDouble(height);
        Double area = w = h;
        Double circumference = (w + h) * 2;
        System.out.print("The circumference of a rectangle with width = " + w + " and height = " + h + " is " + circumference + " and its ares is " + area);
    }
}