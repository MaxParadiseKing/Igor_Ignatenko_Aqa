
        public class Main {
            public static void main(String[] args) {
                // задание №1
                Dog dog = new Dog();
                Cat cat = new Cat();

                cat.eat(5); // Cat eats from bowl
                cat.eat(15); // Cat tries to eat more than available in bowl

                Cat[] cats = new Cat[3];
                Bowl bowl = new Bowl();
                bowl.addFood(20);

                for (int i = 0; i < cats.length; i++) {
                    cats[i] = new Cat();
                    boolean catAte = cats[i].eat(10);
                    if (catAte) {
                        System.out.println("Cat " + (i + 1) + " is full");
                    } else {
                        System.out.println("Cat " + (i + 1) + " is still hungry");
                    }
                }

                // задание №2
                Circle circle = new Circle(5);
                circle.setFillColor("Red");
                circle.setBorderColor("Black");
                System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter() + ", Fill Color: " + circle.fillColor + ", Border Color: " + circle.borderColor);

                Rectangle rectangle = new Rectangle(4, 6);
                rectangle.setFillColor("Blue");
                rectangle.setBorderColor("Green");
                System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter() + ", Fill Color: " + rectangle.fillColor + ", Border Color: " + rectangle.borderColor);

                Triangle triangle = new Triangle(3, 4, 5);
                triangle.setFillColor("Yellow");
                triangle.setBorderColor("Purple");
                System.out.println("Triangle - Area: " + triangle.calculateArea() + ", Perimeter: " + triangle.calculatePerimeter() + ", Fill Color: " + triangle.fillColor + ", Border Color: " + triangle.borderColor);

            }
        }
        // задание №1

        class Animal {
            int runLimit;
            int swimLimit;

            public void run(int distance) {
                if (distance <= runLimit) {
                    System.out.println("Animal ran " + distance + " meters");
                } else {
                    System.out.println("Animal can't run that far");
                }
            }

            public void swim(int distance) {
                if (distance <= swimLimit) {
                    System.out.println("Animal swam " + distance + " meters");
                } else {
                    System.out.println("Animal can't swim that far");
                }
            }
        }

        class Dog extends Animal {
            Dog() {
                runLimit = 500;
                swimLimit = 10;
            }
        }

        class Cat extends Animal {
            Cat() {
                runLimit = 200;
                swimLimit = 0;
            }

            public boolean eat(int foodAmount) {
                if (foodAmount <= 0) {
                    return false;
                } else {
                    return true;
                }
            }
        }

        class Bowl {
            int foodAmount;

            public void addFood(int amount) {
                foodAmount += amount;
            }
        }

        // задание №2

        class Circle implements Shape {
            private double radius;
            String fillColor;
            String borderColor;

            Circle(double radius) {
                this.radius = radius;
            }

            @Override
            public double calculateArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }
        }

        class Rectangle implements Shape {
            private double length;
            private double width;
            String fillColor;
            String borderColor;

            Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }

            @Override
            public double calculateArea() {
                return length * width;
            }

            @Override
            public double calculatePerimeter() {
                return 2 * (length + width);
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }
        }

        class Triangle implements Shape {
            private double side1;
            private double side2;
            private double side3;
            String fillColor;
            String borderColor;

            Triangle(double side1, double side2, double side3) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;
            }

            @Override
            public double calculateArea() {
                double s = (side1 + side2 + side3) / 2;
                return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            }

            @Override
            public double calculatePerimeter() {
                return side1 + side2 + side3;
            }

            @Override
            public void setFillColor(String color) {
                this.fillColor = color;
            }

            @Override
            public void setBorderColor(String color) {
                this.borderColor = color;
            }
        }
