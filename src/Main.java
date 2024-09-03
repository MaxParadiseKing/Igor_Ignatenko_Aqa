
        public class Main {
            public static void main(String[] args) {
                // Создание массива сотрудников
                Employee[] employees = new Employee[5];
                employees[0] = new Employee("Иванов Иван", "Инженер", "ivanov@mail.com", "892312312", 30000, 30);
                employees[1] = new Employee("Петров Петр", "Программист", "petrov@mail.com", "892355512", 50000, 35);
                employees[2] = new Employee("Сидоров Сидор", "Дизайнер", "sidorov@mail.com", "892377712", 40000, 28);
                employees[3] = new Employee("Козлов Козельский", "Менеджер", "kozlov@mail.com", "892399912", 35000, 32);
                employees[4] = new Employee("Николаев Никита", "Тестировщик", "nikolaev@mail.com", "892311912", 45000, 27);

                // Вывод информации о сотрудниках
                for(Employee emp : employees) {
                    emp.printInfo();
                }

                // Создание объектов аттракционов в парке
                Park park = new Park();
                Park.Attraction attraction1 = park.new Attraction("Карусель", "10:00 - 21:00", 200);
                Park.Attraction attraction2 = park.new Attraction("Aмериканские горки", "11:00 - 18:00", 250);

                // Вывод информации об аттракционах
                attraction1.printInfo();
                attraction2.printInfo();
            }
        }