package com.example;


import java.util.Scanner;

public class Main {

    //Function non-parameter
    static void end(){
        System.out.println("\n==============Terimakasih================\n"+"==============Selamat Jalan==============");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TypeVehicle,masuk,keluar,total,tanggal;

        while(true){
            System.out.println("==================PT.DKP==================");
            System.out.println("==============Parking Ticket==============");
            System.out.println("==========================================\n");
            
            System.out.print("Input Kendaraan Anda (1.Mobil)(2.Motor) : ");
            TypeVehicle = input.nextInt();

            System.out.print("Tanggal : ");
            tanggal= input.nextInt();

            System.out.print("Jam Masuk (1-24) : ");
            masuk = input.nextInt();
            System.out.print("Jam Keluar (1-24) : ");
            keluar = input.nextInt();
            
            if (TypeVehicle >= 1 && TypeVehicle <= 2 ) {
                if (tanggal >= 1 && tanggal <= 31) {
                    if (masuk >= 1 && masuk <= 24) {
                        if (keluar >= 1 && keluar <= 24) {
                            break;
                        }
                    }
                }
            }
            System.out.println("Data yang anda masukkan tidak valid\nSilahkan coba lagi\n\n");
        }

        total = (keluar-masuk);
        if (total <= 0) {
            total = total + 24;
        }
        
//         System.out.println("\n*Jika Harga (-) Format Input Jam Salah");
        if(TypeVehicle==1){
            System.out.println("Harga: "+total*3+"000");
        } else if (TypeVehicle==2) {
            System.out.println("Harga: "+total*2+"000");
        }

        System.out.println(tanggal+"/03/2022");
        
        switch(TypeVehicle){
            case(1) : System.out.println("Kendaraan Anda Roda 4 (Mobil) " );
            break;
            case(2) : System.out.println("Kendaraan Anda Roda 2 (Motor) " );
            break;
            default: System.out.println("Kendaraan Anda Tidak Dikenali ");
            break;
        }
        end();
        Method objek = new Method();
        String print = objek.peringatan("KUNCI GANDA========");
        System.out.println(print);
    }


}

