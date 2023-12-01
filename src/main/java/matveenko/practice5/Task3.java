package matveenko.practice5;
/*
Известны данные о стоимости каждого из 12 товаров.
Найти общую стоимость тех товаров, которые стоят дороже 1000 uah
(количество таких товаров неизвестно)
 */
public class Task3 {
    public static void main(String[] args) {
        int[] prisces = {1005, 2080, 580, 750, 980, 1500, 6000, 700, 450, 250, 1260, 375};
        System.out.println("Загальна сума = " + sumPricesMore1000(prisces));
    }
    public static int sumPricesMore1000 (int[] array){
       int sum = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>1000){
                sum += array[i];
            }

        } return sum;
    }
}
