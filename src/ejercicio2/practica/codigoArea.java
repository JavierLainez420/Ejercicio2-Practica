
package ejercicio2.practica;

public class codigoArea {
    String Ccomputos,Biblioteca,zonaVerd,lab,cancha;
public codigoArea(String Ccomputos, String Biblioteca, String zonaVerd, String lab, String cancha) {
        this.Ccomputos = Ccomputos;
        this.Biblioteca = Biblioteca;
        this.zonaVerd = zonaVerd;
        this.lab = lab;
        this.cancha = cancha;
    }

    public codigoArea() {
    }

    public String getCcomputos() {
        System.out.println("el codigo de los computos es us01");
        return Ccomputos;
    }

    public void setCcomputos(String Ccomputos) {
        this.Ccomputos = Ccomputos;
    }

    public String getBiblioteca() {
        System.out.println("el codigo de la biblioteca es 567");
        return Biblioteca;
    }

    public void setBiblioteca(String Biblioteca) {
        this.Biblioteca = Biblioteca;
    }

    public String getZonaVerd() {
        System.out.println("el codigo de la zona verde es v345");
        return zonaVerd;
    }

    public void setZonaVerd(String zonaVerd) {
        this.zonaVerd = zonaVerd;
    }

    public String getLab(){
        System.out.println("el codigo de laboratorio es L098");
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getCancha() {
        System.out.println("el codigo de la cancha es C865");
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    
}
