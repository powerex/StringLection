public class Test {
    public static void main(String[] args) {
        try {
            test(new StringBuffer("")); // StringBuffer: 17432.
            test(new StringBuilder("")); // StringBuilder: 1791ms.
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        }
    }
    private static void test(Appendable obj) throws java.io.IOException {
        // Поточний час до початку тесту
        long before = System.currentTimeMillis();
        for (int i = 0; i++ < 1e9; ) {
            obj.append("");
        }
        // Поточний час пілся виконання блоку коду
        long after = System.currentTimeMillis();
        // результат
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }

    private static String changeString(String string){
        string.concat("smth");
        return string;
    }

    private static void appendDemo(){
        StringBuilder some = new StringBuilder()
                .append("some")
                .reverse();
        some.toString();
    }

    private static String newString(){
        return new StringBuilder()
                .append(" ")
                .toString();
    }
}