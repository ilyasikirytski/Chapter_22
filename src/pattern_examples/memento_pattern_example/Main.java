package pattern_examples.memento_pattern_example;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        //играем
        game.set("LVL 1", 35124);
        System.out.println(game);
        // сохраняемся
        File file = new File();
        file.setSave(game.save());
        //играем дальше
        game.set("LVL 2", 65554);
        System.out.println(game);
        //проиграли - нужно загрузить первый уровень
        game.load(file.getSave());
        System.out.println(game);
    }
}
