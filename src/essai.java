public class essai {
    public static void main(String[] args) {
        try {
            Date d = new Date(-12,3,56);
        } catch (DateInvalideException e) {
            throw new RuntimeException("Pigeon");
        }
        System.out.println("\nCACA");


    }
}
