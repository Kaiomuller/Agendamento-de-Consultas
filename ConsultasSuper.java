public class ConsultasSuper {
    private String data;
    private String hospital;
    private char turno;
    
    public ConsultasSuper(String Data, String Hospital, char Turno)
    {
        this.data = Data;
        this.hospital = Hospital;
        this.turno = Turno;

    }

    //Metodos get(retorna)

    public String getData(){
        return data;        
    }
    
    public String getHospital(){
        return hospital;        
    }
    
    public char getTurno(){
        return turno;        
    }

    //metodos set(editavel)

    public void setData(String data){
        this.data = data;
    }
    
    public void sethospital(String hospital){
        this.hospital = hospital;
    }
    
    public void setTurno( char turno){
        this.turno = turno;
    }

    //Metdo exibe dados

    public void exibeDados()
    {
        System.out.println("Aqui esta a data da consulta: "+ data);
        System.out.println("Aqui esta o hospital da consulta: "+ hospital);
        System.out.println("Aqui esta o turno da consulta: "+ turno);

    }
}
