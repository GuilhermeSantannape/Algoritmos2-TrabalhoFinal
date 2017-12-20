package datastructures;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;


import comparators.SearchByName;
import model.Aluno;
import predicates.NamePredicate;

public class ListaEncadeada<T> {
	
	 private int Tamanho;
	 Aluno aluno = new Aluno();
	 
	
	private T dado;
	private No<T> head=null; 
	private No<T> tail=null; 
	 
	
	public void append(T dado)
	{
		No<T> novo = new No<>(dado);
		if (ListVazia()) {
			head = novo;
			tail = novo;
		} else {
			novo.setAnterior(tail);
			tail.setProximo(novo);
			tail=novo;
		}
		
		Tamanho++;
	}		
		
	

	 private boolean ListVazia () { // lista vazia
			return (this.head==null);
			
		}
	
	private static class No<T> {
		private T dado;
		private No<T> anterior;
		private No<T> proximo;
		
		
		public No<T> getAnterior() {
			return anterior;
		}
		public void setAnterior(No<T> anterior) {
			this.anterior = anterior;
		}
		public T getDado() {
			return dado;
		}
		public void setDado(T dado) {
			this.dado = dado;
		}
		public No<T> getProximo() {
			return proximo;
		}
		public void setProximo(No<T> proximo) {
			this.proximo = proximo;
		}
		public No(T dado) {
			this.dado = dado;
			this.proximo = null;
			this.anterior = null;
		}
	}
	public void addFirst(T dado) {
	
	
	}
	public T search(T key, Comparator<T> cmp)
	{
		return null;
	}
	public void printObjects()
	{
		
	}
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo)
	{ListaEncadeada<Aluno> alunos = new ListaEncadeada<>();
	Scanner sc;
	try{
		sc = new Scanner(new File("data/alunos.csv"));
		sc.useDelimiter("[,\n]");
	} catch (FileNotFoundException e) {
		System.out.println("Arquivo não localizado");
		return null;
	}
	while (sc.hasNext()) {
		 Aluno aluno = new Aluno();
		aluno.setMatricula(sc.next());
		aluno.setNome(sc.next());
		aluno.setEmail(sc.next());
		aluno.setIdade(sc.nextInt());
		aluno.setSexo(sc.next());
		aluno.setEmpresa(sc.next());
		aluno.setCidade(sc.next());
		
		alunos.append(aluno);
	}

	sc.close();
	
	return alunos;
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public  void IniciaListaSimples() {// esvazia lista
		this.prim=null;
		this.ult=null;
		this.QuantNO=0;
		}
	 
	 
	 public No getPrim() { //cabaça da lista
			return prim;
		}

	 public No getUlt() { //cauda da lista
			return ult;
		}
	 
	

	public void setPrim(No prim) {
		this.prim = prim;
	}

	public void setUlt(No ult) {
		this.ult = ult;
	}

	public int getQuantNO() {
		return QuantNO;
	}

	public void setQuantNO(int quantNO) {
		QuantNO = quantNO;
	}
	
	public void inseririPrimeiro(Aluno p) {
		No novoNo = new No(p);
			if(this.ListVazia()) {
			this.ult=novoNo;
		}
		novoNo.setProx(this.prim);
		this.prim =novoNo;
		this.QuantNO++;
	}
	
	public void InserirUltimo(Aluno p) {
		No novoNo = new No(p);
		if(ListVazia()) {
			this.prim=novoNo;}
		else {
			this.ult.setProx(novoNo);}
		
		this.ult=novoNo;
		this.QuantNO++;
	}
	
	public boolean removerNo(String nome) {
		No atual = this.prim;
		No ant = null;
		if(ListVazia()) {
			return false;}
		else {
			while((atual!=null) && (!atual.getP().getNome().equals(nome))){
				ant = atual;
				atual =atual.getProx();
			
				if(atual ==this.getPrim()) {
					if(this.prim==this.ult) {
						this.ult=null;
					}
					this.prim=this.prim.getProx();
				}else {
					if(atual == this.ult) {
				} this.ult=ant;
				ant.setProx(atual.getProx());
			}
		}
		
		

}
		this.QuantNO--;
		return false;
}
	

	*/
	
}
