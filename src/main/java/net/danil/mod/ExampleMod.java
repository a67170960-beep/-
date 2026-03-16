package net.danil.mod.client.gui;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.LiteralText;
import net.minecraft.client.gui.widget.ButtonWidget;

public class XrayScreen extends Screen {
    public XrayScreen() { super(new LiteralText("Kesha Menu")); }
    @Override
    protected void init() {
        this.addButton(new ButtonWidget(this.width / 2 - 100, 50, 200, 20, new LiteralText("Toggle X-Ray"), (button) -> {
            // Тут скоро будет магия рентгена
        }));
    }
}
