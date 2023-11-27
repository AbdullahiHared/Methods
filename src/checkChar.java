public class checkChar {
    static boolean checkChar(char sign) {
    int tal = (int)sign;
    if (tal >= 48 && tal <= 57) {
        System.out.println("The charactor is Number");
        return true;
    }  else {
        System.out.println("The char is not a Number");
        final boolean checking = false;
        return checking;
    }

    }

    public static void main(String[] args) {
      checkChar('-');
    }

}
