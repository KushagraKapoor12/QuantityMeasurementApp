public class QuantityMeasurementApp {

    public static void main(String[] args) {

        QuantityLength q1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength q2 = new QuantityLength(12.0, LengthUnit.INCH);

        System.out.println(q1.add(q2)); // 2 feet

        QuantityLength q3 = new QuantityLength(12.0, LengthUnit.INCH);
        QuantityLength q4 = new QuantityLength(1.0, LengthUnit.FEET);

        System.out.println(q3.add(q4)); // 24 inches

        QuantityLength q5 = new QuantityLength(1.0, LengthUnit.YARD);
        QuantityLength q6 = new QuantityLength(3.0, LengthUnit.FEET);

        System.out.println(q5.add(q6)); // 2 yards
    }
}