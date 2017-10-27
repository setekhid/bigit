package xyz.func.setekhid.bigit.simple;

import org.eclipse.jgit.attributes.AttributesNodeProvider;
import org.eclipse.jgit.lib.BaseRepositoryBuilder;
import org.eclipse.jgit.lib.ReflogReader;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.StoredConfig;

import java.io.IOException;


public class SimpleRepository extends Repository {

    protected SimpleRepository(BaseRepositoryBuilder options) {
        super(options);
    }

    @Override
    public void create(boolean bare) throws IOException {

    }

    @Override
    public SimpleObjDatabase getObjectDatabase() {
        return null;
    }

    @Override
    public SimpleRefDatabase getRefDatabase() {
        return null;
    }

    @Override
    public StoredConfig getConfig() {
        return null;
    }

    @Override
    public AttributesNodeProvider createAttributesNodeProvider() {
        return null;
    }

    @Override
    public void scanForRepoChanges() throws IOException {

    }

    @Override
    public void notifyIndexChanged() {

    }

    @Override
    public ReflogReader getReflogReader(String refName) throws IOException {
        return null;
    }
}
