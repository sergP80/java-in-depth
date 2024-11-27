package ua.edu.chmnu.advanced_java.oop.generic;

public class PriceLabel<Amount, Currency>{

    private Amount amount;

    private Currency currency;

    private String label;

    public PriceLabel(Amount amount, Currency currency, String label) {
        this.amount = amount;
        this.currency = currency;
        this.label = label;
    }

    public PriceLabel(Amount amount, Currency currency) {
        this(amount, currency, "");
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "PriceLabel{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", label='" + label + '\'' +
                '}';
    }
}
