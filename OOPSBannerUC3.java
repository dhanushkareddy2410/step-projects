public class OOPSBannerUC3 {
    public static void printLine(String... parts) {
        String line = String.join("", parts);  
        System.out.println(line);
    }
    public static void displayBanner() {

        printLine(" *****   ", " *****   ", " ******  ", " ***** ");
        printLine("*     *  ", "*     *  ", "*     *  ", " *     ");
        printLine("*     *  ", "*     *  ", "******   ", " ****  ");
        printLine("*     *  ", "*     *  ", "*        ", "     * ");
        printLine(" *****   ", " *****   ", "*        ", " ***** ");
    }

    public static void main(String[] args) {
        displayBanner();
    }
}