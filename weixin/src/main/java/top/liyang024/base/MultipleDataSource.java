package top.liyang024.base;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource{
	private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }
	@Override
	public Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		return dataSourceKey.get();
	}

}
