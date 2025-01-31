import java.util.Scanner;

public class Main { // NOTE program with stack 
    static Scanner sc = new Scanner(System.in);
    static int jml_note =  10;
    static String[] head_note = new String[jml_note];
    static String[] content = new String[jml_note];
    static int idx = 0;
    

    public static void main(String[] args) {
        System.out.println("===WELCOME TO NOTE APK===");
        do {
            System.out.println("\n===MENU==="); // menu program so the user can choose what he gaone do 
            System.out.println("1 : CREATE");
            System.out.println("2 : UPDATE");
            System.out.println("3 : READ");
            System.out.println("4 : DELETE");
            System.out.println("5 : EXIT");
            System.out.print("pick : ");
            int pick = sc.nextInt();

            switch (pick) { // swich case to execute the user pick by case 
                case 1:
                    create_new();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    read();
                    break;
                case 4:
                    delate();
                    break;
                case 5:
                    return;   
                default:
                System.out.println("EROR, please pick number between 1 - 5 ");
                    break;
            }
        } while (true);
    }

    static void create_new() { // method to make new note 
        System.out.print("Note Name : ");
        sc.nextLine();
        head_note[idx] = sc.nextLine();
        System.out.println("Contents");
        content[idx] = sc.nextLine();
        idx++;
    }

    // method to show note 
    static void read() { // method to show the note
        for (int i = 0; i < jml_note; i++) {
            if (head_note[i] == null) {
                continue;
            }
            System.out.println ("\n * " + head_note[i]);
            System.out.println(content[i]);
            System.out.println("===========================");
        }
    }
    
    static void delate() {
        System.out.println("SELECT THE NOTE YOU WANT TO DELATE : ");
        for (int i = 0; i < jml_note; i++) {
            if (head_note[i] == null) {
                continue;
            }
            System.out.println((i+1) + " : " + head_note[i]);
        }
        System.out.print("SELECT : ");
        int del = sc.nextInt();
        if (del >= 0 && del < jml_note) {
        head_note[del-1] = null;
        content[del-1] = null;
        }

    }

    static void update() {
        System.out.println("SELECT THE NOTE YOU WANT TO UPDATE : ");
        for (int i = 0; i < jml_note; i++) {
            if (head_note[i] == null) {
                continue;
            }
            System.out.println((i+1) + " : " + head_note[i]);
        }
        System.out.print("SELECT : ");
        int select_upd = sc.nextInt();
        System.out.println(head_note[select_upd-1]);
        System.out.print(content[select_upd-1]);
        sc.nextLine();
        String update = sc.nextLine();
        content[select_upd-1] += update;
        System.out.println(head_note[select_upd-1]);
        System.out.print(content[select_upd-1]);
    }
}