void main() {
    IO.print("Enter price of one dress : ");
    int price = Integer.parseInt(IO.readln());
    IO.print("Enter number of dresses : ");
    int number = Integer.parseInt(IO.readln());
    IO.print("Enter discount rate : ");
    int discount = Integer.parseInt(IO.readln());
    IO.println("-----------------------------------------");
    float totalcoset = price * number;
    float discountamount = number * discount;
    float netpay = totalcoset - discountamount;
    IO.print(" Total cost = " + totalcoset + " bath ");
    IO.print(" Discount Amount = " + discountamount + " bath ");
    IO.print("Net pay  = " + netpay + " bath ");
}