public class Nasabah{
	public static void main(String[] args) {
		Bank nsb1 = new Bank();
		
		nsb1.namaNasabah("Pricilia Dwi Widyaastari");
		nsb1.addSaldo(80);
		nsb1.tarikSaldo(15, "Terima kasih sudah melakukan penarikan");
		nsb1.showInfo();
	}
}