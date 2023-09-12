public class Lamparita {
    private boolean estado = false;
    public void apagar(){
        this.estado = false;
    }
    public void encender(){
        this.estado = true;
    }
    public boolean estado(){
        return this.estado;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Vamos a programar una lamparita!!");
        Lamparita lam1 = new Lamparita();
        lam1.apagar();
        System.out.println(lam1.estado());
    }
}
