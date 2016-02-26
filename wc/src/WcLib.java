class WcLib {

    private String text;

    public WcLib(String text) {
        this.text = text;
    }

    public int countLines() {
        if (this.text.equals ("")) return 0;
        return (this.text.split("\n").length);
    }

    public int countWords() {
        String[] words = this.text.split("\\s+");
        int count = 0;
        for (String word:words) {
            if (word != "") count++;
        }

        return count;
    }

    public int countCharacters() {
        return this.text.length();
    }


    public int countBytes() {
        byte[] bytes = this.text.getBytes();
        return bytes.length;
    }

    public int[] countAll() {
        int result[] = {countLines(), countWords(), countBytes()};
        return result;
    }

}
