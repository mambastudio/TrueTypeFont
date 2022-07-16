/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glyphreader.table;

import glyphreader.map.AbstractTable;
import glyphreader.map.HmtxData;
import static glyphreader.map.Table.TableType.HMTX;
import glyphreader.map.TableList;
import glyphreader.map.TableRecord;
import glyphreader.read.BinaryMapReader;
import java.util.ArrayList;

/**
 *
 * @author jmburu
 */
public class HmtxTable extends AbstractTable{
    public ArrayList<HmtxData> hmtxData = null;
    
    public HmtxTable(TableRecord record)
    {
        super(record);
        hmtxData = new ArrayList();        
    }

    @Override
    public boolean read(BinaryMapReader file, TableList tables) {
        
        int tableOffset = record.offset;
        file.seek(tableOffset);
        
        //for
        return false;
    }

    @Override
    public TableRecord getRecord() {
        return record;
    }

    @Override
    public TableType getType() {
        return HMTX;
    }
}
