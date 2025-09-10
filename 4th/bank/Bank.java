package bank;

public class Bank {
    Nasabah dataNasabah[];
    int jumlahNasabah;

    public Bank(){
        dataNasabah = new Nasabah[10];
        jumlahNasabah = 0;
    }

    public Bank(int n){
        dataNasabah = new Nasabah[n];
        jumlahNasabah = 0;        
    }

    public boolean tambahNasabah(Nasabah nsb){
        if(jumlahNasabah<dataNasabah.length){
            dataNasabah[jumlahNasabah] = nsb;
            jumlahNasabah++;
            return true;
        }
        return false;
    }

    public boolean tambahNasabah(String nama, int saldo){
        if(jumlahNasabah<dataNasabah.length){
            dataNasabah[jumlahNasabah] = new Nasabah(nama, new Tabungan(saldo));
            jumlahNasabah++;
            return true;
        }
        return false;
    }

    public Nasabah[] searchNasabah(String nama){
        Nasabah[] res = new Nasabah[dataNasabah.length];
        int index = 0;
        for (int i = 0; i < dataNasabah.length; i++) {
            Nasabah temp = dataNasabah[i];
            if (temp.getNama().equalsIgnoreCase(nama)) {
                res[index] = temp;
                index++;
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String str = "Data nasabah: \n";
        for(int i = 0; i<jumlahNasabah;i++){
            str = str + dataNasabah[i]+"\n";
        }
        return str;
    }

    public Nasabah getNasabah(int index){
        return dataNasabah[index];
    }
}
