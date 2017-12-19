package datastructures;
import model.Aluno;
public class No {
	
	private Aluno Alu;
	private No Prox;
	private No Prev;

	public No getPrev() {
		return Prev;
	}

	public void setPrev(No prev) {
		Prev = prev;
	}

	public No (Aluno pe) {
		this.Alu=pe;
		this.Prox=null;
	}

	public Aluno getP() {
		return Alu;
	}

	public void setP(Aluno p) {
		this.Alu = p;
	}

	public No getProx() {
		return Prox;
	}

	public void setProx(No prox) {
		Prox = prox;
	}
}
