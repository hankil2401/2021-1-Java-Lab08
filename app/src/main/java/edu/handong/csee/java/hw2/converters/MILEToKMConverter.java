package edu.handong.csee.java.hw2.converters;

/**
 * Mile to Km converter implement methods from Convertible interface
 */
public class MILEToKMConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from mile to km
     */
    public void convert() {
        convertedValue = originalValue * 1.6;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
