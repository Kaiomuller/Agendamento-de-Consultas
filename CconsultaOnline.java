public class CconsultaOnline extends ConsultasSuper{

    private String nome;
    private String endereco;
    private int idade;
    private String telefone;
    private String dataDeNasc;
    private String cpf;

    public CconsultaOnline (String Data, String Hospital, char Turno, String nome ,String endereco,int idade,String telefone,String dataDeNasc,String cpf )
    {
        super(Data, Hospital,Turno);
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.telefone = telefone;
        this.dataDeNasc = dataDeNasc;
        this.cpf = cpf;
    }
        //metodos get(editavel)
        
		
        public String getNome(){
            return nome;        
        }

        public String getEndereco(){
            return endereco;        
        }
        
        public int getIdade(){
            return idade;        
        }
        
        public String getTelefone(){
            return telefone;        
        }
        
        public String getDataDeNasc(){
            return dataDeNasc;        
        }
        
        public String getCpf(){
            return cpf;        
        }

        //metodo set(editavel)

        public void setNome(String nome){
            this.nome = nome;        
        }

        public void setEndereco(String endereco){
            this.endereco = endereco;        
        }
        
        public void setIdade(int idade){
            this.idade = idade;        
        }
        
        public void setTelefone(String telefone){
            this.telefone = telefone;        
        }
        
        public void setDataDeNasc(String dataDeNasc){
            this.dataDeNasc = dataDeNasc;        
        }
        
        public void setCpf(String cpf){
            this.cpf = cpf;        
        }

        //Metdo exibe dados

        public void exibeDados()
    {
        super.exibeDados();
        System.out.println("Seu nome: "+ nome );
        System.out.println("Seu endereco: "+ endereco );
        System.out.println("Sua idade: "+ idade );
        System.out.println("Seu telefone: "+ telefone );
        System.out.println("Sua data de nascimento: "+ dataDeNasc );
        System.out.println("Seu cpf: "+ cpf );
        
    }


}

    

    
