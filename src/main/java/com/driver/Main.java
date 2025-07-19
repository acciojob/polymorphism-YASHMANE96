package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main{
        Product P = new Product();
        System.out.println(P.product(5,6));
        System.out.println(P.product(5,6,7));
        System.out.println(P.product(5.1,6.2));
    }

}