package bank;

public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void simpanUang(int jumlah){
        saldo=saldo+jumlah;
    }

    public boolean ambilUang(int jumlah){
        if (jumlah<saldo) {
            saldo=saldo-jumlah;
            return true;            
        }
        return false;
    }

    public boolean transfer(Tabungan rek1, int jumlah){
        if(jumlah<saldo){
            //saldo=saldo-jumlah;
            rek1.saldo=rek1.saldo+jumlah;
            this.saldo=this.saldo-jumlah;
            return true;
        }
        // if(ambilUang(jumlah)==true){
        //     System.out.println(saldo);

        //     return true; 
        // }
        return false;
    }

    @Override
    public String toString() {
        return ""+saldo;
    }
}
