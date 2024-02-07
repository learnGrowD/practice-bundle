package com.fastcampuspay.banking;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.fastcampuspay.common")
public class BankingConfig {
    //componentScan을 통해서 common의 component를 모두 빈으로 등록을 한다.

    //모두 bean으로 등록이 되어서 Aspect를 통해해서 log를 수집한다.
}

