public class Rettangolo implements Forma{

    protected float altezzaRettangolo;
    protected float baseRettangolo;

    public Rettangolo(float altezzaRettangolo, float baseRettangolo){
        this.altezzaRettangolo = altezzaRettangolo;
        this.baseRettangolo = baseRettangolo;
    }

    @Override
    public void calcolaArea(){
        float areaRettangolo = altezzaRettangolo * baseRettangolo;
        System.out.println(areaRettangolo);
    }

    /*@Override
    public String toString() {
        return "Rettangolo{" +
                "altezzaRettangolo=" + altezzaRettangolo +
                ", baseRettangolo=" + baseRettangolo +
                '}';
    }

     */
}
