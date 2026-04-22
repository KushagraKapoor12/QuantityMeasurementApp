public class QuantityMeasurementApp {

    // Inner class Feet
    static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Getter
        public double getValue() {
            return value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference check (Reflexive)
            if (this == obj) return true;

            // Null check
            if (obj == null) return false;

            // Type check
            if (this.getClass() != obj.getClass()) return false;

            // Cast safely
            Feet other = (Feet) obj;

            // Compare using Double.compare
            return Double.compare(this.value, other.value) == 0;
        }

        // 🔥 MUST override hashCode when equals is overridden
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }

    // Main method for manual testing
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + f1.equals(f2) + ")");
    }
}