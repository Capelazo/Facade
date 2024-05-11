import java.util.Scanner;

public class Combo {
    private Sanduiche sanduiche;
    private Sobremesa sobremesa;
    private Bebida bebida;

    public void criarCombo(String tipoSanduiche, String tipoSobremesa, String tipoBebida) {
        this.sanduiche = new Sanduiche(tipoSanduiche);
        this.sobremesa = new Sobremesa(tipoSobremesa);
        this.bebida = new Bebida(tipoBebida);
    }

    public void mostrarItensCombo() {
        System.out.println("Combo:");
        System.out.println("Sanduíche: " + sanduiche.getTipo());
        System.out.println("Sobremesa: " + sobremesa.getTipo());
        System.out.println("Bebida: " + bebida.getTipo());
    }
}

class Sanduiche {
    private String tipo;

    public Sanduiche(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Sobremesa {
    private String tipo;

    public Sobremesa(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Bebida {
    private String tipo;

    public Bebida(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Selecione seu combo");
        System.out.println("1. Combo Master");
        System.out.println("2. Super Combo");
        System.out.print("Sua escolha: ");
        Scanner input = new Scanner(System.in);
        int tipo = input.nextInt();
        
        Combo combo = new Combo();
        
        if (tipo == 1) {
            combo.criarCombo("Combo Master", "Sobremesa A", "Bebida X");
        } else if (tipo == 2) {
            combo.criarCombo("Super Combo", "Sobremesa B", "Bebida Y");
        } else {
            System.out.println("Escolha inválida!");
            return;
        }
        
        combo.mostrarItensCombo();
    }
}
