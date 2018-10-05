public class Bank{
	private int saldo;
	private String notice;
	private String nasabah;
	final int minSaldo = 50;
	final String namaBank = "Bank A";
	public static int noTransaksi = 0;


	public void addSaldo(int addSaldo){
		saldo += addSaldo;
		noTransaksi++;
	}
	public void namaNasabah(String namaNasabah){
		nasabah = namaNasabah;
	}
	public void tarikSaldo(int tarikSaldo){
		if ((saldo - tarikSaldo ) >= minSaldo) {
			saldo -= tarikSaldo;
			noTransaksi++;
		}
		else{
			System.out.println("Saldo anda tidak cukup");
		}
	}

	public void tarikSaldo(int tarikSaldo, String pesan){
		if ((saldo - tarikSaldo ) > minSaldo) {
			saldo -= tarikSaldo;
			noTransaksi++;
			System.out.println("Saldo anda : " +  saldo);
			System.out.println("Pesan : " + pesan);
		}
		else{
			System.out.println("Saldo anda tidak cukup");
		}
	}

	public int getSaldo(){
		return saldo;
	}

	public void showInfo(){
		System.out.println("Nama Bank : "+ namaBank);
		if (nasabah != null) {
			System.out.println("Nama Nasabah :"+ nasabah);
		}
		System.out.println("Sisa Saldo : "+ saldo);
	}


}