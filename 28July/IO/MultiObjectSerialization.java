package IO;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

    public class MultiObjectSerialization {
        static String file = "Movie.txt";
        static ObjectOutputStream os;
        static ObjectInputStream is;

        public static void main(String[] args) throws IOException,
                ClassNotFoundException {
            Movie a = new Movie(1, "ABC");
            Movie m = new Movie(2, "XYZ");

            List<Object> lmovies = new ArrayList<>();
            lmovies.add(a);
            lmovies.add(m);
            writeToFile(lmovies);
            readFile();

        }

        public static void writeToFile(List<Object> lmovies) throws IOException {
            os = new ObjectOutputStream(new FileOutputStream(file));
            os.writeObject(lmovies);
            os.close();

        }

        public static void readFile() throws ClassNotFoundException, IOException {
            is = new ObjectInputStream(new FileInputStream(file));
            List<Object> input = (List<Object>) is.readObject();
           
            // this will contain the list of the objects
            for (Object l : input) {
               
                if (l instanceof Movie) {
                    Movie app = (Movie) l;
                    System.out.print(app.id +" "+app.name);
                    System.out.println();
                }
              }
          

            is.close();
        }
    }

    class Movie implements Serializable {
        private static final long serialVersionUID = 1L;
        int id;
        String name;

        public Movie(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    