package org.opendaylight.yang.gen.v1.urn.opendaylight.packet.address.tracker.config.rev160621 ;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import java.util.Set;
import java.util.Collections;
import java.io.InputStream;
import java.io.IOException;
public final class $YangModuleInfoImpl implements YangModuleInfo {

    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final java.lang.String name = "address-tracker-config";
    private final java.lang.String namespace = "urn:opendaylight:packet:address-tracker-config";
    private final java.lang.String revision = "2016-06-21";
    private final java.lang.String resourcePath = "/META-INF/yang/address-tracker-config.yang";

    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    private $YangModuleInfoImpl() {
        importedModules = Collections.emptySet();
    
        InputStream stream = $YangModuleInfoImpl.class.getResourceAsStream(resourcePath);
        if (stream == null) {
            throw new IllegalStateException("Resource '" + resourcePath + "' is missing");
        }
        try {
            stream.close();
        } catch (IOException e) {
        // Resource leak, but there is nothing we can do
        }
    }
    
    @Override
    public java.lang.String getName() {
        return name;
    }
    
    @Override
    public java.lang.String getRevision() {
        return revision;
    }
    
    @Override
    public java.lang.String getNamespace() {
        return namespace;
    }
    
    @Override
    public InputStream getModuleSourceStream() throws IOException {
        InputStream stream = $YangModuleInfoImpl.class.getResourceAsStream(resourcePath);
        if (stream == null) {
            throw new IOException("Resource " + resourcePath + " is missing");
        }
        return stream;
    }
    
    @Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.getClass().getCanonicalName());
        sb.append("[");
        sb.append("name = " + name);
        sb.append(", namespace = " + namespace);
        sb.append(", revision = " + revision);
        sb.append(", resourcePath = " + resourcePath);
        sb.append(", imports = " + importedModules);
        sb.append("]");
        return sb.toString();
    }
    
    
}
