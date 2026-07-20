void main() {
    IO.print("Enter number : ");
    Double number = Double.parseDouble(IO.readln());
    if (number == 1) {

        IO.print("Enter tne base of triangle : ");
        Double base = Double.parseDouble(IO.readln());
        IO.print("Emter the height of triangle : ");
        double heiight = Double.parseDouble(IO.readln());
        double arse = (1.0 / 2.0) * base *heiight;
        IO.println("Arse of the triangle : %2.f".formatted(arse) + " square units");
    } else {

        IO.print("Enter your weight in kilogrom : ");
        double weight = Double.parseDouble(IO.readln());
        IO.print("Enter your heightBMI in meters : ");
        double heightBMI = Double.parseDouble(IO.readln());
        double BMI = weight / (heightBMI * heightBMI);
        IO.println("your BMI for weight= %.2f".formatted(weight) + "weight =%2.f".formatted(weight) +"kg and height = %2.f".formatted(heightBMI) + "meter is ; " + BMI + "bmi.");
    }
}
