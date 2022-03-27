package com.example;


import java.util.Scanner;

public class Main {

    //Function non-parameter
    static void end(){
        System.out.println("\n==========Terimakasih============\n"+"==========Selamat Jalan==========");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int TypeVehicle,masuk,keluar,total,tanggal;




        System.out.println("==================PT.DKP==================");
        System.out.println("==============Parking Ticket==============");
        System.out.println("==========================================");
        System.out.println("Input Kendaraan Anda (1.Mobil)(2.Motor) : ");
        TypeVehicle = input.nextInt();

        System.out.println("Tanggal : ");
        tanggal= input.nextInt();


        System.out.println("Jam Masuk (1-24) : ");
        masuk = input.nextInt();
        System.out.println("Jam Keluar (1-24) : ");
        keluar = input.nextInt();


        total = (keluar-masuk);

        System.out.println("\n*Jika Harga (-) Format Input Jam Salah");
        if(TypeVehicle==1){
            System.out.println("Harga: "+total*3+"000");
        } else if (TypeVehicle==2) {
            System.out.println("Harga: "+total*2+"000");
        }


        if(tanggal> 31){
            System.out.println("Tanggal : Invalid");
        }else if (tanggal>= 1){
            System.out.println(tanggal+"/03/2022");
        }else{
            System.out.println("Tanggal : Invalid");
        }
        if(masuk >24){
            System.out.println("Jam : Invalid");
        }else if(masuk>=1){
            System.out.println("");
        }else{
            System.out.println("Format Invalid");
        }
        if(keluar >24){
            System.out.println("Jam : Invalid");
        }else if(keluar>=1){
            System.out.println("");
        }else{
            System.out.println("Format Invalid");
        }

        switch(TypeVehicle){
            case(1) : System.out.println("Kendaraan Anda Roda 4 (Mobil) " );
            break;
            case(2) : System.out.println("Kendaraan Anda Roda 2 (Motor) " );
            break;
            default: System.out.println("Kendaraan Anda Tidak Dikenali ");
            break;
        }
        end();
    }


    }

