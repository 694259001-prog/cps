void main() {
    IO.println("Enter number1");
    int number1 = Integer.parseInt(IO.readln());
    IO.println("Enter number2");
    int number2 = Integer.parseInt(IO.readln());
    IO.println("Current -> num1= " + number1 + " and " + " num2= " + number2);
    if (number2 > number1) {
        IO.println("The second number is more than the first number ... Do nothing .. Bye bye !!!");
    } else {
        int swap = number1;
        int num1 = number2;
        int num2 = swap;
        IO.println("Now -> num1 = " + num1 + " num2 = " + num2);
    }
}