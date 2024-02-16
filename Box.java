import java.util.ArrayList;
import java.util.List;
class Thing{
    private String name;
    private int place;

    public Thing(String name){
        this.name = name;
    }
    public void place(int objet){
        this.place+=objet;   
    }
    public int getvolume(){
        return this.place;
    }
    public String getName(){
        return this.name;
    }

    public void setName(String mot){
        this.name=mot;
    }

    public String hasName(){
        if (this.getName()!=""){
            return this.getName();
        }
        else{
            return "l'objet n'a pas de nom";
        }
    }
}   








class Box{
    List<Thing> contents;
    private boolean ouvert;
    private int capacité;


    public Box(){
        contents = new ArrayList<Thing>();
        this.ouvert = false;
        this.capacité=-1;
    }
    public Box(boolean ouvert){
        contents = new ArrayList<Thing>();
        this.ouvert = true;
        this.capacité=0;
    }
    public void add(String truc){
        Thing val =new Thing(truc);
        this.contents.add(val);}

    public boolean contains(Thing obj){
        for (Thing i : this.contents){
            if (i==obj){
                return true;
            }
        }
        return false;
    }


    public boolean remove(Thing obj){
        try {
            return this.remove(obj);}
        catch(IndexOutOfBoundsException affichage){
            affichage.printStackTrace();
            return false;}
        finally{
            System.out.println("fin");}}
    
    public boolean isOpen(){
        if (this.isOpen()==true)
            return true;
        return false;}
    public boolean close(){
        if (this.close()==false)
            return false;
        return true;}

    public String actionLook(){
        if (this.isOpen()==false){
            return  "la boite est fermee";
        }
        else{
            String phrase="";
            for (Thing mot :this.contents){
                phrase+=mot;
            }
            return  "la boite contient:"+','+phrase;
        }
    }

    public int setCapacity(int cap){
        return this.capacité=cap;
    }
    public int getCapacity(){
        return this.capacité;
    }

    public boolean hasRoomFor(Thing obj){
        if (this.capacité-obj.getvolume()>0){
            return true;
        }
        else{
            return false;
        }
    }


    public boolean actionAdd(Thing obj){
        try{
            if (hasRoomFor(obj) && this.getCapacity()-obj.getvolume()>0 ){ 
                this.setCapacity(this.getCapacity()-obj.getvolume());
                return true;}
            return false;
        }
        
        catch (IndexOutOfBoundsException affichage){
            affichage.printStackTrace();
            return false;}
        finally{
            System.out.println("fin");}
        }

    }
    
