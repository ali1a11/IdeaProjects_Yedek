package deneme.D4;

class index {
    public static void main(String[] args) {

        String web = "www.amazon.com";

        int indexOfFirstDot = web.indexOf(".");
        System.out.println(indexOfFirstDot);
        System.out.println();
        int indexOfSecondDot = web.indexOf(".", indexOfFirstDot);
        System.out.println(indexOfSecondDot);
    }
}
