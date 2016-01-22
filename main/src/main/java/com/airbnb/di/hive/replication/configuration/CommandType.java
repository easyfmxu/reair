package com.airbnb.di.hive.replication.configuration;

/**
 * List of possible command types in the Hive audit log.
 */
public enum CommandType {
  ALTERDATABASE, ALTERPARTITION_LOCATION, ALTERPARTITION_PROTECTMODE,
  ALTERPARTITION_SERDEPROPERTIES, ALTERPARTITION_SERIALIZER,
  ALTERTABLE_ADDCOLS, ALTERTABLE_ADDPARTS, ALTERTABLE_CLUSTER_SORT,
  ALTERTABLE_DROPPARTS, ALTERTABLE_FILEFORMAT, ALTERTABLE_LOCATION,
  ALTERTABLE_PROPERTIES, ALTERTABLE_RENAME, ALTERTABLE_RENAMECOL,
  ALTERTABLE_REPLACECOLS, ALTERTABLE_SERDEPROPERTIES, ALTERTABLE_SERIALIZER,
  ALTERTABLE_TOUCH, CREATEDATABASE, CREATEFUNCTION, CREATETABLE,
  CREATETABLE_AS_SELECT, CREATEVIEW, DESCDATABASE, DESCFUNCTION, DESCTABLE,
  DROPDATABASE, DROPTABLE, DROPVIEW, EXPORT, LOAD, MSCK, QUERY, SHOWCOLUMNS,
  SHOWDATABASES, SHOWFUNCTIONS, SHOWLOCKS, SHOWPARTITIONS, SHOWTABES,
  SHOW_CREATETABLE, SHOW_TABLESTATUS, SHOW_TBLPROPERTIES, SWITCHDATABASE,
  TRUNCATETABLE, UNLOCKTABLE,
}
