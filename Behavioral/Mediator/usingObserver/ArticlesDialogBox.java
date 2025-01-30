package Behavioral.Mediator.usingObserver;

public class ArticlesDialogBox {
    private ListBox articlesListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticlesDialogBox() {
        // articlesListBox.attach(new Observer() {

        // @Override
        // public void update() {
        // articleSelected();
        // }

        // });
        // articlesListBox.attach(() -> articleSelected());
        articlesListBox.attach(this::articleSelected);
        titleTextBox.attach(this::titleChanged);
    }

    public void stimulateUserInteraction() {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: " + titleTextBox.getContent());
        System.out.println("SaveButton: " + saveButton.isEnabled());
    }

    private void titleChanged() {
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }

    private void articleSelected() {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

}
