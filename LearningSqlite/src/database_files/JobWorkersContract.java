package database_files;

import android.provider.BaseColumns;

public class JobWorkersContract {
	public static abstract class JobWorkers implements BaseColumns{
		public static final String TABLE_NAME = "job_workers";
		public static final String COLUMN_NAME_ORDERS_ID = "orders_id";
		public static final String COLUMN_NAME_WORKERS_ID = "workers_id";
		public static final String _ID = "_id";
		private static final String TEXT_TYPE = "TEXT";
		private static final String COMMA_SEPARATOR = ",";
		public static final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "(" + _ID + " INTEGER PRIMARY KEY, "+ COLUMN_NAME_ORDERS_ID + 
				" " + TEXT_TYPE + COMMA_SEPARATOR + COLUMN_NAME_WORKERS_ID +" " +TEXT_TYPE+");";
		public static final String  SQL_DELETE_TABLE = "DROP TABLE IF EXISTS "+ TABLE_NAME;
	}

}
