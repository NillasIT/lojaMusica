package lojaMusica.classes;

public class DVD extends Produto {
    private float duration;

    public DVD(int code, String name, float price, float duration) {
        super(code, name, price);
        this.setDuration(duration);;
    }

    @Override
    public void detalhesProduto() {
        super.detalhesProduto();
        System.out.println("Duração: " + this.getDuration());
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
