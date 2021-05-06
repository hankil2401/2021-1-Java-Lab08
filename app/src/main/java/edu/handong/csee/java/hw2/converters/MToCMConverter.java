package edu.handong.csee.java.hw2.converters;

/**
 * M to CM converter implement methods from Convertible interface
 */
public class MToCMConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from m to cm
     */
    public void convert() {
        convertedValue = originalValue * 100;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
