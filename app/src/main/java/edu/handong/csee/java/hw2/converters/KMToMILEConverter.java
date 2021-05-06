package edu.handong.csee.java.hw2.converters;

/**
 * Km to Mile converter implement methods from Convertible interface
 */
public class KMToMILEConverter implements Convertible {
    private double originalValue;
    private double convertedValue;

    /**
     * original value
     */
    public void setFromValue(double fromValue) {
        originalValue = fromValue;
    }
    /**
     * converting from km to mile
     */
    public void convert() {
        convertedValue = originalValue/1.6;
    }
    /**
     * receive the converted value
     */
    public double getConvertedValue() {
        return convertedValue;
    }
}
