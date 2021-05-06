package edu.handong.csee.java.hw2.converters;

/**
 * Kg to Pound converter implement methods from Convertible interface
 */
public class KGToPOUNDConverter implements Convertible {
	private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from kg to pound
     */
    public void convert() {
        convertedValue = originalValue * 2.205;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}