package lojaMusica.classes;

public class Produto {
    private int code;
    private String name;
    private float price;

    public Produto(int code, String name, float price) {
        this.setCode(code);
        this.setName(name);
        this.setPrice(price);
    }

    public void detalhesProduto() {
        System.out.println("Nome: " + this.getName());
        System.out.println("Código: " + this.getCode());
        System.out.println("Preço: " + this.getPrice());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
}
