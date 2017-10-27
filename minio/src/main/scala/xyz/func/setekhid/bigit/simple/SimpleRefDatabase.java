package xyz.func.setekhid.bigit.simple;

import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.RefDatabase;
import org.eclipse.jgit.lib.RefRename;
import org.eclipse.jgit.lib.RefUpdate;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class SimpleRefDatabase extends RefDatabase {

    @Override
    public void create() throws IOException {

    }

    @Override
    public void close() {

    }

    @Override
    public boolean isNameConflicting(String name) throws IOException {
        return false;
    }

    @Override
    public RefUpdate newUpdate(String name, boolean detach) throws IOException {
        return null;
    }

    @Override
    public RefRename newRename(String fromName, String toName) throws IOException {
        return null;
    }

    @Override
    public Ref getRef(String name) throws IOException {
        return null;
    }

    @Override
    public Map<String, Ref> getRefs(String prefix) throws IOException {
        return null;
    }

    @Override
    public List<Ref> getAdditionalRefs() throws IOException {
        return null;
    }

    @Override
    public Ref peel(Ref ref) throws IOException {
        return null;
    }
}
