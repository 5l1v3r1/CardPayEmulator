package ru.yamoney.test.services.card_pay;

import java.math.BigDecimal;

/**
 * Created by nizienko on 19.03.2016.
 */
public interface CardPayService {
    CardPayResult payViaCard(Card card, BigDecimal sum, String shop);
}
