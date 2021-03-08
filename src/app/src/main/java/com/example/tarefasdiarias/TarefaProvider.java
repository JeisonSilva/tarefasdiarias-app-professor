package com.example.tarefasdiarias;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;

public class TarefaProvider extends ContentProvider {
    static final String PROVIDERNAME = "com.example.tarefasdiarias";
    static final String URL = "content://"+PROVIDERNAME+"/tarefas";
    public static final Uri CONTENT_URI = Uri.parse(URL);

    private SQLiteDatabase db;
    static final String NOME_BD = "tarefas.db";
    static final String NOME_TABELA = "tarefasdisponiveis";
    static final int VERSAO_BD = 1;
    static final String CREATE_TABLE = String.format("" +
            "CREATE TABLE %s (" +
            "ID INTEGER NOT NULL, " +
            "TITULO TEXT NOT NULL, " +
            "PROFESSOR TEXT NOT NULL, " +
            "ALUNO TEXT NOT NULL, " +
            "DISCIPLINA TEXT NOT NULL, " +
            "PONTUACAO REAL NOT NULL)", NOME_TABELA);

    static final UriMatcher uriMatcher;

    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDERNAME, "/tarefas", 1);
        uriMatcher.addURI(PROVIDERNAME, "/tarefas/*", 2);
    }

    public TarefaProvider() {
    }



    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return db.delete(NOME_TABELA, selection, selectionArgs);
    }

    @Override
    public String getType(Uri uri) {
        // TODO: Implement this to handle requests for the MIME type of the data
        // at the given URI.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        if(uriMatcher.match(uri) == 1) {
            db.insert(NOME_TABELA, null, values);
            return uri;
        }

        return null;
    }

    @Override
    public boolean onCreate() {
        Context context = getContext();
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        db = databaseHelper.getWritableDatabase();

        if(db != null)
            return true;

        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        return db.query(NOME_TABELA, projection, selection, selectionArgs, null, null, sortOrder);
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        return db.update(NOME_TABELA, values, selection, selectionArgs);
    }

    private static class DatabaseHelper extends SQLiteOpenHelper{
        DatabaseHelper(Context context){
            super(context, NOME_BD, null, VERSAO_BD);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + NOME_TABELA);
            onCreate(sqLiteDatabase);
        }
    }
}
