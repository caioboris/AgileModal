import br.com.agileModal.beans.*;

public class Main {
    public static void main(String[] args)
    {
        PolicyOwner segurado = new PolicyOwner("Caio Boris", "caio@email.com","2312312362",
                "00000000000001",
                new Phone(55,11,"987623163"),
                new Address("Rua um",1,"São Paulo", "SP","Brasil"),
                new Vehicle("1432br23",
                        new VehicleDimensions(3000,4.5,6),"Caminhão", "Mercedes-Benz"));


        Address localChamado = new Address("Rua dois", 2,"Guarulhos", "SP", "Brasil");

        String descricaoDoOcorrido = "Veículo derrapou na pista molhada e tombou.";

        String[] fotosDoOcorrido = {
          "https://www.hojemais.com.br/imagem/noticia/1000/1000/1580497143_18527.jpg",
          "https://th.bing.com/th/id/OIP.CIcBa-w4PkOFq6s_tg3HmAHaFj?pid=ImgDet&w=800&h=600&rs=1",
          "https://th.bing.com/th/id/R.be1520a044b6b8da660da3f9467ee496?rik=C2k6LpexHQ2WoQ&pid=ImgRaw&r=0"
        };

        Support chamado = new Support(segurado, localChamado, descricaoDoOcorrido );

        chamado.updateImages(fotosDoOcorrido);

    }
}