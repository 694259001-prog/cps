void main() {
    IO.print("Enter wide: ");
    double wide = Double.parseDouble(IO.readln());
    IO.print("Enter long: ");
    double length = Double.parseDouble(IO.readln());
    double wai = wide * length / 360;
    IO.println("Wide = %.2f".formatted(wai));
}