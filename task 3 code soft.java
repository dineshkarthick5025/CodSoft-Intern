import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        while(true) {
            System.out.println("       ");
            System.out.println("       ");
            System.out.println("       ");
            System.out.println("       ");
            System.out.println("       ");
            System.out.println("*************************************");
            System.out.println("WELCOME to INDIAN OVERSEAS BANK(IOB) ");
            Scanner dinesh = new Scanner(System.in);
            System.out.println("       ");
            System.out.println("**** CLICK 1 to INSERT CARD *********");
            int num = dinesh.nextInt();
            if (num == 1) {
                System.out.println("DEAR CUSTOMER");
            }
            System.out.println("Please ENTER YOUR----xxxx 4 DIGIT PIN NUMBER");
            int num2 = dinesh.nextInt();
            System.out.println("DEAR CUSTOMER");
            System.out.println("Select your transaction");
            System.out.println("***** Press 1 to WIDHRAW CASH");
            System.out.println("***** Press 2 to CHECK BALANCE ENQUIERY");
            System.out.println("***** Press 3 to CHANGE YOUR ATM PIN");
            System.out.println("***** Press 4 TO DEPOSIT CASH");
            int num3 = dinesh.nextInt();
            if (num3 == 1) {
                System.out.println("ENTER YOUR TRANSACTION AMOUNT$");
                int num4 = dinesh.nextInt();
                int ADD = 25000;       //stored ammount
                if (num4 <= ADD) {
                    System.out.println("YOUR TRANSACTION IS BEING PROCESSED.....");
                    System.out.println("     ");
                    System.out.println("PLEASE COLLECT YOUR CASH");
                    System.out.println("      ");
                    System.out.print("        ");
                    System.out.print("        ");
                    System.out.print("PRESS 1 to get RECIEPT");
                    int num5 = dinesh.nextInt();
                    System.out.println("      ");
                    System.out.println("DEAR CUSTOMER  DATE;DD/MM/YY  TIME;00.00.00");
                    System.out.println("AC;..XXXX");
                    System.out.println("CURRENT AVAIL BALANCE;$" + ADD);
                    System.out.println("AMOUNT TAKEN;$" + num4);
                    int num7 = ADD - num4;
                    System.out.println("TOT. AVAIL BALANCE;$" + num7);
                    System.out.println("......  ");
                    System.out.println("........");
                    System.out.println("PRESS 1 TO CANCEL");
                    int num14 = dinesh.nextInt();
                } else {
                    System.out.println("INSUFFICIENT BALANCE");
                    System.out.println("PRESS 1 TO CANCEL");
                    int num14 = dinesh.nextInt();
                }

            } else if (num3 == 3) {
                System.out.println("ENTER YOUR OLD ---XXXX 4 DIGIT PIN NO.");
                int num8 = dinesh.nextInt();
                System.out.println("ENTER NEW ---XXXX 4 DIGIT PIN Number");
                int num9 = dinesh.nextInt();
                System.out.println("ENTER YOUR NEW PIN Number;AGAIN TO CONIRM");
                int num20 = dinesh.nextInt();
                if (num9 == num20) {
                    System.out.println("YOUR TRANSACTION IS BEING PROCESSED");
                    System.out.println("DEAR CUSTOMER  DATE;DD/MM/YY  TIME;00.00.00");
                    System.out.println("AC;XXXX [ YOUR PIN NUMBER HAS BEEN CHANGED]");
                    System.out.println("......  ");
                    System.out.println("........");
                    System.out.println("PRESS 1 TO CANCEL");
                    int num14 = dinesh.nextInt();
                }
                if (num9 != num20) {
                    System.out.println("          ");
                    System.out.println("          ");
                    System.out.println("          ");
                    System.out.println("ITS INVALID PIN NUMBER******");
                    System.out.println("PRESS 1 TO CANCEL");
                    int num14 = dinesh.nextInt();
                }
            }
                else {
                    if (num3 == 2) {
                        System.out.println("DEAR CUSTOMER  DATE;DD/MM/YY  TIME;00.00.00");
                        System.out.println("AC==..XXXX");
                        int ADD=25000;
                        System.out.println("AVAIL BALANCE=$"+ADD);
                        System.out.println("......  ");
                        System.out.println("........");
                        System.out.println("PRESS 1 TO CANCEL");
                        int num13 = dinesh.nextInt();
                    }
                    if (num3 == 4) {
                        System.out.println("ENTER TRANSACTION AMOUNT THAT YOU WANT TO DEPOSIT");
                        int num10 = dinesh.nextInt();
                        System.out.println("      ");
                        System.out.print("YOUR AMOUNT $" + num10);
                        System.out.print("has been deposited on your account sucessfully ");
                        System.out.println("      ");
                        System.out.print("        ");
                        System.out.print("        ");
                        System.out.print("PRESS 1 to get RECIEPT");
                        int num11 = dinesh.nextInt();
                        System.out.println("DEAR CUSTOMER  DATE;DD/MM/YY  TIME;00.00.00");
                        System.out.println("AC;..XXXX");
                        int ADD = 25000;
                        System.out.println("CURRENT AVAIL BALANCE;$" + ADD);
                        System.out.println("AMOUNT DEPOSITED;$" + num10);
                        int num7 = ADD + num10;
                        System.out.println("TOT. AVAIL BALANCE;$" + num7);
                        System.out.println("......  ");
                        System.out.println("........");
                        System.out.println("PRESS 1 to cancel");
                        int num8 = dinesh.nextInt();
                    }
                }  if (num3 > 4) {
                        System.out.println("ITS AN INVALID OUTPUT");
                        System.out.println("plz try again");
                    }
                }
        }
    }

