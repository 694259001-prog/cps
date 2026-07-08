void main() {
    IO.print("Enter salary: ");
    double salary = Double.parseDouble(IO.readln());
    double tax = (10 / 100) * salary;
    IO.println("salary = %.2f , tax = %.2f ".formatted(salary, tax));
}