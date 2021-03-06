package br.banco.lsp;

public class Conta {

	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.cliente = cliente;
	}

	public boolean saca(double valorDoSaque) {
		if (getSaldo() < valorDoSaque) {
			return false;
		} else {
			saldo = saldo - valorDoSaque;
			return true;
		}
	}

	public void deposita(double valorDepositado) {
		saldo = saldo + valorDepositado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void rende() {
		this.saldo *= 1.1;
	}

}
