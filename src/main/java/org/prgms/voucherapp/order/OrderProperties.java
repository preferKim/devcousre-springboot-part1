package org.prgms.voucherapp.order;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "kdt")
public class OrderProperties implements InitializingBean {

    private String version;

    private Integer minimumOrderAmount;

    private List<String> supportVendors;

    private String description;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(MessageFormat.format("OrderProperties.afterPropertiesSet():  version-> {0}", version));
        System.out.println(MessageFormat.format("OrderProperties.afterPropertiesSet():  minimumOrderAmount-> {0}", minimumOrderAmount));
        System.out.println(MessageFormat.format("OrderProperties.afterPropertiesSet():  supportVouchers -> {0}", supportVendors));
        System.out.println(MessageFormat.format("OrderProperties.afterPropertiesSet():  supportVouchers -> {0}", description));
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getMinimumOrderAmount() {
        return minimumOrderAmount;
    }

    public void setMinimumOrderAmount(Integer minimumOrderAmount) {
        this.minimumOrderAmount = minimumOrderAmount;
    }

    public List<String> getSupportVendors() {
        return supportVendors;
    }

    public void setSupportVendors(List<String> supportVendors) {
        this.supportVendors = supportVendors;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
