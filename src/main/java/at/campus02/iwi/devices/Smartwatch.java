package at.campus02.iwi.devices;

public class Smartwatch extends Device{

    protected int nrWristSizes;

    @Override
    double calculateProductionCost() {
        double Herstellungskosten = this.nrWristSizes * 100 * (nrWristSizes -1) * 10;
        return Herstellungskosten;
    }

    @Override
    double claculateSuppoertCostForAYear(int year) {
        return 0;
    }
//KONSTRUKTOR
    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduced, int nrWristSizes) {
        super(name, processor, releaseYear, nrProduced);
        this.nrWristSizes = nrWristSizes;
    }

    public int getNrWristSizes() {
        return nrWristSizes;
    }

    public void setNrWristSizes(int nrWristSizes) {
        this.nrWristSizes = nrWristSizes;
    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "nrWristSizes=" + nrWristSizes +
                ", name='" + name + '\'' +
                ", nrProduced=" + nrProduced +
                '}';
    }
}
