void main() {
    IO.print("Enter number1");
    int number1 = Integer.parseInt(IO.readln());
    IO.print("Enter number2");
    int number2 = Integer.parseInt(IO.readln());
    IO.println("Current -> Number1 = " + number1 + " And " + "Number2 = " + number2);
    IO.println("Swapping -----------------");
    int swap = number1;
    int num1 = number2;
    int num2 = swap;
    IO.println("Now -> Number1 = " + num1 + " And " + "number2 = " + num2);
}