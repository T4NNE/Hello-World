public class Main {

    public static void main(String[] args) {

        String name = "Tam";
        String ausbildung = "Fachinformatoker für Anwendungsentwicklung";
        String age = "20";

        showGreeting(10);

        System.out.println("Ich heiße " + name + ". Ich bewerbe mich als " + ausbildung + " und bin " + age + " Jahre alt.");
    }

    public static void showGreeting(int hour) {
        if (hour < 9) {
            System.out.println("Guten Morgen");
        }
        if (hour < 12 && hour > 9) {
            System.out.println("Guten Tag");
        }
        if (hour < 18 && hour > 12) {
            System.out.println("Guten Nachmitag");
        }
        if (hour > 18) {
            System.out.println("Guten Abend");
            {
            }
        }
    }
}
