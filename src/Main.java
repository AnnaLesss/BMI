public class Main {
    public static void main (String[] args) {
        BmiService service = new BmiService();
        double IBM = service.calculate(50, 1.6);
        System.out.println("Индекс массы тела " + IBM + " кг/м²");
    }

}
