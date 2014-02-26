package practica2;

public class Practica2 {
  
   
    public static void main(String[] args) {
    
        String varString;
        int varInt=3;
        float varFloat=Float.parseFloat(varInt+"");

        int vector[]=new int [6];
    
        vector[2]=4;
    
    
    /////////////////////////////////////////////
    ejemplo varEjem = new ejemplo(2);
        varEjem.metodoArtimetico();
        
        if(varEjem.aux<10){
        System.out.println("aux es menor que 10");
        
       }
        
       for(varInt=0;varInt>10;varInt++){
        System.out.println("varInt vale"+varInt);
       
       } 
        while(varInt<=10){
        System.out.println("varInt vale"+varInt);
        varInt--;
        }
       
    }
    
}
 class ejemplo{
    int aux;
    
    ejemplo(int aux){
        this.aux=aux;
    }
    public void metodoArtimetico(){
    aux=aux*2;
    }
 }
    
    