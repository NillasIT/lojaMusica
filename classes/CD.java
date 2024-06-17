package lojaMusica.classes;

public class CD extends Produto {
    private int numeroDeFaixas;

    public CD(int code, String name, float price, int numeroDeFaixas) {
        super(code, name, price);
        this.setNumeroDeFaixas(code);
    }

    @Override
    public void detalhesProduto() {
        super.detalhesProduto();
        System.out.println("Número de Faixas: " + this.getNumeroDeFaixas());
    }

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }
}