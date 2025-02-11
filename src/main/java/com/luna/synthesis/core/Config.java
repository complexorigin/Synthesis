package com.luna.synthesis.core;

import com.luna.synthesis.Synthesis;
import gg.essential.vigilance.Vigilant;
import gg.essential.vigilance.data.JVMAnnotationPropertyCollector;
import gg.essential.vigilance.data.Property;
import gg.essential.vigilance.data.PropertyType;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.Loader;

import java.io.File;

public class Config extends Vigilant {

    // Me englando is no bueno.
    // If you find something that could be rewritten to be more concise and clear, let me know

    @Property(
            type = PropertyType.SELECTOR,
            name = "Collection tooltips",
            description = "Cleans some lines on the co-op collection display.",
            category = "Cleanup",
            subcategory = "Co-op",
            options = {
                    "Unchanged",
                    "Empty contributions",
                    "Other people's contributions",
                    "All contributions"
            }
    )
    public int cleanupCoopCollections = 0;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Auction creation",
            description = "Removes co-op auction creation messages.",
            category = "Cleanup",
            subcategory = "Co-op",
            options = {
                    "None",
                    "Own auctions",
                    "Own auctions and show price",
                    "Other people's auctions",
                    "All auctions",
                    "All auctions and show price for own"
            }
    )
    public int cleanupCoopAuctionCreation = 0;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Auction cancellations",
            description = "Removes co-op auction cancellation messages.",
            category = "Cleanup",
            subcategory = "Co-op",
            options = {
                    "None",
                    "Own auctions",
                    "Other people's auctions",
                    "All auctions"
            }
    )
    public int cleanupCoopAuctionCancellation = 0;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Auction collections",
            description = "Removes co-op auction collection messages.",
            category = "Cleanup",
            subcategory = "Co-op",
            options = {
                    "None",
                    "Own auctions",
                    "Other people's auctions",
                    "All auctions"
            }
    )
    public int cleanupCoopAuctionCollection = 0;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Beacon stat changes",
            description = "Removes co-op beacon stat changes messages.",
            category = "Cleanup",
            subcategory = "Co-op",
            options = {
                    "None",
                    "Own changes",
                    "Other people's changes",
                    "All changes"
            }
    )
    public int cleanupCoopBeaconStatChanges = 0;

    @Property(
            type = PropertyType.SWITCH,
            name = "Co-op travel messages",
            description = "Removes the chat message when your coop members travel to another island.",
            category = "Cleanup",
            subcategory = "Co-op"
    )
    public boolean cleanupCoopTravel = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon potion effects message",
            description = "Removes the chat message when you join a dungeon with active potion effects outside.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonPotionEffects = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon class message",
            description = "Removes the chat message when you're the only player using a class.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonSoloClassMessage = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon ultimate message",
            description = "Removes the dungeon reminder that your ultimate is ready to use.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonUltimateMessage = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon blessing stats messages",
            description = "Removes the chat message that shows the stats of the collected blessing.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonBlessingStatMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon blessing messages",
            description = "Also removes the message that a blessing has been obtained, not only stats.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonBlessingMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon silverfish messages",
            description = "Removes the chat message when you hit the silverfish while it's moving.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonSilverfishMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon key usage messages",
            description = "Removes the chat message that explains how to use blood and wither keys.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonKeyUsageMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon watcher messages",
            description = "Removes all watcher messages except for the last one.",
            category = "Cleanup",
            subcategory = "Dungeon"
    )
    public boolean cleanupDungeonWatcherMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove gear score",
            description = "Removes the gear score line.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreGearScore = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove HPB stat bonuses",
            description = "Removes the text of bonus stats from hot/fuming potato books.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreHPB = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove reforge stat bonuses",
            description = "Removes the text of bonus stats from reforge.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreReforge = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove gemstone stat bonuses",
            description = "Removes the text of bonus stats from gemstones.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreGemstones = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove dungeon stat bonuses",
            description = "Removes the text of the weapon's dungeon stats.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreDungeon = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove gemstone icons",
            description = "Removes the line that indicates applied gemstones.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreGemstoneSlots = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove enchantment descriptions",
            description = "Removes the explanation of what each enchantment does when the item has a low amount of enchantments.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreEnchantmentDescriptions = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove enchantments",
            description = "Removes the paragraph of enchantments.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreEnchantments = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove item abilities",
            description = "Removes the item ability text.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreAbilities = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove reforge abilities",
            description = "Removes the reforge ability text.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreReforgeAbility = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove armor full set bonuses",
            description = "Removes the armor full set bonus text.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreFullSetBonus = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove soulbound text",
            description = "Removes the co-op soulbound text.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreSoulbound = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Remove recombobulated obfuscated text",
            description = "Removes the obfuscated text on the rarity of a recombobulated item.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreRecombobulatedObfuscated = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Auction house exception",
            description = "Stops the lore being cleaned up when the auction house menu is opened.",
            category = "Cleanup",
            subcategory = "Lore"
    )
    public boolean cleanupLoreAuctionException = false;

    //FUTURE

    @Property(
            type = PropertyType.SWITCH,
            name = "Keep sent messages",
            description = "Clearing the chat with F3 + D won't clear sent messages from the up and down arrows.",
            category = "Future features"
    )
    public boolean futureKeepSentMessages = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Chunk borders",
            description = "Pressing F3 + G toggles chunk borders.",
            category = "Future features"
    )
    public boolean futureChunkBorders = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Container chat",
            description = "Opens the chat when having a container open.",
            category = "Utilities"
    )
    public boolean utilitiesContainerChat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Resize chat",
            description = "Resizes chat when inside a container for it to fit on the screen.",
            category = "Utilities"
    )
    public boolean utilitiesResizeContainerChat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Reopen chat",
            description = "When a container is closed while typing, reopen chat with what you were typing.",
            category = "Utilities"
    )
    public boolean utilitiesReopenContainerChat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Transfer chat",
            description = "When a container is opened while typing from chat or another container, carry over what you were typing.",
            category = "Utilities"
    )
    public boolean utilitiesTransferContainerChat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Chat search mode",
            description = "Pressing Ctrl + F when chat is open will toggle search mode.",
            category = "Utilities"
    )
    public boolean utilitiesChatSearchMode = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Chat search instant refresh",
            description = "Chat will look for chat messages every key typed instead of only after pressing enter.",
            category = "Utilities"
    )
    public boolean utilitiesChatSearchKeyRefresh = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Search scroll",
            description = "Scrolls to a message when right clicked on while on search mode.",
            category = "Utilities"
    )
    public boolean utilitiesChatScrollClick = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Backpack retexturing",
            description = "Allows you to retexture storage backpacks.",
            category = "Utilities"
    )
    public boolean utilitiesBackpackRetexturing = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "HOTM Perk Level Display",
            description = "Shows perk level as stack size.",
            category = "Utilities"
    )
    public boolean utilitiesPerkLevelDisplay = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "HOTM Max Perk Display",
            description = "Shows perk level as stack size also on maxed perks.",
            category = "Utilities"
    )
    public boolean utilitiesMaxPerkLevelDisplay = false;

    @Property(
            type = PropertyType.SELECTOR,
            name = "Drop chance to drop rate",
            description = "Displays drop chances as drop rates in bestiary.",
            category = "Utilities",
            options = {
                    "None",
                    "Hold shift",
                    "Permanent"
            }
    )
    public int utilitiesDropChanceToDropRate = 0;

    @Property(
            type = PropertyType.SWITCH,
            name = "Bestiary glance",
            description = "Displays bestiary level and progress in the bestiary menu.",
            category = "Utilities"
    )
    public boolean utilitiesBestiaryGlance = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Armadillo fix",
            description = "Stops armadillo blocking the screen when trying to mine blocks.",
            category = "Utilities"
    )
    public boolean utilitiesArmadilloFix = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Wishing compass triangulation",
            description = "Triangulates the location wishing compass points to. Use wishing compass once, wait until the particle trail has disappeared, move away a bit and use it again. Make sure /pq is NOT \"off\".",
            category = "Utilities"
    )
    public boolean utilitiesWishingCompass = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Block wishing compass",
            description = "Blocks using wishing compass if the last trail hasn't disappeared.",
            category = "Utilities"
    )
    public boolean utilitiesBlockWishingCompass = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Wishing compass waypoints",
            description = "Sets a waypoint at the location calculated by wishing compass. Uses Skytils' waypoints.",
            category = "Utilities"
    )
    public boolean utilitiesWishingCompassWaypoint = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Display wishing compass uses left",
            description = "Displays the uses left on wishing compasses.",
            category = "Utilities"
    )
    public boolean utilitiesWishingCompassUsesLeft = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Always display wishing compass uses left",
            description = "Also displays uses left on wishing compasses when they have 3 uses left.",
            category = "Utilities"
    )
    public boolean utilitiesWishingCompassAlwaysUsesLeft = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Visible links",
            description = "Makes clickable links blue and underlined.",
            category = "Utilities"
    )
    public boolean utilitiesVisibleLinks = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Colorless panes",
            description = "Removes the color from glass panes so glass blocks are more visible.",
            category = "Utilities"
    )
    public boolean utilitiesColorlessPanes = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Chat in portal",
            description = "Lets you open and use chat inside a nether portal.",
            category = "Utilities"
    )
    public boolean utilitiesPortalChat = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Better wither impact perspective",
            description = "Toggling third person view will skip the front camera if holding a wither impact weapon.",
            category = "Utilities"
    )
    public boolean utilitiesWitherImpactPerspective = false;

    @Property(
            type = PropertyType.TEXT,
            name = "Share text",
            description = "Hold an item and type the text to show the item to other Synthesis users.",
            category = "Utilities",
            subcategory = "Share"
    )
    public String utilitiesShareText = "[item]";

    @Property(
            type = PropertyType.SWITCH,
            name = "Share scroll",
            description = "Scrolling while hovering a share and holding control will not scroll the chat.",
            category = "Utilities",
            subcategory = "Share"
    )
    public boolean utilitiesShareScroll = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Share copy embed",
            description = "Clicking on shares copies a link to clipboard, that embeds an item preview on discord.",
            category = "Utilities",
            subcategory = "Share"
    )
    public boolean utilitiesShareCopyEmbed = false;

    @Property(
            type = PropertyType.SWITCH,
            name = "Better bridge message",
            description = "Reformats guild bridge messages.",
            category = "Utilities",
            subcategory = "Bridge"
    )
    public boolean utilitiesBridge = false;

    @Property(
            type = PropertyType.TEXT,
            name = "Bridge bot name",
            description = "The IGN of the minecraft account acting as a bridge. Case sensitive.",
            category = "Utilities",
            subcategory = "Bridge",
            min = 1,
            max = 16
    )
    public String utilitiesBridgeBotName = "mmmmBeepBeepBeep";

    @Property(
            type = PropertyType.TEXT,
            name = "Bridge message format",
            description = "The message that will be sent when a message is sent from discord. Use <ign> and <msg> for message sender and message. Use & for color codes.",
            category = "Utilities",
            subcategory = "Bridge"
    )
    public String utilitiesBridgeMessageFormat = "&9[Discord] &6<ign>&r: <msg>";

    @Property(
            type = PropertyType.BUTTON,
            name = "Test bridge message",
            description = "Send in chat a message formatted like the above format. Useful for testing that format.",
            category = "Utilities",
            subcategory = "Bridge",
            placeholder = "Test"
    )
    public void utilitiesBridgeTestFormat() {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(utilitiesBridgeMessageFormat.replaceAll("&", "§").replace("<ign>", "Luna").replace("<msg>", "This is an example message. Thank you for using Synthesis!")));
    }

    @Property(
            type = PropertyType.BUTTON,
            name = "Color code guide",
            description = "Sends a chat message with all formatting codes.",
            category = "Utilities",
            subcategory = "Bridge",
            placeholder = "Show"
    )
    public void utilitiesBridgeColorCodeGuide() {
        for (EnumChatFormatting value : EnumChatFormatting.values()) {
            if (value.getFriendlyName().equals("obfuscated")) {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText( "&" + value.toString().replace("§", "") + " - " + value + value.getFriendlyName()));
            } else {
                Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(value + "&" + value.toString().replace("§", "") + " - " + value.getFriendlyName()));
            }
        }
    }

    @Property(
            type = PropertyType.SWITCH,
            name = "Bridge guild chat tab",
            description = "If using skytils' chattabs, moves formatted bridge messages to the guild tab.",
            category = "Utilities",
            subcategory = "Bridge"
    )
    public boolean utilitiesBridgeGuildChatTab = true;

    @Property(
            type = PropertyType.TEXT,
            name = "Custom cape",
            description = "Use someone else's optifine cape. Only you will see this! Leave empty to not use someone else's cape.",
            category = "Utilities",
            subcategory = "Optifine",
            min = 1,
            max = 16
    )
    public String utilitiesOptifineCustomCape = "";

    @Property(
            type = PropertyType.SWITCH,
            name = "Trans yeti",
            description = "Gives the yeti a trans cape.",
            category = "Utilities",
            subcategory = "Optifine"
    )
    public boolean utilitiesOptifineTransYeti = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Trans terracotta",
            description = "Gives the terracotta a trans cape.",
            category = "Utilities",
            subcategory = "Optifine"
    )
    public boolean utilitiesOptifineTransTerracotta = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Non binary bonzo",
            description = "Gives bonzo a non binary cape.",
            category = "Utilities",
            subcategory = "Optifine"
    )
    public boolean utilitiesOptifineNonBinaryBonzo = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Candy cane grinch",
            description = "Gives the grinch a candy cane cape.",
            category = "Utilities",
            subcategory = "Optifine"
    )
    public boolean utilitiesOptifineCandyCaneGrinch = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Hide santa/witch hat",
            description = "Hides the witch/santa hat given to players with capes on halloween/christmas.",
            category = "Utilities",
            subcategory = "Optifine"
    )
    public boolean utilitiesOptifineHideHats = false;

    //PATCHER

    @Property(
            type = PropertyType.SWITCH,
            name = "Compact chat fix",
            description = "Fixes chat messages not being removed with compact chat when the chat is refreshed.",
            category = "Patcher"
    )
    public boolean patcherCompactChatFix = true;

    @Property(
            type = PropertyType.SWITCH,
            name = "Custom image preview domains",
            description = "Lets you set and use custom domains for Patcher's ImagePreview. Do not add sites you do not trust. Use at own risk.",
            category = "Patcher"
    )
    public boolean patcherCustomImagePreviewer = false;

    @Property(
            type = PropertyType.TEXT,
            name = "Custom domains",
            description = "Look, I'm way too lazy to store this in a json as an array or whatever. It's literally just text why would I care.",
            category = "Patcher",
            hidden = true
    )
    public String patcherCustomDomains = "";

    public Config() {
        super(new File(Synthesis.configLocation), "§dSynthesis", new JVMAnnotationPropertyCollector(), new CustomSortingBehavior());
        initialize();
        setSubcategoryDescription("Utilities", "Share", "A simple way to show your items to other people using the mod. Hold the item, type whatever \"Share text\" is and a preview for your item will be sent.");
        hidePropertyIf("patcherCompactChatFix", () -> !Loader.isModLoaded("patcher"));
        hidePropertyIf("patcherCustomImagePreviewer", () -> !Loader.isModLoaded("patcher"));
        hidePropertyIf("utilitiesShareScroll", () -> !Loader.isModLoaded("text_overflow_scroll"));
        hidePropertyIf("utilitiesWishingCompassWaypoint", () -> !Loader.isModLoaded("skytils"));
        addDependency("utilitiesWishingCompassWaypoint", "utilitiesWishingCompass");
        addDependency("utilitiesBlockWishingCompass", "utilitiesWishingCompass");
        addDependency("cleanupDungeonBlessingMessages", "cleanupDungeonBlessingStatMessages");
        registerListener("utilitiesColorlessPanes", (z) -> Minecraft.getMinecraft().renderGlobal.loadRenderers());
    }
}