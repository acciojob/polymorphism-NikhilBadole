package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return 0;
        }

        //@Override
        public int product(int x, int y, int z) {
            return 1;
        }

        //@Override
        public double product(double x, double y) {
            return 1.2;
        }
    }

    public static void main(String[] args){
        Product p = new Product();
        p.product(0,1);
        p.product(0,1,2);
        p.product(1.1,1.2);
    }
}