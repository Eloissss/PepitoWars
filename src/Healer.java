package src;

public class Healer extends Personatge {

    public Healer(String nom, Equip equip) {
        super(nom, equip);
    }

    @Override
    public void ferAccio(Personatge oponent) {
        int Valor = Dau.tirar(10);

        if (Dau.tirar(2) == 1){
            atacarAmbMal(oponent, Valor);
            System.out.println("mal");
        } else if (Dau.tirar(2) == 2){
            setCurar(oponent, - Valor);
            System.out.println("Curar");
        }

    }
}


