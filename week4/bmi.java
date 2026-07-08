void main() {
    IO.print("Enter Fahrenheit: ");
    double Fahrenheit = Double.parseDouble(IO.readln());
    double celsius = (5 / 9.0) * (Fahrenheit - 32);
    IO.println("Fahrenheit = %.2f , Celsius = %.2f ".formatted(Fahrenheit, celsius));
}