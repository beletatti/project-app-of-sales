package com.java.plus.ionic.project.service;

import org.springframework.mail.SimpleMailMessage;

import com.java.plus.ionic.project.domain.Pedido;


public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
}