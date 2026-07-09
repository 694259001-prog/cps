void main() {
    IO.print("Enter bas of triangle : ");
    int baseoftriangle = Integer.parseInt(IO.readln());
    IO.print("Enter height of triangle : ");
    int heightoftriangle = Integer.parseInt(IO.readln());
    double trianglearea = (1.0 / 2.0) * baseoftriangle * heightoftriangle;
    IO.print("Enter Number of months : ");
    IO.print("------------------------------------------");
    IO.print("Enter width of rectangle : ");
    int widthofrectangle = Integer.parseInt(IO.readln());
    IO.println("Enter length of rectangle : ");
    int lengthofrectangle = Integer.parseInt(IO.readln());
    double rectanglearea = widthofrectangle * lengthofrectangle;
    IO.println("Area of rectangle = %.2F square units".formatted(rectanglearea));
}
