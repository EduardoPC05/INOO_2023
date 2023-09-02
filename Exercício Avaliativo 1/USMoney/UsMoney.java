public class UsMoney {
    private int dollars;
    private int cents;

    public UsMoney(int d, int c){
        if(d >= 0 && c >= 0){
           int aux = 0;
           while(c > 99){
               aux = c/100;
               c = c % 100;                                  
           }
           this.cents = c;   
           this.dollars = (d + aux);
        }
    }
    public UsMoney plus(UsMoney a){
        UsMoney retorno;
        int n1,n2;

        n1 = this.dollars + a.dollars;
        n2 = this.cents + a.cents;

        retorno = new UsMoney(n1, n2);

        return retorno;
    }
    public String getAll() {
        if(this.cents <= 9){
            return "U$ "+this.dollars+",0"+this.cents;
        }else{
            return "U$ "+this.dollars+","+this.cents;
        }
    }
}
