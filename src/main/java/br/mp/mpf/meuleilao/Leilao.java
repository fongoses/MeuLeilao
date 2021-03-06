package br.mp.mpf.meuleilao;

import java.util.Date;
import java.util.Set;

public class Leilao {

	private Long id;

	private String nome;

	private Item item;

	private Set<Lance> lances;

	private Date dataInicio;

	private Date dataFim;

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

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Set<Lance> getLances() {
		return lances;
	}

	public void setLances(Set<Lance> lances) {
		this.lances = lances;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Leilao other = (Leilao) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (item == null) {
			if (other.item != null) {
				return false;
			}
		} else if (!item.equals(other.item)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Leilao [");
		if (id != null) {
			builder.append("id=");
			builder.append(id);
			builder.append(", ");
		}
		if (nome != null) {
			builder.append("nome=");
			builder.append(nome);
			builder.append(", ");
		}
		if (dataInicio != null) {
			builder.append("dataInicio=");
			builder.append(dataInicio);
			builder.append(", ");
		}
		if (dataFim != null) {
			builder.append("dataFim=");
			builder.append(dataFim);
		}
		builder.append("]");
		return builder.toString();
	}

}
