public class HT1110231 {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        boolean isReweOpen = false;

            if (isEdekaOpen)
            System.out.println("Я могу купить еду, это Edeka ");

             if (isEdekaOpen || isReweOpen) {
            System.out.println("Я могу купить еду, это Edeka ");
            System.out.println("Я могу купить еду, это Rewe ");

            if (isReweOpen)
                System.out.println("Я могу купить еду, это Rewe ");

            if (isEdekaOpen && isReweOpen) {
                System.out.println("Я могу купить еду, это Edeka ");
                System.out.println("Я могу купить еду, это Rewe ");
            }
        }
    }
}
      /*  1 уровень сложности: 1) Создайте две переменные isEdekaOpen и isReweOpen,
         значения которых зависят от того, открыты магазины или нет.
         Реализует логический метод canBuy,  возвращающий boolean
         Значение этой переменной должно быть true, если хотя бы один магазин
         открыт, иначе false.
         Отобразите строку «Я могу купить еду, это ……» и значение.*/


