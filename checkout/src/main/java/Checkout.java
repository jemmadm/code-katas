
class Checkout {

    int total;

    public int total() {


        return total;
    }

    public void scan(Item item) {

        total += item.price;

        if (total() % 3 == 0)

            System.out.println(0);



    }


}


//
//    Checkout checkout;
//
//    Checkout() {
//        checkout = new Checkout(pricingRules);
//    }
//  checkout.scan(item);
//     checkout.scan(item);
//    price = checkout.total();
//
//    int total() {
//        throw new UnsupportedOperationException("Not implemented yet");
//    }



