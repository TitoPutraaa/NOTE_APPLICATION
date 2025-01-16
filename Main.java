import java.util.Scanner;

public class Main { // NOTE program with stack 
    static Scanner sc = new Scanner(System.in);
    static int jml_note = 1;
    static String[] head_note = new String[jml_note];
    static String[] content = new String[jml_note];
    

    public static void main(String[] args) {
        System.out.println("===WELCOME TO NOTE APK===");
        do {
            System.out.println("\n===MENU===");
            System.out.println("1 : CREATE");
            System.out.println("2 : UPDATE");
            System.out.println("3 : READ");
            System.out.println("4 : DELETE");
            System.out.print("pick : ");
            int pick = sc.nextInt();

            switch (pick) {
                case 1:
                    create_new();
                    break;
                case 2:
                    
                    break;
                case 3:
                    read();
                    break;
                case 4:
                    
                    break;
            
                default:
                System.out.println("EROR, please pick number between 1 - 4 ");
                    break;
            }
        } while (true);
    }

    static void create_new() {
        for (int i = 0; i < jml_note; i++) {
            System.out.print("Note Name : ");
            sc.nextLine();
            head_note[i] = sc.nextLine();
            System.out.println("Contents");
            content[i] = sc.nextLine();
        }
    }

    // method to show note 
    static void read() {
        for (int i = 0; i < jml_note; i++) {
            System.out.println ("\n" + head_note[i]);
            System.out.println("---------------------------------------");
            System.out.println(content[i]);
        }
    }
}