package com.domain.system.demo2.common;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Objects;

/**
 * 系统配置
 */
@Configuration
public class Demo2AppConfig {
	private static final String ENV_TEST = "test";
	private static final String ENV_PRE = "pre";
	private static final String ENV_PRD = "prd";

	@Value("${spring.profiles.active}")
	private String env;

	/**
	 * 是否是TEST环境
	 * 
	 * @return
	 */
	public boolean isTest() {
		return Objects.equals(env, ENV_TEST);
	}

	/**
	 * 是否是PRE环境
	 * 
	 * @return
	 */
	public boolean isPre() {
		return Objects.equals(env, ENV_PRE);
	}

	/**
	 * 是否是PRD环境
	 * 
	 * @return
	 */
	public boolean isPrd() {
		return Objects.equals(env, ENV_PRD);
	}

	public String getEnv() {
		return env;
	}

}
