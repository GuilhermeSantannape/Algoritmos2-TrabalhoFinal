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
		No<T> novo = new  No<>(dado);
		if (ListVazia()) {
		
			head=novo;
			tail=novo;
		}else {
			head.setAnterior(novo);
			novo.setProximo(head);
			head=novo;
		}
		Tamanho++;
	
	
	}
	public T search(T key, Comparator<T> cmp) {
		No<T> i = head;
		T obj = null;
		while (i != null) {
		obj = i.getDado();
	if (cmp.compare(key,obj) == 0)
				break;
			i = i.getProximo();
		}
		if (i == null) {
		System.out.println(" Sem informações");
			obj = null;
		}
		
		return obj;
	}
	public void printObjects()
	{	
		 	
		 	No<T> x = head;
		 		while (x != null) {
		 			System.out.println(x.getDado());
		 			x = x.getProximo();
		 		}
	}
	
	public static ListaEncadeada<model.Aluno> loadFromFile(FileReader arquivo){
		 
		  BufferedReader ler = new BufferedReader(arquivo);
			ListaEncadeada<Aluno> Registro = new ListaEncadeada<Aluno>();
			try {
				String linha = ler.readLine();
				
	while(linha != null) {
				
		String[] atributos = linha.split(",");
		Aluno Aluno = new Aluno();
		Aluno.setMatricula(atributos[0]);
		Aluno.setNome(atributos[1]);
		Aluno.setEmail(atributos[2]);				
		Aluno.setIdade(Integer.valueOf(atributos[3]));
		Aluno.setSexo(atributos[4]);
		Aluno.setEmpresa(atributos[5]);
		Aluno.setCidade(atributos[6]);
		Registro.append((Aluno) Aluno);
	System.out.println("  "+Aluno);
		linha = ler.readLine();
				}
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			return Registro;
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
