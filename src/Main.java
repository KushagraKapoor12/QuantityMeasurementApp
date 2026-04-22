public class Inches {
    private double value;

    public Inches(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;

        if (!(obj instanceof Inches)) return false;

        Inches other = (Inches) obj;

        return Double.compare(this.value, other.value) == 0;
    }
}