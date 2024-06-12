package org.com.automusic.playmusics;
import org.bukkit.command.Command;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import java.util.Objects;

public final class Playmusics extends JavaPlugin {
    //默认音乐列表（纯音乐+BGM+普通）
    private static String dcm1 = "";
    private static String dcm2 = "";
    private static String dcm3 = "";
    private static String dcm4 = "";
    private static String dcm5 = "";
    private static String dcm6 = "";
    private static String dcm7 = "";
    private static String dcm8 = "";
    private static String dcm9 = "";
    private static String dcm10 = "";
    private static String dcm11 = "";
    private static String dcm12 = "";
    private static String dcm13 = "";
    private static String dcm14 = "";
    private static String dcm15 = "";
    //纯音乐列表
    private static String pcm1 = "";
    private static String pcm2 = "";
    private static String pcm3 = "";
    private static String pcm4 = "";
    private static String pcm5 = "";
    private static String pcm6 = "";
    private static String pcm7 = "";
    private static String pcm8 = "";
    private static String pcm9 = "";
    private static String pcm10 = "";
    private static String pcm11 = "";
    private static String pcm12 = "";
    private static String pcm13 = "";
    private static String pcm14 = "";
    private static String pcm15 = "";
    //视频BGM音乐列表
    private static String bcm1 = "";
    private static String bcm2 = "";
    private static String bcm3 = "";
    private static String bcm4 = "";
    private static String bcm5 = "";
    private static String bcm6 = "";
    private static String bcm7 = "";
    private static String bcm8 = "";
    private static String bcm9 = "";
    private static String bcm10 = "";
    private static String bcm11 = "";
    private static String bcm12 = "";
    private static String bcm13 = "";
    private static String bcm14 = "";
    private static String bcm15 = "";
    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("play_default")).setExecutor(this);
        Objects.requireNonNull(getCommand("play_puremusic")).setExecutor(this);
        Objects.requireNonNull(getCommand("play_bgm")).setExecutor(this);
        Objects.requireNonNull(getCommand("reloadconfig")).setExecutor(this);
        Objects.requireNonNull(getCommand("mekegg")).setExecutor(this);
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        dcm1 = config.getString("default.cm1");
        dcm2 = config.getString("default.cm2");
        dcm3 = config.getString("default.cm3");
        dcm4 = config.getString("default.cm4");
        dcm5 = config.getString("default.cm5");
        dcm6 = config.getString("default.cm6");
        dcm7 = config.getString("default.cm7");
        dcm8 = config.getString("default.cm8");
        dcm9 = config.getString("default.cm9");
        dcm10 = config.getString("default.cm10");
        dcm11 = config.getString("default.cm11");
        dcm12 = config.getString("default.cm12");
        dcm13 = config.getString("default.cm13");
        dcm14 = config.getString("default.cm14");
        dcm15 = config.getString("default.cm15");

        pcm1 = config.getString("pure.cm1");
        pcm2 = config.getString("pure.cm2");
        pcm3 = config.getString("pure.cm3");
        pcm4 = config.getString("pure.cm4");
        pcm5 = config.getString("pure.cm5");
        pcm6 = config.getString("pure.cm6");
        pcm7 = config.getString("pure.cm7");
        pcm8 = config.getString("pure.cm8");
        pcm9 = config.getString("pure.cm9");
        pcm10 = config.getString("pure.cm10");
        pcm11 = config.getString("pure.cm11");
        pcm12 = config.getString("pure.cm12");
        pcm13 = config.getString("pure.cm13");
        pcm14 = config.getString("pure.cm14");
        pcm15 = config.getString("pure.cm15");

        bcm1 = config.getString("bgm.cm1");
        bcm2 = config.getString("bgm.cm2");
        bcm3 = config.getString("bgm.cm3");
        bcm4 = config.getString("bgm.cm4");
        bcm5 = config.getString("bgm.cm5");
        bcm6 = config.getString("bgm.cm6");
        bcm7 = config.getString("bgm.cm7");
        bcm8 = config.getString("bgm.cm8");
        bcm9 = config.getString("bgm.cm9");
        bcm10 = config.getString("bgm.cm10");
        bcm11 = config.getString("bgm.cm11");
        bcm12 = config.getString("bgm.cm12");
        bcm13 = config.getString("bgm.cm13");
        bcm14 = config.getString("bgm.cm14");
        bcm15 = config.getString("bgm.cm15");
        }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (command.getName().equalsIgnoreCase("play_default")) {
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6开始自动播放...\n--------------------------------------------");
            sender.getServer().dispatchCommand(sender, dcm1);
            sender.getServer().dispatchCommand(sender, dcm2);
            sender.getServer().dispatchCommand(sender, dcm3);
            sender.getServer().dispatchCommand(sender, dcm4);
            sender.getServer().dispatchCommand(sender, dcm5);
            sender.getServer().dispatchCommand(sender, dcm6);
            sender.getServer().dispatchCommand(sender, dcm7);
            sender.getServer().dispatchCommand(sender, dcm8);
            sender.getServer().dispatchCommand(sender, dcm9);
            sender.getServer().dispatchCommand(sender, dcm10);
            sender.getServer().dispatchCommand(sender, dcm11);
            sender.getServer().dispatchCommand(sender, dcm12);
            sender.getServer().dispatchCommand(sender, dcm13);
            sender.getServer().dispatchCommand(sender, dcm14);
            sender.getServer().dispatchCommand(sender, dcm15);
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6已完成!\n--------------------------------------------");
            return true;
        }
        if (command.getName().equalsIgnoreCase("play_puremusic")) {
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6开始自动播放...\n--------------------------------------------");
            sender.getServer().dispatchCommand(sender, pcm1);
            sender.getServer().dispatchCommand(sender, pcm2);
            sender.getServer().dispatchCommand(sender, pcm3);
            sender.getServer().dispatchCommand(sender, pcm4);
            sender.getServer().dispatchCommand(sender, pcm5);
            sender.getServer().dispatchCommand(sender, pcm6);
            sender.getServer().dispatchCommand(sender, pcm7);
            sender.getServer().dispatchCommand(sender, pcm8);
            sender.getServer().dispatchCommand(sender, pcm9);
            sender.getServer().dispatchCommand(sender, pcm10);
            sender.getServer().dispatchCommand(sender, pcm11);
            sender.getServer().dispatchCommand(sender, pcm12);
            sender.getServer().dispatchCommand(sender, pcm13);
            sender.getServer().dispatchCommand(sender, pcm14);
            sender.getServer().dispatchCommand(sender, pcm15);
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6已完成!\n--------------------------------------------");
            return true;
        }
        if (command.getName().equalsIgnoreCase("play_bgm")) {
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6开始自动播放...\n--------------------------------------------");
            sender.getServer().dispatchCommand(sender, bcm1);
            sender.getServer().dispatchCommand(sender, bcm2);
            sender.getServer().dispatchCommand(sender, bcm3);
            sender.getServer().dispatchCommand(sender, bcm4);
            sender.getServer().dispatchCommand(sender, bcm5);
            sender.getServer().dispatchCommand(sender, bcm6);
            sender.getServer().dispatchCommand(sender, bcm7);
            sender.getServer().dispatchCommand(sender, bcm8);
            sender.getServer().dispatchCommand(sender, bcm9);
            sender.getServer().dispatchCommand(sender, bcm10);
            sender.getServer().dispatchCommand(sender, bcm11);
            sender.getServer().dispatchCommand(sender, bcm12);
            sender.getServer().dispatchCommand(sender, bcm13);
            sender.getServer().dispatchCommand(sender, bcm14);
            sender.getServer().dispatchCommand(sender, bcm15);
            sender.sendMessage("§d[AllMusic][非官方附属插件]§6已完成!\n--------------------------------------------");
            return true;
        }
        if (command.getName().equalsIgnoreCase("reloadconfig")) {
            reloadConfig();
            sender.sendMessage("§d[AllMusic][非官方附属插件]§2已重载配置文件!");
            return true;
        }
        else if (command.getName().equalsIgnoreCase("mekegg")) {
            sender.sendMessage("§0-§6-§0-§6-§0-§6-§0-§6-§0-§6-§9[通用机械]§0-§6-§0-§6-§0-§6-§0-§6-§0-§6-\n§8愿原力与你同在\n§0-§6-§0-§6-§0-§6-§0-§6-§0-§6-§9[通用机械]§0-§6-§0-§6-§0-§6-§0-§6-§0-§6-");
            return true;
        }
        return false;
    }
}