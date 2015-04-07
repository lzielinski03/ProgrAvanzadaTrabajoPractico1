package persistencia;

import modelo.ItemMenu;
import modelo.Menu;

import java.io.*;
import java.util.*;

public class MenuDB {

    private String menuPrincipalPath = "menuPrincipal.properties";



    public Menu getMenu() {
        Properties prop = new Properties();
        InputStream input = null;
        Menu miMenu = new Menu();
        ItemMenu newItem;

        try {

            if(!checkMenuFile(this.menuPrincipalPath)) {
                this.createDefaultMenu();
            }

            input = new FileInputStream(menuPrincipalPath);

            input.read();

            prop.load(input);

            Enumeration<?> e = prop.propertyNames();
            while (e.hasMoreElements()) {
                String key = (String) e.nextElement();
                String value = prop.getProperty(key);
                newItem = new ItemMenu(key, value);
                //newItem.setId(key);
                // newItem.setDescripcion(value);
                miMenu.addItem(newItem);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return miMenu;
    }

    public void setMenu(Menu newMenu) {

        Properties prop = new Properties();
        OutputStream output = null;

        try {

            output = new FileOutputStream(menuPrincipalPath);

            for(ItemMenu item : newMenu.getItems()){
                // set the properties value
                //System.out.println(item.getId() + " " + item.getDescripcion());
                prop.setProperty(item.getId(), item.getDescripcion());
            }

            // save properties to project root folder
            prop.store(output, null);

        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    public void createDefaultMenu() {
        Menu newMenu = new Menu();
        newMenu.addItem(new ItemMenu("3", "Salir"));
        newMenu.addItem(new ItemMenu("2", "Configuracion"));
        newMenu.addItem(new ItemMenu("1", "Ejercicios"));
        setMenu(newMenu);
    }

    public boolean checkMenuFile(String path) {

        if(new File(path).exists()){
            return true;
        }else{
            return false;
        }

    }

}
