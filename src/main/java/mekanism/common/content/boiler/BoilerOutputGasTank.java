package mekanism.common.content.boiler;

import mekanism.api.gas.GasStack;
import mekanism.common.tile.multiblock.TileEntityBoilerCasing;

import javax.annotation.Nullable;

public class BoilerOutputGasTank extends BoilerGasTank {

    public BoilerOutputGasTank(TileEntityBoilerCasing tileEntity) {
        super(tileEntity);
    }

    @Override
    @Nullable
    public GasStack getGas() {
        return multiblock.structure != null ? multiblock.structure.OutputGas : null;
    }

    @Override
    public void setGas(GasStack stack) {
        if (multiblock.structure != null) {
            multiblock.structure.OutputGas = stack;
        }
    }

    @Override
    public int getMaxGas() {
        return multiblock.structure != null ? multiblock.structure.steamVolume * BoilerUpdateProtocol.STEAM_PER_TANK : 0;
    }
}
