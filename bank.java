void main() {
    IO.print("Enter amount to prices");
    int prices = Integer.parseInt(IO.readln());
    IO.print("Enter amount to quantity");
    int quantity = Integer.parseInt(IO.readln());
    int bank = prices * quantity;
    if (bank > 1000) {
        IO.println("Not enough money!!");
    } else {
        int bank500 = bank / 500;
        bank = bank % 500;
        int bank100 = bank / 100;
        bank = bank % 100;
        int bank50 = bank / 50;
        bank = bank % 50;
        int bank20 = bank / 20;
        bank = bank % 20;
        int coin10 = bank / 10;
        bank = bank % 10;
        int coin5 = bank / 5;
        bank = bank % 5;
        int coin2 = bank / 2;
        bank = bank % 2;
        IO.println("Five-hundred note : " + bank500 + " note(s)");
        IO.println("Hundred note : " + bank100 + " note(s)");
        IO.println("Fifty note : " + bank50 + " note(s)");
        IO.println("Twenty note : " + bank20 + " note(s)");
        IO.println("Ten coin note : " + coin10 + " note(s)");
        IO.println("five coin note : " + coin5 + " note(s)");
        IO.println("Two coin note : " + coin2 + " note(s)");
        IO.println("one coin note : " + bank + " note(s)");
    }
}