package edu.handong.csee.java.hw2;

/**
 * AllConverter class activate when "all" is in command line argument
 */
public class AllConverter {
    private double fromValue;
    private String originalMeasure;
    private double convertedValue1;
    private double convertedValue2;

    /**
     * 
     * @param fromValue original value
     * @return double
     */
    public AllConverter setFromValue(double fromValue) {
        this.fromValue = fromValue;
        return this;
    }
    /**
     * 
     * @param originalMeasure original measure (KM or TON only)
     * @return String
     */
    public AllConverter setOriginalMeasure(String originalMeasure) {
        this.originalMeasure = originalMeasure;
        return this;
    }

    /**
     * convert and print value
     */
    public void convertAndPrintOut() {
        if(originalMeasure.equals("KM")) {
            convertedValue1 = fromValue * 1000;
            convertedValue2 = fromValue / 1.6;
            System.out.println(fromValue +" " + originalMeasure + " to " + convertedValue1 + " " + "M");
            System.out.println(fromValue +" " + originalMeasure + " to " + convertedValue2 + " " + "MILE");
        }

        else if(originalMeasure.equals("TON")) {
            convertedValue1 = fromValue * 1000;
            convertedValue2 = fromValue * 1000000;
            System.out.println(fromValue +" " + originalMeasure + " to " + convertedValue1 + " " + "KG");
            System.out.println(fromValue +" " + originalMeasure + " to " + convertedValue2 + " " + "G");
        }
        else {
            System.out.println("AllConverter cannot support the measure!\n");
        }
    }
}
