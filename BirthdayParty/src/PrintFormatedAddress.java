public class PrintFormatedAddress {
    public static void main(String[] args) throws Exception {
        ReadFile read = new ReadFile();
        read.printDetails(args[0], args[1]);
    }
}
