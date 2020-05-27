public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] lista = {3,2,1,9};
        
        int swap =0;
        for(int i=0;i<=lista.length-1;i++){
            for(int j=0;j<=lista.length-1;j++){
             
                if(lista[i]>lista[j]){
                    printArray(lista);
                    swap = lista[j];
                    lista[j]=lista[i];
                    lista[i]=swap;              
                }
            
            }
        }
        
        
    }
    
    public static void printArray(int[] array)
    {
        String arrayStr = "";
        for(int j=0;j<=array.length-1;j++){
            arrayStr+=array[j]+",";
            
        }
        
        System.out.println(arrayStr);
        
    }
}
