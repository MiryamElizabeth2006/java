package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaDeModificacion;
	private ArrayList<Contacto> correctos = new ArrayList<Contacto>();
	private ArrayList<Contacto> incorrectos = new ArrayList<Contacto>();
	
	public Directorio() {
		this.contactos = new ArrayList<>();
		this.fechaDeModificacion = new Date();
	}
	
	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) != null) {
            return false;
        }

        contactos.add(contacto);
        fechaDeModificacion = new Date();
        return true;
	}
	
	public Contacto buscarPorCedula(String cedula) {
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null;
	}
	
	public String consultarUltimaModificacion() {
        SimpleDateFormat formateado = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formateado.format(fechaDeModificacion);
    }
	
	public int contarPerdidos() {
        int conteo = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() == null) {
                conteo++;
            }
        }
        return conteo;
    }
	
	public int contarFijos() {
		int conteo = 0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
					conteo++;
				}
			}
		}
		return conteo;
	}
	
	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				incorrectos.add(contacto);
			} else {
				correctos.add(contacto);
			}
		}
		contactos.clear();
	}
	
	

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	
	public Date getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	
	
}
