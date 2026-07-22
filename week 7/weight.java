void main() {
    int male = 1;
    int female = 2;
    IO.print("Enter Gender (1 for male, 2 for female): ");
    int gender = Integer.parseInt(IO.readln());
    IO.print("Enter Weight (kg): ");
    double Weight = Double.parseDouble(IO.readln());
    IO.print("Enter Height (M): ");
    double Height = Double.parseDouble(IO.readln());
    IO.print("Enter Age (years): ");
    int Age = Integer.parseInt(IO.readln());
    if (gender == 1) {
        double BMR = 66 + (13.7 * Weight) + (5 * Height) - (6.8 * Age);
        IO.println("You BMR is: " + BMR);
    } 
    else {
        double BMR = 655 + (9.6 * Weight) + (1.8 * Height) - (4.7 * Age);
        IO.println("You BMR is: " + BMR);
    }
}
