public class Operate {
    private String[] filenames;
    private String[] options;

    public Operate(String[] filenames, String[] options) {
        this.filenames = filenames;
        this.options = options;
    }

    public void getAllOptionsResult() throws Exception {
        int[] result;
        if (this.options[0] == null) {
            for (String file : this.filenames) {
                ReadFile read = new ReadFile(file);
                String content = read.readFile();
                WcLib wc = new WcLib(content);
                result = wc.countAll();
                System.out.println("    " + result[0] + "   " + result[1] + "   " + result[2] + "  " + file);
            }
        }
    }

}
