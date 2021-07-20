public class replaceall {
    public static void main(String[] args) {
        String birthday = "2000/10/21";
        String real = birthday.replaceAll("2000/10", "1999/02");
        System.out.println(real);
    }
}
