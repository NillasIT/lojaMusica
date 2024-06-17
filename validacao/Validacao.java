package lojaMusica.validacao;

import java.io.*;

public class Validacao {
    private BufferedReader keyboard;

    public Validacao() {
        keyboard = new BufferedReader(new InputStreamReader(System.in));
    }

    public String validaString(String msg) throws IOException {
        String palavra;
        System.out.print(msg);

        do {
            palavra = keyboard.readLine();
            if (palavra.trim().isEmpty()) {
                System.out.print("Entrada inválida. Por favor tente de novo: ");
            } 
        } while (palavra.trim().isEmpty());
        return palavra;
    }

    public int validarInt(String msg) throws IOException {
        int numero = 0;
        System.out.print(msg);
        boolean isValidNumber = false;

        while (!isValidNumber) {
            String entrada = keyboard.readLine();

            try {
                numero = Integer.parseInt(entrada);
                isValidNumber = true;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor tente de novo: ");
            }
        }
    return numero;
    }

    public float validarFloat(String msg) throws IOException {
        float numero = 0.0f;
        System.out.print(msg);
        boolean isValidNumber = false;

        while (!isValidNumber) {
            String entrada = keyboard.readLine();

            try {
                numero = Float.parseFloat(entrada);
                isValidNumber = true;
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Por favor tente de novo: ");
            }
        }
    return numero;
    }
}
