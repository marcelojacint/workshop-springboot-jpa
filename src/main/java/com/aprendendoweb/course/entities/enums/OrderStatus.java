package com.aprendendoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);

	private int cod;

	private OrderStatus(int cod) {
		this.cod = cod;

	}

	public int getCode() {
		return cod;
	}

	public static OrderStatus valueOf(int cod) {
		for (OrderStatus status : OrderStatus.values()) {
			if (status.getCode() == cod) {
				return status;
			}

		}

		throw new IllegalArgumentException("invalid OrderStatus");
	}
}
