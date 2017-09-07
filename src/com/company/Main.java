package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception
    {
       /* String pass = "password";
        String passEnc = AEScrypt.encrypt(pass);
        String passDec = AEScrypt.decrypt(passEnc);

        System.out.println("Plain Text : " + pass);
        System.out.println("Encrypted Text : " + passEnc);
        System.out.println("Decrypted Text : " + passDec);*/

       // Gets the encryption key as a start
        System.out.println("What do you want your key to be?: ");
        Scanner scan = new Scanner(System.in);
        String newKey = scan.nextLine();

        // Sets the keyValue in AEScrypt to the new value
        AEScrypt.setKeyValue(newKey);

        System.out.println("What do you wanna encrypt?: ");
        String unencData = scan.nextLine();
        String encData = AEScrypt.encrypt(unencData);

        System.out.println("Uncrypted data: " + unencData);
        System.out.println("Encrypted data: " + encData);
    }
}
