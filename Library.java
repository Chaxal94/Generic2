import java.util.ArrayList;

public class Library<T extends Media> {
    private ArrayList<T> listMedia = new ArrayList<>();
    public void add(int index,T media){
        listMedia.add(listMedia.size()-1, media);
    }
    public void add(T media){
        listMedia.add(media);
    }

    public T get(int index){
        return listMedia.get(index);
    }
    public int size(){
        return listMedia.size();
    }
    public void delete(int index){
      if(index > listMedia.size());
      listMedia.remove(index);
    }
}
