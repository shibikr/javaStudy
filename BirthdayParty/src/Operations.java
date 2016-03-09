import java.util.LinkedList;

public class Operations {
    private LinkedList<Person> guestsDetails;
    private  String option;

    public Operations(LinkedList<Person> guestsDetails, String option) {
        this.guestsDetails = guestsDetails;
        this.option = option;
    }

    public String printLabels(){
        if(isValidOption()){
            return createLabels();
        }else{
            return printUsage();
        }
    }

    private String createLabels(){
        String labels = "";
        for (Person person : this.guestsDetails) {
            labels += getSpecifiedFormat(person) + "\n";
        }
        return labels;
    }

    private boolean isValidOption(){
        boolean contains = false;
        String[] options = {"-l","-f","-fc","-lc"};
        for (String option:options) {
            if(option.equals(this.option))
                contains = true;
        }
        return contains;
    }

    private String printUsage(){
        return String.format("LabelPrinter: illegal option %s\nusage: LabelPrinter [-f,-l,-fc,-lc] [file]", this.option);
    }

    private String getSpecifiedFormat(Person person){
        switch (option) {
                case "-f":
                    return person.getFirstNameFirst();
                case "-l":
                    return person.getLastNameFirst();
                case "-fc":
                    return person.getFirstNameFirstWithCountry();
                case "-lc":
                    return person.getLastNameFirstWithCountry();
                default:
                    return "usage";
            }

    }
}
    