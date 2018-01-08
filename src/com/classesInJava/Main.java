package com.classesInJava;

public class Main {

        private int passengers;
        private int seats;

        public Main() {
            seats = 150;
            passengers = 0;
        }

        public void add1Passenger() {
            if(passengers < seats) passengers += 1;
             else handleTooMany();
        }

        private void handleTooMany() {
            System.out.println("Too Many");
        }

        //Methods

        void showSum(float x, float y, int count) {
            if(count < 1) return;

            float sum = x + y;
            for (int i = 0 ; i < count; i++)
                System.out.println(sum);
            return;
        }

        public boolean hasRoom(Main m2) {
            int total = this.passengers + m2.passengers;
            return total <= seats;
        }

        public Main createNewWithBoth(Main m2) {
            Main newMain = new Main();
            newMain.seats = seats;
            newMain.passengers = passengers + m2.passengers;
            return newMain;
        }


    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        main.showSum(7.2f, 4.5f, 1);
        System.out.println("I'm Back");

        Main lax1 = new Main();
        Main lax2 = new Main();

        //add passengers to both flights

        Main lax3 = null;

        if(lax1.hasRoom(lax2))
            lax3 = lax1.createNewWithBoth(lax2);
     }
}
