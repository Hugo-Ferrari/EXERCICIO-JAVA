public class ArCondicionado {
    private boolean ligado;
    private String marca, modelo;
    private int temperatura;

    // construtor sem parametro;
    public ArCondicionado() {
        setTemperatura(0);
        setMarca(""); //não adicionado nada dentro da marca pois estamos usando um construtor sem parametro;
        setModelo("");
        this.ligado = false;
    }

    public void setTemperatura(int t) {
        if (this.ligado) {
            if (t <= 30 && t >= 16) {
                this.temperatura = t;
                System.out.println("temperetura ajustada para " + t + "graus");
            } else {
                System.out.println("temperatura fora da faixa;");
            }
        }
    }

    public void setMarca(String m) {
        if (m.length() >= 3) {
            this.marca = m;
        } else {
            System.out.println(" A marca precisa ter mais de 3 letras ");

        }
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public void ligarAr() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("ar ligado...");
        }
    }

    public void desligarAr() {
        if(this.ligado) {
            this.ligado = false;
            System.out.println("ar desligado..");
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor() && this.ligado) {
            setTemperatura(16);
        }
    }

    private boolean verificarCompressor() {
        if (this.ligado) {
            int verificação = (int) (Math.random() * 10);
            if (verificação < 2) {
                return true;
            }
        } else {
            System.out.println("simulando falha tecnica");
        }
        return false;
    }

    public int getTemperetura() {
        return this.temperatura;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String toString() {
        return "Temperatura: " + getTemperetura() + "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() + (this.ligado ? " \n Ligado" : " \n Desligado");
    }
}
