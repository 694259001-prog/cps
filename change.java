void main() {
    IO.print("Enter amount to pay");
    int pay = Integer.parseInt(IO.readln());
    int change = 1000 - pay;
    IO.println("change is : " + change + " bath ");

    int bank500 = change / 500;
    change = change % 500;
    int bank100 = change / 100;
    change = change % 100;
    int bank50 = change / 50;
    change = change % 50;
    int bank20 = change / 20;
    change = change % 20;
    int coin10 = change / 10;
    change = change % 10;
    int coin5 = change / 5;
    change = change % 5;
    int coin2 = change / 2;
    change = change % 2;
    IO.println("Five-hundred note : " + bank500 + " note(s)");
    IO.println("Hundred note : " + bank100 + " note(s)");
    IO.println("Fifty note : " + bank50 + " note(s)");
    IO.println("Twenty note : " + bank20 + " note(s)");
    IO.println("Ten coin note : " + coin10 + " note(s)");
    IO.println("five coin note : " + coin5 + " note(s)");
    IO.println("Two coin note : " + coin2 + " note(s)");
    IO.println("one coin note : " + change + " note(s)");
}
