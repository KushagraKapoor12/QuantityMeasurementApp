public class QuantityLength {

    private final double value;
    private final LengthUnit unit;

    public QuantityLength(double value, LengthUnit unit) {
        if (unit == null || !Double.isFinite(value)) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.value = value;
        this.unit = unit;
    }

    // 🔹 equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof QuantityLength)) return false;

        QuantityLength other = (QuantityLength) obj;

        double thisBase = this.unit.convertToBaseUnit(this.value);
        double otherBase = other.unit.convertToBaseUnit(other.value);

        return Double.compare(thisBase, otherBase) == 0;
    }

    // 🔹 convert
    public QuantityLength convertTo(LengthUnit targetUnit) {
        double base = this.unit.convertToBaseUnit(this.value);
        double converted = targetUnit.convertFromBaseUnit(base);
        return new QuantityLength(converted, targetUnit);
    }

    // 🔹 add (UC7)
    public QuantityLength add(QuantityLength other, LengthUnit targetUnit) {

        double base1 = this.unit.convertToBaseUnit(this.value);
        double base2 = other.unit.convertToBaseUnit(other.value);

        double sum = base1 + base2;

        double result = targetUnit.convertFromBaseUnit(sum);

        return new QuantityLength(result, targetUnit);
    }

    @Override
    public String toString() {
        return value + " " + unit;
    }
}