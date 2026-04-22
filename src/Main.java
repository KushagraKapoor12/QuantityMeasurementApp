public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println(
                QuantityLength.convert(1.0, LengthUnit.FEET, LengthUnit.INCH)
        );

        System.out.println(
                QuantityLength.convert(3.0, LengthUnit.YARD, LengthUnit.FEET)
        );

        System.out.println(
                QuantityLength.convert(36.0, LengthUnit.INCH, LengthUnit.YARD)
        );

        System.out.println(
                QuantityLength.convert(1.0, LengthUnit.CENTIMETER, LengthUnit.INCH)
        );
    }
}