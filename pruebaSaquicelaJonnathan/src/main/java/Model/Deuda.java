package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Deuda")
public class Deuda {
	
	@Id
	@Column(name="deu_cedula")
	private String deu_cedula;
	
	@Column(name="deu_nombre")
	private String deu_nombre;
	
	@Column(name="deu_consumo")
	private Double deu_consumo;
	
	@Column(name="deu_deuda")
	private Double deu_deuda;

	public String getDeu_cedula() {
		return deu_cedula;
	}

	public void setDeu_cedula(String deu_cedula) {
		this.deu_cedula = deu_cedula;
	}

	public String getDeu_nombre() {
		return deu_nombre;
	}

	public void setDeu_nombre(String deu_nombre) {
		this.deu_nombre = deu_nombre;
	}

	public Double getDeu_consumo() {
		return deu_consumo;
	}

	public void setDeu_consumo(Double deu_consumo) {
		this.deu_consumo = deu_consumo;
	}

	public Double getDeu_deuda() {
		return deu_deuda;
	}

	public void setDeu_deuda(Double deu_deuda) {
		this.deu_deuda = deu_deuda;
	}
	
	
}
