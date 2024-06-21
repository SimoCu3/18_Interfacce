public class Triangolo implements Forma{

    protected float altezzaTriangolo;
    protected float baseTriangolo;

    public Triangolo(float altezzaTriangolo, float baseTriangolo){
        this.altezzaTriangolo = altezzaTriangolo;
        this.baseTriangolo = baseTriangolo;
    }

    @Override
    public void calcolaArea(){
        float areaTriangolo = (altezzaTriangolo * baseTriangolo) / 2;
        System.out.println(areaTriangolo);
    }
/*
    @Override
    public String toString() {
        return "Triangolo{" +
                "altezzaTriangolo=" + altezzaTriangolo +
                ", baseTriangolo=" + baseTriangolo +
                '}';
    }

 */
}
