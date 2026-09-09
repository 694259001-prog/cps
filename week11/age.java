void main() {
    IO.print(("Enter you age "));
    int age = Integer.parseInt(IO.readln());
    if (age >= 60) {
        IO.println("Senior");
        } else if (age >=29) {
            IO.println("Adult");
        } else if (age <=19) {
            IO.println("Teenager");
        } else if (age >=9) {
            IO.println("Child");
        } else {
            IO.println("Invalid age");
        }
    }