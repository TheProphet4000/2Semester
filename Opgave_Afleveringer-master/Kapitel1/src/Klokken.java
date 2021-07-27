public class Klokken {
    public static void main(String[] args) {
        VisKlokken();
    }
    public static void VisKlokken(){
        long AntalMillisekunder = System.currentTimeMillis();
        long AntalSekunder = AntalMillisekunder / 1000;
        long AntalMinutter = AntalSekunder / 60;
        long AntalTimer = AntalMinutter / 60;
        long SekunderINutid = AntalSekunder % 60;
        long MinutterINutid = AntalMinutter % 60;
        long TimerINutid = AntalTimer % 24;

        System.out.println("Klokken er " + TimerINutid + ":"
                + MinutterINutid + ":" + SekunderINutid + " i tidszonen UTC±00:00");
    }
}