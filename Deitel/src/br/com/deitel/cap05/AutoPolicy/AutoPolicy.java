package br.com.deitel.cap05.AutoPolicy;

public class AutoPolicy {

    private int accountNumber; // número apolice
    private String makeAndModel; // carro vinculado à apolice
    private String state; // Sigla Estado com 2 letras

    // construtor
    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // método predicado é retornado se o estado tem seguros "sem culpa"
    public boolean isNoFaultState(){
        boolean noFaultState;

        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

    // getters and setters


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
