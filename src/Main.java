public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[] {1, 2, 3, 4, 5});
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.average());
    }
}
