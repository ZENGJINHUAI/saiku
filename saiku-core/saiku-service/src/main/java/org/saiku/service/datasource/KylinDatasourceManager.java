package org.saiku.service.datasource;

import org.saiku.database.dto.MondrianSchema;
import org.saiku.datasources.connection.RepositoryFile;
import org.saiku.datasources.datasource.SaikuDatasource;
import org.saiku.repository.AclEntry;
import org.saiku.repository.IRepositoryObject;
import org.saiku.service.importer.JujuSource;
import org.saiku.service.user.UserService;

import javax.jcr.RepositoryException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * Created by jinhuai.zeng on 17年8月9日.
 */
public class KylinDatasourceManager implements IDatasourceManager {
    @Override public void load() {

    }

    @Override public void unload() {

    }

    @Override public SaikuDatasource addDatasource(SaikuDatasource datasource) throws Exception {
        return null;
    }

    @Override public SaikuDatasource setDatasource(SaikuDatasource datasource) throws Exception {
        return null;
    }

    @Override public List<SaikuDatasource> addDatasources(List<SaikuDatasource> datasources) {
        return null;
    }

    @Override public boolean removeDatasource(String datasourceName) {
        return false;
    }

    @Override public boolean removeSchema(String schemaName) {
        return false;
    }

    @Override public Map<String, SaikuDatasource> getDatasources() {
        return null;
    }

    @Override public SaikuDatasource getDatasource(String datasourceName) {
        return null;
    }

    @Override public SaikuDatasource getDatasource(String datasourceName, boolean refresh) {
        return null;
    }

    @Override public void addSchema(String file, String path, String name) throws Exception {

    }

    @Override public List<MondrianSchema> getMondrianSchema() {
        return null;
    }

    @Override public MondrianSchema getMondrianSchema(String catalog) {
        return null;
    }

    @Override public RepositoryFile getFile(String file) {
        return null;
    }

    @Override public String getFileData(String file, String username, List<String> roles) {
        return null;
    }

    @Override public String getInternalFileData(String file) throws RepositoryException {
        return null;
    }

    @Override public InputStream getBinaryInternalFileData(String file) throws RepositoryException {
        return null;
    }

    @Override public String saveFile(String path, Object content, String user, List<String> roles) {
        return null;
    }

    @Override public String removeFile(String path, String user, List<String> roles) {
        return null;
    }

    @Override public String moveFile(String source, String target, String user, List<String> roles) {
        return null;
    }

    @Override public String saveInternalFile(String path, Object content, String type) {
        return null;
    }

    @Override public String saveBinaryInternalFile(String path, InputStream content, String type) {
        return null;
    }

    @Override public void removeInternalFile(String filePath) {

    }

    @Override public List<IRepositoryObject> getFiles(List<String> type, String username, List<String> roles) {
        return null;
    }

    @Override public List<IRepositoryObject> getFiles(List<String> type, String username, List<String> roles,
            String path) {
        return null;
    }

    @Override public void createUser(String user) {

    }

    @Override public void deleteFolder(String folder) {

    }

    @Override public AclEntry getACL(String object, String username, List<String> roles) {
        return null;
    }

    @Override public void setACL(String object, String acl, String username, List<String> roles) {

    }

    @Override public void setUserService(UserService userService) {

    }

    @Override public List<MondrianSchema> getInternalFilesOfFileType(String type) {
        return null;
    }

    @Override public void createFileMixin(String type) throws RepositoryException {

    }

    @Override public byte[] exportRepository() {
        return new byte[0];
    }

    @Override public void restoreRepository(byte[] data) {

    }

    @Override public boolean hasHomeDirectory(String name) {
        return false;
    }

    @Override public void restoreLegacyFiles(byte[] data) {

    }

    @Override public String getFoodmartschema() {
        return null;
    }

    @Override public void setFoodmartschema(String schema) {

    }

    @Override public void setFoodmartdir(String dir) {

    }

    @Override public String getFoodmartdir() {
        return null;
    }

    @Override public String getDatadir() {
        return null;
    }

    @Override public void setDatadir(String dir) {

    }

    @Override public void setFoodmarturl(String foodmarturl) {

    }

    @Override public String getFoodmarturl() {
        return null;
    }

    @Override public String getEarthquakeUrl() {
        return null;
    }

    @Override public String getEarthquakeDir() {
        return null;
    }

    @Override public String getEarthquakeSchema() {
        return null;
    }

    @Override public void setEarthquakeUrl(String earthquakeUrl) {

    }

    @Override public void setEarthquakeDir(String earthquakeDir) {

    }

    @Override public void setEarthquakeSchema(String earthquakeSchema) {

    }

    @Override public void setExternalPropertiesFile(String file) {

    }

    @Override public String[] getAvailablePropertiesKeys() {
        return new String[0];
    }

    @Override public List<JujuSource> getJujuDatasources() {
        return null;
    }
}
