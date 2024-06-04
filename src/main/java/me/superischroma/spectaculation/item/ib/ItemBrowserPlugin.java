package me.superischroma.spectaculation.item.ib;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import com.avaje.ebean.enhance.asm.Label;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import me.superischroma.spectaculation.item.ib.ItemBrowserPlugin.CustomItem;

public class ItemBrowserPlugin extends JavaPlugin {
    private List<CustomItem> customItems = new ArrayList<>();

    @Override
    public void onEnable() {
        // Register custom items
        customItems.add(new CustomItem("lol", "A lol sword", 1, new ItemStack(Material.DIAMOND_SWORD)));
        customItems.add(new CustomItem("fr Pickaxe", "A fr pickaxe", 2, new ItemStack(Material.DIAMOND_PICKAXE)));

        // Create a GUI component for the item list
        Bukkit.getScheduler().runTask(this, () -> {
            // Create a text field for searching items
            TextField searchField = new TextField();
            searchField.setPromptText("Search for items...");

            // Create a label to display the selected item
            Label selectedItemLabel = new Label("Selected Item: ");

            // Create a vertical box layout to hold the GUI components
            VBox root = new VBox(10);
            root.setPadding(new Insets(10));
            root.getChildren().addAll(searchField, selectedItemLabel);

            // Set up the scene and stage
            Scene scene = new Scene(root, 400, 300);
            Stage primaryStage = new Stage();
            primaryStage.setTitle("Item Browser");
            primaryStage.setScene(scene);
            primaryStage.show();

            // Populate the item list with custom items
            List<String> itemList = new ArrayList<>();
            for (CustomItem customItem : customItems) {
                itemList.add(customItem.getName());
            }

            // Set up the search functionality
            searchField.textProperty().addListener((observable, oldValue, newValue) -> {
                itemList.clear();
                for (CustomItem customItem : customItems) {
                    if (customItem.getName().contains(newValue)) {
                        itemList.add(customItem.getName());
                    }
                }
            });

            // Set up the selection functionality
            selectedItemLabel.textProperty().addListener((observable, oldValue, newValue) -> {
                CustomItem customItem = getCustomItem(itemList.indexOf(newValue));
                selectedItemLabel.setText("Selected Item: " + customItem.getName() + " (" + customItem.getDescription() + ")");
            });
        });
    }

    private CustomItem getCustomItem(int index) {
        return customItems.get(index);
    }

    public static class CustomItem {
        private String name;
        private String description;
        private int id;
        private ItemStack itemStack;

        public CustomItem(String name, String description, int id, ItemStack itemStack) {
            this.name = name;
            this.description = description;
            this.id = id;
            this.itemStack = itemStack;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }
}