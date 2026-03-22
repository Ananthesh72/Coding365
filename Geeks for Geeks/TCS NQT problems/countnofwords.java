public class countnofwords {
    public static void main(String[] args) {
        String s ="a\nhjpfo";
        // String s ="a\nyo\n";

        String cleaned = s.replace("\\n", " ").replace("\\t", " ");
        String trimmed = cleaned.trim();
        if (trimmed.isEmpty()) {
            System.out.println(0);;
        }
        System.out.println(trimmed.split("\\s+").length);
    }
}
