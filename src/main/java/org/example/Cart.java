package org.example;

class Cart {
    public int pid;
    public String p_name;
    public int p_price;
    public int p_qty;
    Cart() {// Constructor default
        System.out.println("Added Item in the Cart");
        pid = 2;
        p_name = "Computer";
        p_price = 50000;
        p_qty = 2;
    }

    void CartItem() {
        System.out.println("Added item:" + p_name);
        System.out.println("pid:"+pid);
        System.out.println("p_qty:" +p_qty);
        System.out.println("price:"+p_price);
    }
}
class CartInfo{
    public static void main(String[] args) {
        Cart item1 = new Cart();
        item1.CartItem();

    }
}



