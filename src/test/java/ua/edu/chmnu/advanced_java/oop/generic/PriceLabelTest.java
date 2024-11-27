package ua.edu.chmnu.advanced_java.oop.generic;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.math.BigDecimal;

class PriceLabelTest {

    @ParameterizedTest
    @CsvSource({
            "100, UAH",
            "20, USD"
    })
    void shouldCreatePriceLabelWithIntAmount(Integer amount, String currency) {

        PriceLabel<Integer, String> priceLabel = new PriceLabel<Integer, String>(amount, currency);

        System.out.println(priceLabel);
    }

    @ParameterizedTest
    @CsvSource({
            "100.22, UAH",
            "20.05, USD"
    })
    void shouldCreatePriceLabelWithDecimalAmount(BigDecimal amount, Currency currency) {

        var priceLabel = new PriceLabel<>(amount, currency);

        System.out.println(priceLabel);
    }


    @ParameterizedTest
    @CsvSource({
            "100.22, UAH, Price1",
            "20.05, USD, Price2"
    })
    void shouldCreatePriceLabelWithDecimalAmountAndLabel(BigDecimal amount, Currency currency, String label) {

        TripleConverter<BigDecimal, Currency, String, PriceLabel<BigDecimal, Currency>> tPriceConverter = PriceLabel::new;

        var priceLabel = tPriceConverter.convert(amount, currency, label);

        System.out.println(priceLabel);
    }

    enum Currency {
        UAH, USD
    }
}