package me.freetymekiyan.smartring.models;

import android.provider.BaseColumns;

/**
 * Created by Kiyan on 2/2/15.
 */
public final class PulseContract {



    public PulseContract() {
    }

    /* Inner class that defines the table contents */
    public static abstract class PulseEntry implements BaseColumns {

        public static final String TABLE_NAME = "pulse_rate";

        public static final String COL_NAME_VAL = "value";

        public static final String COL_NAME_STATE = "state";

        public static final String COL_NAME_MEASURED_TIMESTAMP = "measured_timestamp";

        public static final String COL_NAME_MEASURED_DATE = "measured_date";

        public static final String COL_NAME_AVG_VAL = "avgValue";
    }
}
