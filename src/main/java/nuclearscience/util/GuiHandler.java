package nuclearscience.util;

import com.sun.org.apache.bcel.internal.generic.NEW;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import nuclearscience.gui.GuiLapotronStorage;
import nuclearscience.gui.NuclearScienceGUI;
import nuclearscience.gui.container.ContainerLapotronStorage;
import nuclearscience.tile.TileEntityLaptronStorage;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
		case NuclearScienceGUI.lapotronStorage:
			return new ContainerLapotronStorage(player.inventory,
					(TileEntityLaptronStorage) world.getTileEntity(x, y, z));
		default:
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch (ID) {
		case NuclearScienceGUI.lapotronStorage:
			return new GuiLapotronStorage(new ContainerLapotronStorage(player.inventory,
					(TileEntityLaptronStorage) world.getTileEntity(x, y, z)));
		default:
			return null;
		}
	}

}