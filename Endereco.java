/* Programação Orientada a Objetos - N12A (2019_01)
   Alunos - Gabriela dos Reis Bueno   - RA:1771078
            João Marcel Nantes Moreno - RA:2100398
            Luiz Felipe Moralez Amud  - RA:1884921
*/ // Classe Endereco

public class Endereco
{
    // Atributos

    private String rua;
    private int numero;
	private int cep;
	private String cidade;
    private String estado;
    
    // Metodo Construtor / Criar

	public Endereco (String rua, int numero, int cep, String cidade, String estado)
	{
        this.rua = rua;
        this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public static Endereco criar()
	{
        String rua;
        int numero;
		int cep;
		String cidade;
		String estado;

		System.out.printf("\n - Insira o nome da rua:\n - ");
		rua = Leitura.lerString();

		System.out.printf("\n - Insira o numero do local:\n - ");
        numero = Leitura.lerInt();
        
        System.out.printf("\n - Insira o seu CEP:\n - ");
		cep = Leitura.lerInt();

		System.out.printf("\n - Insira qual a cidade:\n - ");
		cidade = Leitura.lerString();

		System.out.printf("\n - Insira qual o estado:\n - ");
		estado = Leitura.lerString ();

		return new Endereco(rua, numero, cep, cidade, estado);
    }
    
    // Metodos

	public String getRua()
	{
		return this.rua;
	}

	public void setRua(String rua)
	{
		this.rua = rua;
    }
    
    public int getNumero()
    {
        return this.numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

	public int getCep()
	{
		return this.cep;
	}

	public void setCep(int cep)
	{
		this.cep = cep;
	}

	public String getCidade()
	{
		return this.cidade;
	}

	public void setCidade(String cidade)
	{
		this.cidade = cidade;
	}

	public String getEstado ()
	{
		return this.estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
    }
    
    // Metodo toString

	public String toString()
	{
		return "\n - Endereco:\n" + " - Rua: " + this.rua + "\n" + " - Numero: " + this.numero + "\n" + " - CEP: " + this.cep + "\n" + " - Cidade: " + this.cidade + "\n" + " - Estado: " + this.estado;
	}

}