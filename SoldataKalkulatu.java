import java.util.Scanner;

public class SoldataKalkulatu {
    
    public static String kalkulatuSoldata(String idStr, String sailaStr, String ofizioaStr) {
        // Saila hutsik bada, 0 bezala hartu
        if (sailaStr.trim().isEmpty()) {
            sailaStr = "0";
        }
        
        // Ofizioa zenbaki bihurtu
        int ofizioa;
        try {
            ofizioa = Integer.parseInt(ofizioaStr.trim());
        } catch (NumberFormatException e) {
            return "Errorea: Datuak ez dira zuzenak";
        }
        
        // Soldata kalkulatu
        switch(ofizioa) {
            case 1:
                return "Soldata esleitua: 2500 (analista)";
            case 2:
                return "Soldata esleitua: 1500 (diseinatzailea)";
            case 3:
                return "Soldata esleitua: 2000 (programatzailea)";
            default:
                return "Errorea: Datuak ez dira zuzenak";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== LANGILEAREN SOLDATA KALKULATU ===");
        System.out.println();
        
        // Langilearen IDa eskatu
        System.out.print("Sartu langilearen IDa (100-999, 0-rekin hasi gabe): ");
        String idStr = scanner.nextLine();
        
        // Saila eskatu
        System.out.print("Sartu saila (hutsik utzi edo 01-99): ");
        String sailaStr = scanner.nextLine();
        
        // Ofizioa eskatu
        System.out.println("Ofizioaren aukera:");
        System.out.println("1. analista");
        System.out.println("2. diseinatzailea");
        System.out.println("3. programatzailea");
        System.out.print("Sartu ofizioa (1, 2 edo 3): ");
        String ofizioaStr = scanner.nextLine();
        
        // Kalkulatu
        String emaitza = kalkulatuSoldata(idStr, sailaStr, ofizioaStr);
        
        System.out.println("\n=== EMAITZA ===");
        System.out.println(emaitza);
        
        scanner.close();
    }
}