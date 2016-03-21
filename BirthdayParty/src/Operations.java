import Formats.Label;
import person.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class Operations {
    private final String country;
    private GuestsList guestsDetails;
    private ArrayList<String> options;
    Label label = new Label();

    public Operations(GuestsList guestsDetails, ArrayList<String> options, String country) {
        this.guestsDetails = guestsDetails;
        this.options = options;
        this.country = country;
    }

//    private String printUsage(String option){
//        return String.format("LabelPrinter: illegal option %s\nusage: LabelPrinter [-f,-l,-c,-a] [file]", option);
//    }

    private String printLabelsForSingleOption() {
        String labels = "";
        Iterator iterate= guestsDetails.iterator();
        while(iterate.hasNext()){
            Person guest = (Person) iterate.next();
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
        Iterator iterate= guestsDetails.iterator();
        while(iterate.hasNext()){
            Person guest = (Person) iterate.next();
            switch (option) {
                case "-l-c":
                    labels.add(label.getLastNameFirstWithCountry(guest, this.country));
                    break;
                case "-f-c":
                    labels.add(label.getFirstNameFirstWithCountry(guest, this.country));
                    break;
                case "-f-a":
                    labels.add(label.getFirstNameFirstWithAge(guest, this.country));
                    break;
                default:
                    labels.add(label.getLastNameFirstWithAge(guest, this.country));
                    break;
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
            case 1:
                return printLabelsForSingleOption();
            case 2:
                return printLabelsForTwoOptions();
            default:
                return printFirstNameFirstLabel();
        }
    }

}
