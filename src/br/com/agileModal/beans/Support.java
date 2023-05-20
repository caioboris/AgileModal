package br.com.agileModal.beans;

public class Support {
    private int id;
    private PolicyOwner policyOwner;
    private Address localization;
    private String description;
    private String[] images;


    public Support(PolicyOwner policyOwner, Address localization, String description) {
        this.policyOwner = policyOwner;
        this.localization = localization;
        this.description = description;
    }

    public void updateImages(String[] images){
        this.images = images;

        analyzeImages(images);
    }
    public void analyzeImages(String[] images) {

        // implementação nesse método da chamada para o processo de DeepLearning e NeuralLink com a
        // ferramenta TensorFlow fazendo a análise das imagens enviadas (vai dar mais trabalho kkkk)

        System.out.println("Iniciando analise de imagens");
    }


    public int getId() {
        return id;
    }


    public PolicyOwner getPolicyOwner() {
        return policyOwner;
    }


    public Address getLocalization() {
        return localization;
    }


    public String getDescription() {
        return description;
    }


    public String[] getImages() {
        return images;
    }




}
