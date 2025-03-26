package com.food.ordering.system.payment.service.domain;

import com.food.ordering.system.payment.service.domain.entity.CreditEntry;
import com.food.ordering.system.payment.service.domain.entity.CreditHistory;
import com.food.ordering.system.payment.service.domain.entity.Payment;
import com.food.ordering.system.payment.service.domain.event.PaymentEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry CreditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessagesList);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                            CreditEntry CreditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessagesList);
}
