package calendar.wgj.com.common.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by wgj on 18-4-16.
 */

public class JeekSQLiteHelper extends SQLiteOpenHelper {

    public JeekSQLiteHelper(Context context){
        super(context, DBConfig.DATABASE_NAME, null, DBConfig.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DBConfig.CREATE_EVENT_SET_TABLE_SQL);
        db.execSQL(DBConfig.CREATE_SCHEDULE_TABLE_SQL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        if(oldVersion != newVersion){
            db.execSQL(DBConfig.DROP_EVNET_SET_TABLE_SQL);
            db.execSQL(DBConfig.DROP_SCHEDULE_TABLE_SQL);
            onCreate(db);
        }
    }
}
