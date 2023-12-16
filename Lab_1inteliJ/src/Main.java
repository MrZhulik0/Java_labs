public class Main {
    // Главный метод главного класса
    public static void main(String[] args) throws Exception {
        //Создание массива ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        for(int itemIndex=0; itemIndex <args.length; itemIndex++) {
            String[] parts = args[itemIndex].split("/");
            if (parts[0].equals("Cheese")) {
                // У сыра дополнительных параметров нет
                breakfast[itemIndex] = new Cheese();

            } else if (parts[0].equals("Apple")) {
                breakfast[itemIndex] = new Apple(parts[1]);

            } else if (parts[0].equals("Tea")){
                breakfast[itemIndex] = new Tea(parts[1]);
            }else if (parts[0].equals("Cupcake")){
            breakfast[itemIndex] = new Cupcake(parts[1]);
        }
        }
        // Перебор всех элементов массива
        for (Food item: breakfast) {
            // Если дошли до элемента null – значит достигли конца
            // списка продуктов, ведь 20 элементов в массиве было
            // выделено с запасом, и они могут быть не использованы все
            if (item==null) break;
            // Если элемент не null – употребить продукт
            item.consume();
        }
        System.out.println("Всего хорошего!");
    }
}