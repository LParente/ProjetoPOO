package historia;

public class Acontecimento extends RandomEvent{
	
	private String descricao;
	private String op1;
	private String op2;
	
	public Acontecimento(String descricao) {
		this.descricao = descricao;
	}
	
	public Acontecimento(String descricao, String op1, String op2) {
		this.descricao = descricao;
		this.op1 = op1;
		this.op2 = op2;
	}
	
	public void desenrolar(int dificuldade) {
		RandomEvent.getSuccess(dificuldade, this.getOp1(), this.getOp2());
	}
	
	public String getOp1() {
		return op1;
	}
	
	public String getOp2() {
		return op2;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
