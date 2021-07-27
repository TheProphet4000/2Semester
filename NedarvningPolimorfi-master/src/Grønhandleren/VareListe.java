package Grønhandleren;
import java.util.ArrayList;

public class VareListe {

    ArrayList<Varer> vareLager = new ArrayList<>();

    public void opteldning(){
        vareLager.add(new Agurker());
        vareLager.add(new Apple());
        vareLager.add(new Peas());

        System.out.println("Der er "+varerIAlt()+" vare på lageret");
        visLager();
    }

    public int varerIAlt(){
        return vareLager.size();
    }

    public int antalAgurker(){ //skal indenholde hvor mange agurker der er på lageret
        return 0;
    }

    public void visLager(){
        for (int i = 0; i < vareLager.size(); i++){
            System.out.println("Vare nummer " + i + " er " + vareLager.get(i));
            //System.out.println("Der er " + " antal agurker på lageret");
        }
    }

}
