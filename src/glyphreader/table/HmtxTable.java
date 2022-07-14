/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glyphreader.table;

import glyphreader.map.HmtxData;
import glyphreader.map.Table;
import static glyphreader.map.Table.TableType.HMTX;
import glyphreader.map.TableList;
import glyphreader.map.TableRecord;
import glyphreader.read.BinaryMapReader;
import java.util.ArrayList;

/**
 *
 * @author jmburu
 */
public class HmtxTable implements Table{
    public ArrayList<HmtxData> hmtxData = null;
    
    private final TableRecord record;
    
    public HmtxTable()
    {
        hmtxData = new ArrayList();
        record = new TableRecord();
    }

    @Override
    public void read(BinaryMapReader file, TableList tables) {
        
        int tableOffset = record.offset;
        file.seek(tableOffset);
        
        //for
        System.out.println("kubafu");
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
