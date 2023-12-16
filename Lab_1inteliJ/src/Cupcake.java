public class Cupcake extends Food {
    private String size;

    public Cupcake(String size) {
        super("Пироженое");
        this.size = size;
    }

    public void consume() {
        System.out.println(this +"съеден");
    }
    public String getSize() {return size; }
    public void setSize(String size) { this.size = size; }

    public boolean equals(Object arg0) {
        if (!super.equals(arg0)) return false; // Шаг 1
        if (!(arg0 instanceof Cupcake)) return false; // Шаг 2
        return size.equals(((Cupcake)arg0).size); // Шаг 3
    }
    public String toString() {
        return super.toString() + " Размера '" + size.toUpperCase() + "'";
    }
}
