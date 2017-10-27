package xyz.func.setekhid.bigit.simple;

import org.eclipse.jgit.lib.ObjectDatabase;
import org.eclipse.jgit.lib.ObjectInserter;
import org.eclipse.jgit.lib.ObjectReader;


public class SimpleObjDatabase extends ObjectDatabase {

    @Override
    public ObjectInserter newInserter() {
        return null;
    }

    @Override
    public ObjectReader newReader() {
        return null;
    }

    @Override
    public void close() {

    }
}
