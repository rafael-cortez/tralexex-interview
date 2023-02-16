package br.com.confidencecambio.javabasico.models;

public abstract class BasicData {
    public String fullName;


    public BasicData(String fullName) {
        if (fullName.isBlank() || fullName.isEmpty()) {
            throw new IllegalArgumentException("fullName cannot be empty or null");
        }
        this.fullName = fullName.trim();
    }
    public String getFullName(){
        return this.fullName;
    }
    public String getFirstName(){
        return this.fullName.split(" ")[0];
    }

    public String getLastName(){
        String[] nameSplit =  this.fullName.split(" ");
        return nameSplit[nameSplit.length - 1];
    }

    public String getUpperCaseName(){
        return this.fullName.toUpperCase();
    }
    public String getNameAbbreviated(){
        String[] nameSplit =  this.fullName.split(" ");
        for (int i = 1; i < nameSplit.length - 1; i++){
            char[] ch = new char[1];
            nameSplit[i] = nameSplit[i].charAt(0) + ".";
            }
        return String.join(" ", nameSplit);
    }
}
