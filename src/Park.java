// Класс Park с внутренним классом Attraction
public class Park {
    // Внутренний класс Attraction
        class Attraction {
            private String name;
            private String workingTime;
            private double cost;

            public Attraction(String name, String workingTime, double cost) {
                this.name = name;
                this.workingTime = workingTime;
                this.cost = cost;
            }

            // Для вывода информации об аттракционе в консоль
            public void printInfo() {
                System.out.println("Название аттракциона: " + name);
                System.out.println("Время работы: " + workingTime);
                System.out.println("Стоимость: " + cost);
                System.out.println("-----------------------------");
            }
        }
}
