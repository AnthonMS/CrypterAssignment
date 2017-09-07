package com.company;

import java.util.Scanner;

public class Main {

    private static Boolean trueOrFalse = true;

    public static void main(String[] args) throws Exception
    {
       // Gets the encryption key as a start
        System.out.println("What do you want your key to be?: ");
        Scanner scan = new Scanner(System.in);
        String newKey = scan.nextLine();

        // Sets the keyValue in AEScrypt to the new value
        while (AEScrypt.setKeyValue(newKey) == false) {
            // Key is above 16 characters
            newKey = scan.nextLine();
        }

        /*Boolean test = AEScrypt.setKeyValue(newKey);
        if (test == false) {
            // not a valid key length
            newKey = scan.nextLine();
        }
        AEScrypt.setKeyValue(newKey);*/
        

        System.out.println("What do you wanna encrypt?: ");
        String unencData = scan.nextLine();
        String encData = AEScrypt.encrypt(unencData);
        //AEScrypt.setKeyValue("NotTheRightKey..");

        System.out.println("Uncrypted data: " + unencData);
        System.out.println("Encrypted data: " + encData);

        String decData = null;

        while (trueOrFalse) {
            System.out.println("To get the decrypted data, enter the key: ");
            String tempKey = scan.nextLine();
            AEScrypt.setKeyValue(tempKey);
            decData = AEScrypt.decrypt(encData);
            if (decData != null) {
                trueOrFalse = false;
            }

        }



        System.out.println("Decrypted data: " + decData);
    }
}
