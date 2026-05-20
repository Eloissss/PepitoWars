public class TankEnanito extends Personatge {

    private int defensa = 0;

    public TankEnanito(String nom, Equip equip) {
        super(nom, equip);
    }

    public void ferAccio(Personatge oponent) {
        int mal = defensa;

        super.atacarAmbMal(oponent, mal);

        defensa = 0;
        for(int i = 2; i>0; i--){
            defensa += Dau.tirar(10);
        }
    }


    public void rebreMal(int mal) {
        int malInicial;

        malInicial = mal;
        mal-= defensa;
        defensa -=malInicial;

        if(mal < 0) mal = 0;
        if(defensa<0) defensa =0;

        super.rebreMal(mal);
    }
}