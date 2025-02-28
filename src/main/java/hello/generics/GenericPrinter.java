package hello.generics;

public class GenericPrinter<T extends Material>  {
    private T material;

    public T getMeterial() {
        return material;
    }

    public void setMeterial(T meterial) {
        this.material = meterial;
    }

    public String toString() {
        return material.toString();
    }
    public void printing() {
        material.doPrinting();
    }
}
