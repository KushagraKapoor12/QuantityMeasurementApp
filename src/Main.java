public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCH);

        System.out.println(a.add(b, LengthUnit.FEET));   // 2 feet
        System.out.println(a.add(b, LengthUnit.INCH));   // 24 inches
        System.out.println(a.add(b, LengthUnit.YARD));   // ~0.667 yard

        QuantityLength c = new QuantityLength(36.0, LengthUnit.INCH);
        QuantityLength d = new QuantityLength(1.0, LengthUnit.YARD);

        System.out.println(c.add(d, LengthUnit.FEET));   // 6 feet
    }
}