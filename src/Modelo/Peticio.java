package Modelo;

import java.util.*;

public class Peticio {

    private String reunio;
    private String sala;
    private String dataInici;
    private String dataFinal;
    private String dia;
    private String hora;

    public Peticio(String nomReuni, String sala, String dataInici, String dataFinal, String dia, String hora) {
        this.reunio = nomReuni;
        this.sala = sala;
        this.dataInici = dataInici;
        this.dataFinal = dataFinal;
        this.dia = dia;
        this.hora = hora;
    }

    Peticio() {
    }

    public String getNomReuni() {
        return reunio;
    }

    public void setNomReuni(String nomReuni) {
        this.reunio = nomReuni;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDataInici() {
        return dataInici;
    }

    public void setDataInici(String dataInici) {
        this.dataInici = dataInici;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDia() {
        return dia;
    }

    public String getDies(String a) {
        HashMap<String, String> dia;
        dia = new HashMap<String, String>();
        dia.put("L", "Dilluns");
        dia.put("M", "Dimarts");
        dia.put("C", "Dimecres");
        dia.put("J", "Dijous");
        dia.put("V", "Divendres");
        dia.put("S", "Disapte");
        dia.put("G", "Diumenge");
        String value = dia.get(a);
        //System.out.println(value);
        return value;
    }
    
    public void diesSetmana(){
        ArrayList<String> dies = new ArrayList();
    }
    
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void print() {
        System.out.println(getNomReuni());
        System.out.println(getSala());
        System.out.println(getDataInici());
        System.out.println(getDataFinal());
        System.out.println(getDia());
        System.out.println(getHora());
    }

    public void  dies2() {
        ArrayList<String> dia = new ArrayList<>();
        dia.add("Dilluns");
        dia.add("Dimarts");
        dia.add("Dimecres");
        dia.add("Dijous");
        dia.add("Divendres");
        dia.add("Disapte");
        dia.add("Diumenge");
        
    }

    public String css() {
        String h = "";
        h = "<style type=\"text/css\">\n"
                + "    body\n"
                + "    {\n"
                + "        font-family: arial;\n"
                + "    }\n"
                + "\n"
                + "    th,td\n"
                + "    {\n"
                + "        margin: 0;\n"
                + "        text-align: center;\n"
                + "        border-collapse: collapse;\n"
                + "        outline: 1px solid #e3e3e3;\n"
                + "    }\n"
                + "\n"
                + "    td\n"
                + "    {\n"
                + "        padding: 5px 10px;\n"
                + "    }\n"
                + "\n"
                + "    th\n"
                + "    {\n"
                + "        background: #666;\n"
                + "        color: white;\n"
                + "        padding: 5px 10px;\n"
                + "    }\n"
                + "\n"
                + "    td:hover\n"
                + "    {\n"
                + "        cursor: pointer;\n"
                + "        background: #666;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    </style>\n";
        return h;
    }

}
