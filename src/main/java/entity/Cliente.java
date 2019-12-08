package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", length = 100)
	private String nome;

	@Column(name = "cpf", length = 11)
	private String cpf;

	public Cliente() {

	}

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public boolean equals(Object v) {
		boolean retVal = false;

		if (v instanceof Cliente) {
			Cliente ptr = (Cliente) v;
			retVal = (ptr.id.longValue() == this.id) &&
					(ptr.cpf.equals(this.cpf)) &&
					(ptr.nome.equals(this.nome));
		}

		return retVal;
	}

}
