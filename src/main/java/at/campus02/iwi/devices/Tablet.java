package at.campus02.iwi.devices;

public class Tablet extends Device {
    protected boolean arCamera;

    @Override
    double calculateProductionCost() {
        double kostenStück;
        double gesamtGen1;
        double gesamtGen2;
        double gesamtGen3;

        if (processor.getGeneration() == 1 && processor.getNrCores() == 1) {
            gesamtGen1 = gesamtGen1 + 150;
         if (processor.getGeneration() == 1 && processor.getNrCores() == 2) {
               gesamtGen1 = gesamtGen1 + 200;
             if (processor.getGeneration() == 2 && processor.getNrCores() >1 && processor.getNrCores() <4) {
                 gesamtGen2 = gesamtGen2 + 350;
                 if (processor.getGeneration() == 2 && processor.getNrCores() >4 && processor.getNrCores() <7) {
                     gesamtGen2 = gesamtGen2 + 400;
                     if (processor.getGeneration() == 2 && processor.getNrCores() >=8) {
                         gesamtGen2 = gesamtGen2 + 450;
                         if (processor.getGeneration() < 3) {
                             gesamtGen3 = 700;
                         }
        }

    }

    @Override
    double claculateSuppoertCostForAYear(int year) {
        return 0;
    }
//KONSTRUKTOR
    public Tablet(String name, Processor processor, int releaseYear, int nrProduced, boolean arCamera) {
        super(name, processor, releaseYear, nrProduced);
        this.arCamera = arCamera;
    }

    public boolean isArCamera() {
        return arCamera;
    }

    public void setArCamera(boolean arCamera) {
        this.arCamera = arCamera;
    }
}
