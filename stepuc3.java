public class OopsJoin {
    public static void main(String[] args) {
        String[] lines = {
            "  ___   ___  ____  ____ ",
            " / _ \\ / _ \\|  _ \\/ ___|",
            "| | | | | | | |_) \\___ \\ ",
            "| |_| | |_| |  __/ ___) |",
            " \\___/ \\___/|_|   |____/ "
        };

        String art = String.join("\n", lines);

        System.out.println(art);
    }
}