package kalaygian.dennis;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by denniskalaygian on 5/22/17.
 */
public class TestCurrency {

    @Test
    public void testFormatCurrency() {
        // Given
        Currency dollars = CurrencyFactory.createCurrency("Dollar", 9.999999999);
        String expected = "10";
        // When
        String returnValue = dollars.formatCurrency(dollars.getAmount());
        // Then
        Assert.assertEquals("Checking to see if the currency was correctly formatted",
                expected, returnValue);
    }

    @Test
    public void testFormatCurrency_obnoxiousNumberOfDecimals() {
        // Given
        Currency dollars = CurrencyFactory.createCurrency("Dollar", 3.234532547326476);
        String expected = "3.23";
        // When
        String returnValue = dollars.formatCurrency(dollars.getAmount());
        // Then
        Assert.assertEquals("Checking to see if the currency was correctly formatted",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_Euro_fromDollar() throws ClassNotFoundException {
        // Given
        Currency dollars = CurrencyFactory.createCurrency("Dollar", 2);
        String expected = "1.88";
        // When
        String returnValue = dollars.convertTo("Euro");
        // Then
        Assert.assertEquals("Checking conversion from Dollar to Euro",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_Dollar_fromEuro() throws ClassNotFoundException {
        // Given
        Currency euros = CurrencyFactory.createCurrency("Euro", 2);
        String expected = "2.13";
        // When
        String returnValue = euros.convertTo("Dollar");
        // Then
        Assert.assertEquals("Checking conversion from Euro to Dollar",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_BritishPound_fromEuro() throws ClassNotFoundException {
        // Given
        Currency euros = CurrencyFactory.createCurrency("Euro", 10);
        String expected = "8.72";
        // When
        String returnValue = euros.convertTo("British Pound");
        // Then
        Assert.assertEquals("Checking conversion from Euro to BritishPound",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_IndianRupee_fromBritishPound() throws ClassNotFoundException {
        // Given
        Currency britishPounds = CurrencyFactory.createCurrency("british pound", 100);
        String expected = "8331.71";
        // When
        String returnValue = britishPounds.convertTo("Indian Rupee");
        // Then
        Assert.assertEquals("Checking conversion from BritishPound to Indian Rupee",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_CanadianDollar_fromRupee() throws ClassNotFoundException {
        // Given
        Currency indianRupee = CurrencyFactory.createCurrency("Indian Rupee", 10);
        String expected = "0.19";
        // When
        String returnValue = indianRupee.convertTo("canadian dollar");
        // Then
        Assert.assertEquals("Checking conversion from Indian Rupee to Canadian Dollar",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_SingaporeDollar_fromCanadianDollar() throws ClassNotFoundException {
        // Given
        Currency canadianDollar = CurrencyFactory.createCurrency("Canadian Dollar", 10);
        String expected = "10.83";
        // When
        String returnValue = canadianDollar.convertTo("Singapore Dollar");
        // Then
        Assert.assertEquals("Checking conversion from Canadian Dollar to Singapore Dollar",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_SwissFranc_fromSingaporeDollar() throws ClassNotFoundException {
        // Given
        Currency singaporeDollar = CurrencyFactory.createCurrency("Singapore Dollar", 10);
        String expected = "7.06";
        // When
        String returnValue = singaporeDollar.convertTo("Swiss Franc");
        // Then
        Assert.assertEquals("Checking conversion from Singapore Dollar to Swiss Franc",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_MalaysianRinggit_fromSwissFranc() throws ClassNotFoundException {
        // Given
        Currency swissFranc = CurrencyFactory.createCurrency("Swiss Franc", 10);
        String expected = "44.26";
        // When
        String returnValue = swissFranc.convertTo("Malaysian Ringgit");
        // Then
        Assert.assertEquals("Checking conversion from Swiss Franc to Malaysian Ringgit",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_JapaneseYen_fromMalaysianRinggit() throws ClassNotFoundException {
        // Given
        Currency malaysianRinggit = CurrencyFactory.createCurrency("Malaysian Ringgit", 10);
        String expected = "259.15";
        // When
        String returnValue = malaysianRinggit.convertTo("Japanese Yen");
        // Then
        Assert.assertEquals("Checking conversion from Malaysian Ringgit to Japanese Yen",
                expected, returnValue);
    }

    @Test
    public void testConvertTo_ChineseYuanRenminbi_fromJapaneseYen() throws ClassNotFoundException {
        // Given
        Currency japaneseYen = CurrencyFactory.createCurrency("Japanese Yen", 115.84);
        String expected = "6.92";
        // When
        String returnValue = japaneseYen.convertTo("Chinese Yuan Renminbi");
        // Then
        Assert.assertEquals("Checking conversion from Japanese Yen to Chinese Yuan Renminbi",
                expected, returnValue);
    }

}
