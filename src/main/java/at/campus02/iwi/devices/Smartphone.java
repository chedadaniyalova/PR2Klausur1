package at.campus02.iwi.devices;

public class Smartphone extends Device{
    protected int nrCameras;

    @Override
    double calculateProductionCost() {
        int produzierteStück;
        int generationPrice = 100;
        int kameraKosten = nrCameras * 20;
        double gesamtpreis = generationPrice + kameraKosten;

        for (int i = 0; i < processor.getGeneration(); i++){
            generationPrice = generationPrice +100;
            if (nrProduced >= 100000 ) {
                gesamtpreis = (gesamtpreis * 0.9);

            } else  {
                if (nrProduced >= 1000000 )
                { gesamtpreis = (gesamtpreis) * 0.8;  }
                else gesamtpreis = gesamtpreis;

            }
        }
        return gesamtpreis;
    }


    @Override
    double claculateSuppoertCostForAYear(int year){
        return 0;
    }

//KONSTRUKTOR
    public Smartphone(String name, Processor processor, int releaseYear, int nrProduced, int nrCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.nrCameras = nrCameras;
    }

    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name: '" + name + '\'' +
                ", nrProduced" + nrProduced +
                '}';
    }

}
