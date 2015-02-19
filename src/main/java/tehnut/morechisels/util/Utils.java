package tehnut.morechisels.util;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.awt.*;

public class Utils {

    /**
     * @param stack  - The ItemStack.
     * @param energy - Energy to set stack to.
     * @return - The ItemStack with an energy tag.
     */
    public static ItemStack setNewEnergyTag(ItemStack stack, int energy) {
        if (stack.stackTagCompound == null)
            stack.setTagCompound(new NBTTagCompound());

        if (stack.stackTagCompound != null && stack.stackTagCompound.getInteger("Energy") <= 0)
            stack.stackTagCompound.setInteger("Energy", energy);

        return stack;
    }

    /**
     * Inserts spaces into a string if a capital is found after a lowercase.
     *
     * @param input - String to split.
     *
     * @return - split string IE: camelCase to camel Case
     */

    public static String splitAtCapital(String input) {
        return input.replaceAll("(\\p{Ll})(\\p{Lu})", "$1 $2");
    }

    public static int getColorFromWhitelist(String entry) {
        String[] split = entry.split(":");

        if (split.length == 3)
            return Color.decode(split[2]).getRGB();
        else
            return 150;
    }
}