package projecteagenda;

import java.io.*;
import Modelo.*;
import java.util.*;

/**
 *
 * @author linusdufol
 */
public class ProjecteAgenda {

    private static Peticio peticio;
    private static Data data;
    private static Calendari calendar;
    private static String[] hola;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File m0 = new File("/Users/linusdufol/Documents/workspace/ProjecteAgenda/src/Archivos/config.txt");
        String m1 = "/Users/linusdufol/Documents/workspace/ProjecteAgenda/src/Archivos/peticions.txt";
        String m2 = "/Users/linusdufol/Documents/workspace/ProjecteAgenda/src/html/index.html";
        String m3 = "log.txt";
        try (
                //Utilitzem BufferReader per llegir l'arxiu Peticio.txt   
                BufferedReader readPeticio = new BufferedReader(new FileReader(m1));
                //Utilitzem BufferReader per llegir l'arxiu config.txt 
                BufferedReader config = new BufferedReader(new FileReader(m0));
                //Utilitzem BufferWriter per escriure en l'arxiu index.txt 
                BufferedWriter index = new BufferedWriter(new FileWriter(m2, true));
                //Utilitzem BufferWrite per escriure en l'arxiu log.txt     
                BufferedWriter log = new BufferedWriter(new FileWriter(m3, true))) {
        
        ArrayList<Peticio> ArrayObjectes = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Data> arrayData = new ArrayList<>();
        String linia;
        
        //Creem l'array d'objectes peticio
            while ((linia = readPeticio.readLine()) != null) {
                //System.out.println(linia);
                String[] tokens = linia.split(" ");
                peticio = new Peticio(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);
                ArrayObjectes.add(peticio);
                //peticio.print();
            }
            String linia2;
            /*********************************************
             * **************** ARRAY SALES ***************
             *********************************************/
            ArrayList<String> Sales = new ArrayList<>();
            Iterator iter = ArrayObjectes.iterator();
            while (iter.hasNext()) {
                peticio = (Peticio) iter.next();
                Sales.add(peticio.getNomReuni());
            }
            for(int i = 0; i <Sales.size(); i++){
            //System.out.println(Sales.get(i));
            }
            ArrayList<String> dia = new ArrayList<>();
        dia.add("Dilluns");
        dia.add("Dimarts");
        dia.add("Dimecres");
        dia.add("Dijous");
        dia.add("Divendres");
        dia.add("Disapte");
        dia.add("Diumenge");
            
            /*********************************************
             * **************** ARRAY DIES ***************
             *********************************************/
            String diesFinals= "";
            ArrayList<String> Dies = new ArrayList<>();
            ArrayList<String> finalyDies = new ArrayList<>();
            Iterator iter2 = ArrayObjectes.iterator();
            String name = "";
            String[] ArrayDies = null;
            while (iter2.hasNext()) {
                peticio = (Peticio) iter2.next();
                Dies.add(peticio.getDia());
            }
            for (int i = 0; i < Dies.size(); i++) {
                //System.out.println(Dies.get(i));//LLETRES SENSE SPLIT
                ArrayDies = Dies.get(i).split("");
                for (int x = 0; x < ArrayDies.length; x++) {
                    name = ArrayDies[x];
                    System.out.println(name);//LLETRES SPLITADES
                    System.out.println(peticio.getDies(name.toString()));//DIA RELACIONAT AMB LLETRA SPLITEJADA
                    finalyDies.add(peticio.getDies(name));
                    System.out.println("--------------------");
                    //System.out.println(finalyDies.get(x));
                }
            }
            
            
            
            for(int i = 0; i < Sales.size(); i++){
                //System.out.println("");
                Sales.get(i);
            }
            
            
        String  h = "";
        
            h += "<!doctype html>\n"
                    + "<html>\n"
                    + "<head>\n"
                    + "    <title>AGENDA</title>\n"
                    + "\n"
                    + peticio.css()
                    + "</head>\n"
                    + "<body>\n"
                    + "    <h1></h1>\n"
                    + "    <table width=\"80%\" align=\"center\" >\n"
                    + "    <div id=\"head_nav\">\n"
                    + "    <h1> + mes.get(foo) + </h1>"
                    + "    <h1></h1>"
                    + "    <tr>\n"
                    + "        <th>Hora</th>\n"
                    + "        <th>" + dia.get(0) + "</th>\n"
                    + "        <th>" + dia.get(1) + "</th>\n"
                    + "        <th>" + dia.get(2) + "</th>\n"
                    + "        <th>" + dia.get(3) + "</th>\n"
                    + "        <th>" + dia.get(4) + "</th>\n"
                    + "        <th>" + dia.get(5) + "</th>\n"
                    + "        <th>" + dia.get(6) + "</th>\n"
                    + "    </tr>\n"
                    + "</div>  \n"
                    + "\n"
                    + "    <tr>\n"
                    + "        <th>00.00-01.00</th>\n"
                    + "        \n"
                    + "            <td>" + Sales.get(0) +  "</td>\n"
                    + "            <td>" + Dies.get(0) +"</td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "\n"
                    + "    <tr>\n"
                    + "        <th>01.00-02.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Chemestry-2</td>\n"
                    + "            <td>Physics-1</td>\n"
                    + "            <td>Hindi</td>\n"
                    + "            <td>English</td>\n"
                    + "            <td>Soft Skill</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "\n"
                    + "    <tr>\n"
                    + "        <th>02.00-03.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>English</td>\n"
                    + "            <td>Math-1</td>\n"
                    + "            <td>Chemistry</td>\n"
                    + "            <td>Physics</td>\n"
                    + "            <td>Chem.Lab</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "\n"
                    + "    <tr>\n"
                    + "        <th>03.00-04.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Sports</td>\n"
                    + "            <td>English</td>\n"
                    + "            <td>Computer Lab</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "\n"
                    + "    <tr>\n"
                    + "        <th>04.00-05.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>05.00-06.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>06.00-07.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>07.00-08.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>08.00-09.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>10.00-11.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>11.00-12.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>12.00-13.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>13.00-14.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>14.00-15.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>15.00-16.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>16.00-17.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>17.00-18.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>18.00-19.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>19.00-20.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>20.00-21.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>21.00-22.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>22.00-23.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "    <tr>\n"
                    + "        <th>23.00-00.00</td>\n"
                    + "        \n"
                    + "            <td></td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td>Header</td>\n"
                    + "            <td></td>\n"
                    + "        </div>\n"
                    + "    </tr>\n"
                    + "    \n"
                    + "</table>\n"
                    + "";
        
            System.out.println("FUNCIONA");
            index.write(h);
            //log.write("");
            index.close();
            log.close();
        }
    }
}
