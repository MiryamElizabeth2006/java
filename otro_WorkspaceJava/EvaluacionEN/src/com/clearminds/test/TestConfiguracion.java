package com.clearminds.test;

import com.clearminds.maquina.Maquinadulces;

public class TestConfiguracion {

	public static void main(String[] args) {
		Maquinadulces maquina=new Maquinadulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		maquina.mostrarConfiguracion();

	}

}
