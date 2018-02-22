package nuclearscience.block.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import nuclearscience.block.NuclearScienceBlocks;

public class ItemBlockLapotronStorage extends ItemBlock {

	public ItemBlockLapotronStorage(Block block) {
		super(NuclearScienceBlocks.lapotronStorage);
	}

	@Override
	public void addInformation(ItemStack item, EntityPlayer player, List list, boolean p_77624_4_) {
		list.add("Output: 4096 EU/t Capacity: 100M EU");
		if (item.hasTagCompound()) {
			NBTTagCompound nbt = item.getTagCompound();
			if (nbt.hasKey("energy")) {
				list.add("Store: " + (int) nbt.getDouble("energy") + " EU");
			}
		} 
	}

}
