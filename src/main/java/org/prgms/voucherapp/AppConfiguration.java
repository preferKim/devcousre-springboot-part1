package org.prgms.voucherapp;

import org.prgms.voucherapp.configuration.YamlPropertiesFactory;
import org.prgms.voucherapp.order.Order;
import org.prgms.voucherapp.voucher.Voucher;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = {Order.class, Voucher.class})
//@PropertySource("application.properties")
@PropertySource(value = "application.yaml", factory = YamlPropertiesFactory.class)
@EnableConfigurationProperties
// basePackageClasses: 해당 클래스가 속해있는 패키지 기준으로 Scan
public class AppConfiguration { // 최상위 폴더에 있을때 ComponentScan과 관련하여 오류가 안 난다.

}
