import person.Person;

import java.util.ArrayList;
import java.util.LinkedList;

public class Operations {
    private final String country;
    private LinkedList<Person> guestsDetails;
    private ArrayList<String> options;
    Label label = new Label();

    public Operations(LinkedList<Person> guestsDetails, ArrayList<String> options, String country) {
        this.guestsDetails = guestsDetails;
        this.options = options;
        this.country = country;
    }

//    private String printUsage(String option){
//        return String.format("LabelPrinter: illegal option %s\nusage: LabelPrinter [-f,-l,-c,-a] [file]", option);
//    }

    private String printLabelsForSingleOption() {
        String labels = "";
        for (Person guest : guestsDetails) {
            if (options.indexOf("-f") != -1) {
                labels += label.getFirstNameFirst(guest) + "\n";
            } else {
                labels += label.getLastNameFirst(guest) + "\n";
            }
        }
        return labels;
    }


    private ArrayList<String> getLabelsForTwoOptions() {

        String option = this.options.get(0) + this.options.get(1);
        ArrayList<String> labels = new ArrayList<>();
        for (Person guest : guestsDetails) {
            if (option.equals("-l-c")) {
                labels.add(label.getLastNameFirstWithCountry(guest, this.country));
            } else {
                labels.add(label.getFirstNameFirstWithCountry(guest, this.country));
            }
        }
        return labels;
    }

    private String printLabelsForTwoOptions() {
        String guestLabels = "";
        ArrayList<String> labels = getLabelsForTwoOptions();
        for (String label : labels) {
            if (!(label.equals(""))) {
                guestLabels += label + "\n";
            }
        }
        return guestLabels;
    }

    private String printFirstNameFirstLabel() {
        options.add("-f");
        return printLabelsForSingleOption();
    }

    public String printLabels() {
        int number = options.size();
        switch (number) {
            case 0:
                return printFirstNameFirstLabel();
            case 1:
                return printLabelsForSingleOption();
            case 2:
                return printLabelsForTwoOptions();
            default:
                return printFirstNameFirstLabel();
        }
    }

}
