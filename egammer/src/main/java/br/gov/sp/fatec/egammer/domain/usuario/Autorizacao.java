package br.gov.sp.fatec.egammer.domain.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "AUTORIZACAO")
public class Autorizacao implements GrantedAuthority {

	private static final long serialVersionUID = -7578937961979778761L;

	@Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "AUT_ID")
	private Long id;
    
    @Column(name = "AUT_NOME", unique=true, length = 20, nullable = false)
    private String nome;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getAuthority() {
		return this.nome;
	}
	
	public void setAuthority(String authority) {
		this.nome = authority;
	}

}
