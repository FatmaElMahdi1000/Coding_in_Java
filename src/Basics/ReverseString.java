public static void main(String[] args) {
    String sen = "  Hi There!";

    // Trim, reverse, and convert back to String in one line
    String revSen = new StringBuilder(sen.trim()).reverse().toString();

    System.out.println(revSen);
}