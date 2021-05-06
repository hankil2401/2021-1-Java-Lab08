package edu.handong.csee.java.hw2.converters;

/**
 * Km to M converter implement methods from Convertible interface
 */
public class KMToMConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from km to m
     */
    public void convert() {
        convertedValue = originalValue * 1000;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
