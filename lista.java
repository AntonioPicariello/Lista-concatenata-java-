public class lista {
    private nodo head ;
    private int counter;
    
    public lista(){
        this.head = null;
        this.counter = 0;
    }
    
    public void InserisciInLista(int val){
       nodo current = this.head;
       nodo prev = null;
        
        nodo temp = new nodo(val);
        
        while(current != null && current.val < temp.val){
            prev = current;
            current = current.next;
         }
         
         if(prev == null){
             temp.next = this.head; 
             this.head = temp;
         }else{
            prev.next = temp;
            temp.next = current;
         }
         
        this.counter++;
    }
    
    public void StampaLista(){
        nodo current = this.head;
        
        System.out.printf("[%d]", this.counter);
        while(current != null){
            System.out.printf("%d -->", current.val);
            current = current.next;
        }
        System.out.printf("null\n"); 
    }
   public void RimuoviDaLista(int val)
    {
        nodo current = this.head;
        nodo prev = null;
        nodo temp = null;

        
        while (current != null && current.val < val) {
            prev = current;
            current = current.next;
        }

        
        if (current == null) {
            System.out.printf("rimuovi(): ELEMENTO %d NON TROVATO\n", val);
            return;
        }

        System.out.printf("rimuovi(): ELEMENTO %d TROVATO\n", val);
        this.counter--;

        
        if (prev == null) {
            System.out.printf("L'elemento da eliminare e' in testa, elimina\n");
            
            this.head = this.head.next;  
            return;
        }

        
        System.out.printf("L'elemento da eliminare non e' in testa, elimina\n");
        prev.next = prev.next.next;
    }
}