package com.mytest;

public class Computer {

   private String address;
   CPU[] cpus;

   public Computer(String address) {
       this.address = address;
       this.cpus = new CPU[9];
       cpus[0] = new CPU("인텔 3");
       cpus[2] = new CPU("인텔 5");
       cpus[8] = new CPU("인텔 7");

   }

   void showCPUs() {
       System.out.println( address + " 에 있는 cpu 목록 : ");
       for (int i = 0; i < cpus.length; i++) {
           if(cpus[i] != null) {
               cpus[i].showInfo();
           }
       }
   }

   public static void main(String[] args) {

       Computer computer = new Computer("용산전자상가");
       computer.showCPUs();


   }


}
