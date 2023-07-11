import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotClass extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update.getMessage().getText());
        System.out.println(update.getMessage().getChatId());
    }

    @Override
    public String getBotUsername() {
        // TODO
        return "ABRNHBOT";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "764655976:AAEcOy-PffyGZbELd3AL7XWwjVYcMB9aEZI";
    }
}
