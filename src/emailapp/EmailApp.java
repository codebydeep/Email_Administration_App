package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        System.out.println("=============== Welcome to Email Administration platform ==============");
        Email em1 = new Email("John" , "Smith");
        System.out.println(em1.showInfo());
        System.out.println("===================== Thanks for Choosing Us!.... =====================");
    }
}
