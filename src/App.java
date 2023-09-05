public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("Brumm...");
        maci.mezgyujtes();

        mici.hangotad("miauuu...");
        mici.dorombol();
        mici.beallitNev("");

    }
}