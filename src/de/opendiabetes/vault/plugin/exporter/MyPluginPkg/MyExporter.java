/*
 * Copyright (C) 2017 OpenDiabetes
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.opendiabetes.vault.plugin.exporter.MyPluginPkg;

import de.opendiabetes.vault.container.RawEntry;
import de.opendiabetes.vault.container.VaultEntry;
import de.opendiabetes.vault.plugin.exporter.Exporter;
import de.opendiabetes.vault.plugin.importer.Importer;
import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

import java.util.List;
import java.util.Properties;

/**
 * Wrapper class for the MyImporter plugin.
 *
 * @author Magnus Gärtner
 */
public class MyExporter extends Plugin {

    /**
     * Constructor for the PluginManager.
     *
     * @param wrapper The PluginWrapper.
     */
    public MyExporter(final PluginWrapper wrapper) {
        super(wrapper);
    }

    /**
     * Actual implementation of the Medtronic importer plugin.
     */
    @Extension
    public static class MyExporterImplementation implements Exporter {

        @Override
        public void setExportFilePath(String s) {
            System.out.println("MyExporter set the export file path to: "+s);
        }

        @Override
        public String getExportFilePath() {
            return null;
        }

        @Override
        public void setAdditional(Object o) throws IllegalArgumentException {

        }

        @Override
        public int exportDataToFile(List<VaultEntry> list) {
            return 0;
        }

        @Override
        public boolean loadConfiguration(Properties properties) {
            return false;
        }

        @Override
        public void registerStatusCallback(StatusListener statusListener) {

        }
    }


}
