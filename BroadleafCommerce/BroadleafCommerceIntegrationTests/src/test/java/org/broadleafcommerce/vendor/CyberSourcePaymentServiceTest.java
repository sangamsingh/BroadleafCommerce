/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.broadleafcommerce.vendor;

import java.util.Currency;
import java.util.Locale;

import javax.annotation.Resource;

import org.broadleafcommerce.test.BaseTest;
import org.broadleafcommerce.util.money.Money;
import org.broadleafcommerce.vendor.cybersource.service.CyberSourcePaymentService;
import org.broadleafcommerce.vendor.cybersource.service.CyberSourceServiceManager;
import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourceBillingRequest;
import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourceCardRequest;
import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourceCardResponse;
import org.broadleafcommerce.vendor.cybersource.service.message.CyberSourceItemRequest;
import org.broadleafcommerce.vendor.cybersource.service.type.CyberSourceMethodType;
import org.broadleafcommerce.vendor.cybersource.service.type.CyberSourceServiceType;
import org.broadleafcommerce.vendor.cybersource.service.type.CyberSourceTransactionType;
import org.springframework.test.annotation.Rollback;
import org.testng.annotations.Test;

public class CyberSourcePaymentServiceTest extends BaseTest {

    @Resource
    private CyberSourceServiceManager serviceManager;

    @Test(groups = { "testSuccessfulCyberSourceCCPayment" })
    @Rollback(false)
    public void testSuccessfulShippingCalc() throws Exception {
        if (serviceManager.getMerchantId().equals("?")) {
            return;
        }
        
        /*CyberSourceCardRequest cardRequest = new CyberSourceCardRequest();
        cardRequest.setTransactionType(CyberSourceTransactionType.AUTHORIZE);
        cardRequest.setServiceType(CyberSourceServiceType.PAYMENT);
        cardRequest.setMethodType(CyberSourceMethodType.CREDITCARD);
        cardRequest.setCurrency(Currency.getInstance(Locale.US).getCurrencyCode());
        
        CyberSourceBillingRequest billingRequest = new CyberSourceBillingRequest();
        billingRequest.setCity("Mountain View");
        billingRequest.setFirstName("John");
        billingRequest.setLastName("Doe");
        billingRequest.setPostalCode("94043");
        billingRequest.setIpAddress("10.7.111.111");
        billingRequest.setState("CA");
        billingRequest.setStreet1("1295 Charleston Road");
        billingRequest.setCountry("US");
        billingRequest.setEmail("null@cybersource.com");
        
        cardRequest.setBillingRequest(billingRequest);
        
        CyberSourceItemRequest itemRequest1 = new CyberSourceItemRequest();
        itemRequest1.setDescription("First Item");
        itemRequest1.setId(1L);
        itemRequest1.setQuantity(2L);
        itemRequest1.setShortDescription("firstItem");
        itemRequest1.setUnitPrice(new Money(12.34));
        
        cardRequest.getItemRequests().add(itemRequest1);
        
        CyberSourceItemRequest itemRequest2 = new CyberSourceItemRequest();
        itemRequest2.setDescription("Second Item");
        itemRequest2.setId(2L);
        itemRequest2.setQuantity(1L);
        itemRequest2.setShortDescription("secondItem");
        itemRequest2.setUnitPrice(new Money(56.78));
        
        cardRequest.getItemRequests().add(itemRequest2);
        
        cardRequest.setAccountNumber("4111111111111111");
        cardRequest.setExpirationMonth(12);
        cardRequest.setExpirationYear(2020);
        
        CyberSourcePaymentService service = (CyberSourcePaymentService) serviceManager.getValidService(cardRequest);
        CyberSourceCardResponse response = (CyberSourceCardResponse) service.process(cardRequest);

        assert(response.getAuthResponse().getApprovedAmount().doubleValue() > 0D);
        */
    }

}