package pesoIdeal;

/**
 *
 * @author Priscila Butzke
 */
public class Peso {
    
    public static void main(String[] args) {
    }    
        private double altura;
        private int sexo;
        private double pesoAtual;
        
        public Peso(){
        }
   

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    
        
    public double calcularPesoIdeal(){
        //Peso ideal para Homens(1): (72.7 * altura) – 58;
       //Peso ideal para Mulheres(2): (62.1 * altura) – 44.7;
       
       
       /* double pesoIdeal=0;
        if(this.sexo == 1){
        pesoIdeal =((72.7 *this.altura)-58);
            
        }else if (this.sexo == 2){
        pesoIdeal =((62.1 * this.altura)-44.7);
            
        }
        return pesoIdeal; */
       
        double pesoIdeal;
        switch (getSexo()){
            case 1: //Homem
                pesoIdeal =(72.7 * this.altura)-58;
                break;
            case 2: //Mulher
                pesoIdeal =(62.1 * this.altura)-44.7;
                break;
            default: //Qualquer n° diferente
                pesoIdeal = 0;
                break;
        }
        return pesoIdeal;
    }    
                          
   
    
    public String verificarPeso(){
    /*“Abaixo do peso” se seu peso atual for menor que o peso ideal -2.
     *Estará “Acima do peso” se seu peso atual for maior que o peso ideal + 2.
     *Caso nenhuma das opções acima for verdadeira, estará no peso ideal. */
       String r1= "";
       
        if (pesoAtual < (calcularPesoIdeal() - 2 )){
            r1 = "Você está abaixo do peso ideal";    
            return r1;
            
        }else if (pesoAtual > (calcularPesoIdeal()+2)){
            r1 = "Você está acima do peso ideal";
            return r1;
        }else {
            r1 = "Vccê está no peso ideal ";
            return r1;
        }    
    }    
      
  
    public String toString(){
        
        String resp,sexo;
        
        if( this.sexo == 2){
            sexo = "Feminino";
        }else {
            sexo = "Masculino";
        }           
   
        resp = " Sexo: " + sexo
            + "\n Altura: " + this.altura
            +" \n Peso Ideal: " +calcularPesoIdeal() 
            +"\n Peso Atual: " + this.pesoAtual 
            +"\n Analise do peso: \n " + verificarPeso();  
        
        return resp;
    }
   
    }
      
    
    
        
        
        
   
    

