
package loginandregister;
import loginandregister.Login;


public class Main {
    public static void main(String[] args) {
 
        BookStorage bookstorage = new BookStorage();
        UserStorage userstorage = new UserStorage();
 
        // Preset books
        Book whichOne = new Book("Which One", "Erich", 100);
        whichOne.setBorrowed(true);
        bookstorage.addBook(whichOne);
        bookstorage.addBook(new Book("Fracture", "Remneck", 300));
        bookstorage.addBook(new Book("Castle in the Sky", "Hayao Miyazaki", 351));
        bookstorage.addBook(new Book("Grave of the Fireflies", "Isao Takahata", 377));
        bookstorage.addBook(new Book("My Neighbor Totoro", "Hayao Miyazaki", 290));
        bookstorage.addBook(new Book("Kiki's Delivery Service", "Hayao Miyazaki", 164));
        bookstorage.addBook(new Book("Only Yesterday", "Isao Takahata", 615));
        bookstorage.addBook(new Book("Porco Rosso", "Hayao Miyazaki", 428));
        bookstorage.addBook(new Book("Pom Poko", "Isao Takahata", 283));
        bookstorage.addBook(new Book("Whisper of the Heart", "Yoshifumi Kondo", 739));
        bookstorage.addBook(new Book("Princess Mononoke", "Hayao Miyazaki", 321));
        bookstorage.addBook(new Book("My Neighbors the Yamadas", "Isao Takahata", 283));
        bookstorage.addBook(new Book("Spirited Away", "Hayao Miyazaki", 349));
        bookstorage.addBook(new Book("The Cat Returns", "Hiroyuki Morita", 387));
        bookstorage.addBook(new Book("Howl's Moving Castle", "Hayao Miyazaki", 218));
        bookstorage.addBook(new Book("Tales from Earthsea", "Goro Miyazaki", 692));
        bookstorage.addBook(new Book("Ponyo", "Hayao Miyazaki", 733));
        bookstorage.addBook(new Book("Arrietty", "Hiromasa Yonebayashi", 240));
        bookstorage.addBook(new Book("From Up on Poppy Hill", "Goro Miyazaki", 490));
        bookstorage.addBook(new Book("The Wind Rises", "Hayao Miyazaki", 160));
        bookstorage.addBook(new Book("The Tale of the Princess Kaguya", "Isao Takahata", 212));
        bookstorage.addBook(new Book("When Marnie Was There", "Hiromasa Yonebayashi", 356));
        bookstorage.addBook(new Book("The Red Turtle", "Michael Dudok de Wit", 542));
        bookstorage.addBook(new Book("Earwig and the Witch", "Goro Miyazaki", 109));
 
        new Login(bookstorage, userstorage).setVisible(true);
    }
}
