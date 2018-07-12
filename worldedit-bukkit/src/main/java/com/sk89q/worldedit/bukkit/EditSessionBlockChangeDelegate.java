/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.bukkit;

import com.sk89q.worldedit.EditSession;

/**
 * Proxy class to catch calls to set blocks.
 */
public class EditSessionBlockChangeDelegate {//implements BlockChangeDelegate {

    private EditSession editSession;

    public EditSessionBlockChangeDelegate(EditSession editSession) {
        this.editSession = editSession;
    }

    // TODO This needs a fix in Spigot itself

//    @Override
//    public boolean setRawTypeId(int x, int y, int z, int typeId) {
//        try {
//            return editSession.setBlock(new Vector(x, y, z), LegacyMapper.getInstance().getBlockFromLegacy(typeId));
//        } catch (MaxChangedBlocksException ex) {
//            return false;
//        }
//    }
//
//    @Override
//    public boolean setRawTypeIdAndData(int x, int y, int z, int typeId, int data) {
//        try {
//            return editSession.setBlock(new Vector(x, y, z), LegacyMapper.getInstance().getBlockFromLegacy(typeId, data));
//        } catch (MaxChangedBlocksException ex) {
//            return false;
//        }
//    }
//
//    @Override
//    public boolean setTypeId(int x, int y, int z, int typeId) {
//        return setRawTypeId(x, y, z, typeId);
//    }
//
//    @Override
//    public boolean setTypeIdAndData(int x, int y, int z, int typeId, int data) {
//        return setRawTypeIdAndData(x, y, z, typeId, data);
//    }
//
//    @Override
//    public int getTypeId(int x, int y, int z) {
//        int[] datas = LegacyMapper.getInstance().getLegacyFromBlock(editSession.getBlock(new Vector(x, y, z)));
//        return datas[0];
//    }
//
//    @Override
//    public int getHeight() {
//        return editSession.getWorld().getMaxY() + 1;
//    }
//
//    @Override
//    public boolean isEmpty(int x, int y, int z) {
//        return editSession.getBlock(new Vector(x, y, z)).getBlockType() == BlockTypes.AIR;
//    }

}
