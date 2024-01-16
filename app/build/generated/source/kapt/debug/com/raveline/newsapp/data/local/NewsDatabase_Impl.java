package com.raveline.newsapp.data.local;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDatabase_Impl extends NewsDatabase {
  private volatile NewsDao _newsDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ARTICLES_TABLE` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `source` TEXT NOT NULL, `author` TEXT, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `url` TEXT NOT NULL, `urlToImage` TEXT NOT NULL, `publishedAt` TEXT NOT NULL, `content` TEXT NOT NULL, `isStored` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c81f236b4e86700811dcd4df44757307')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ARTICLES_TABLE`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      public void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsARTICLESTABLE = new HashMap<String, TableInfo.Column>(10);
        _columnsARTICLESTABLE.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("source", new TableInfo.Column("source", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("author", new TableInfo.Column("author", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("urlToImage", new TableInfo.Column("urlToImage", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("publishedAt", new TableInfo.Column("publishedAt", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("content", new TableInfo.Column("content", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsARTICLESTABLE.put("isStored", new TableInfo.Column("isStored", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysARTICLESTABLE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesARTICLESTABLE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoARTICLESTABLE = new TableInfo("ARTICLES_TABLE", _columnsARTICLESTABLE, _foreignKeysARTICLESTABLE, _indicesARTICLESTABLE);
        final TableInfo _existingARTICLESTABLE = TableInfo.read(_db, "ARTICLES_TABLE");
        if (! _infoARTICLESTABLE.equals(_existingARTICLESTABLE)) {
          return new RoomOpenHelper.ValidationResult(false, "ARTICLES_TABLE(com.raveline.newsapp.domain.model.ArticleModel).\n"
                  + " Expected:\n" + _infoARTICLESTABLE + "\n"
                  + " Found:\n" + _existingARTICLESTABLE);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "c81f236b4e86700811dcd4df44757307", "2e2b0c6d5f263553485e1256bf94bdc1");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ARTICLES_TABLE");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ARTICLES_TABLE`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(NewsDao.class, NewsDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public NewsDao getNewsDao() {
    if (_newsDao != null) {
      return _newsDao;
    } else {
      synchronized(this) {
        if(_newsDao == null) {
          _newsDao = new NewsDao_Impl(this);
        }
        return _newsDao;
      }
    }
  }
}
