package com.tech552.springbootactuatordemo.monitor;

import java.util.Random;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class DBHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		if(isDBHealthy()) {
			return Health.up().withDetail("External DB svc", "Healthy").build();
		}
		return Health.up().withDetail("External DB svc", "Is Not-Healthy").build();
	}
	
	private boolean isDBHealthy() {
		Random random = new Random();
		return random.nextBoolean();
	}

}
