public class Main {
    public static void main(String[] args) {
        zaznamZakazniku zaznam = new zaznamZakazniku();
        Zakaznik zakaznik1 = new Zakaznik("Martin Boček", 50);
        Zakaznik zakaznik2 = new Zakaznik("Petr Křivý", 45);
        zaznamZakazniku.nactiZeSouboru("vstup.txt");
        for(Zakaznik zakaznik : zaznam.getList()){ System.out.println(zakaznik.getJmeno()+":"+zakaznik.getPocetProdeju()+"\n");         }
        zaznam.pridat(zakaznik1);         zaznam.pridat(zakaznik2);         zaznam.zapisDoSouboru("vystup.txt");     } }

